import debug from "debug"
import { ToKotlinClass, kotlinKeywordMap, noImplRootList } from "./constant"
import { findAllChildrenByParent, getRoot } from "./extend-relaction"
import { ClassDiscriminatorMap } from "./variables"

export const k = debug('swc:kotlin')

export const SerialNameWhiteList = ['CallExpression']

function getDiscriminator(klassName: string) {
    let discriminator = 'type'
    const root = getRoot(klassName);
    if (root && ClassDiscriminatorMap.has(root)) {
        discriminator = ClassDiscriminatorMap.get(root) ?? 'type'
    }
    return discriminator
}
export class KotlinClassProperty {
    modifier: string = 'var'
    name: string = ''
    type: string = ''
    comment: string = ''
    defaultValue: string = ''
    isOverride: boolean = false
    discriminator: string = 'type'
    clone() {
        const prop = new KotlinClassProperty()
        prop.modifier = this.modifier
        prop.name = this.name
        prop.type = this.type
        prop.comment = this.comment
        prop.defaultValue = this.defaultValue
        prop.isOverride = this.isOverride
        return prop;
    }
    toString() {
        return [
            this.comment ? this.comment + '\n' : '',
            this.name === this.discriminator ? '  // conflict with @SerialName\n  //' : '',
            this.isOverride ? '  override' : ' ',
            ' var ',
            kotlinKeywordMap.has(this.name) ? kotlinKeywordMap.get(this.name) : this.name,
            this.type ? [
                ': ',
                this.type,
                '?'].join('') : ''
        ].join('')
    }

    toStringWithValue() {
        return [
            this.name === this.discriminator ? '  // conflict with @SerialName\n  //' : '',
            '  ',
            this.isOverride ? 'override' : '',
            ' var ',
            kotlinKeywordMap.has(this.name) ? kotlinKeywordMap.get(this.name) : this.name,
            this.type ? [' : ', this.type, '?'].join('') : '',
            ' = ',
            this.defaultValue ? this.defaultValue : 'null'
        ].join('')
    }
}
export class KotlinClass {
    klassName: string = '';
    headerComment: string = ''
    annotations: string[] = []
    modifier: string = ''
    parents: string[] = []
    properties: KotlinClassProperty[] = []

    toString() {
        if (this.modifier.includes('interface')) {
            return this.toInterfaceString().join('\n')
        }
        return this.toClassString().join('\n')
    }
    toInterfaceString() {
        return [
            this.headerComment,
            ...this.annotations,
            `${this.modifier} ${this.klassName}`
            + (this.parents.length ? ` : ${this.parents.join(', ')}` : '')
            + ' {',
            ...this.properties.map(p => p.toString()),
            '}'
        ]

    }

    toClassString() {
        return [
            this.headerComment,
            ...this.annotations,
            `${this.modifier} ${this.klassName}`
            + (this.parents.length ? ` : ${this.parents.join(', ')}` : '')
            + ' {',
            ...this.properties.map(p => p.toStringWithValue()),
            '}'
        ]
    }

    toInterface() {
        let discriminator = getDiscriminator(this.klassName)
        const klass = new KotlinClass()
        klass.klassName = this.klassName
        klass.headerComment = this.headerComment
        klass.annotations = []
        klass.modifier = this.modifier
        klass.parents = this.parents
        klass.properties = this.properties.map(p => (p.clone())).map(p => {
            p.defaultValue = ''
            p.discriminator = discriminator
            return p
        })
        return klass
    }

    toClass() {
        let discriminator = getDiscriminator(this.klassName)
        const klass = new KotlinClass()
        klass.klassName = this.klassName
        klass.headerComment = this.headerComment
        klass.annotations = this.annotations
        klass.modifier = this.modifier
        klass.parents = this.parents
        klass.properties = this.properties.map(p => p.clone()).map(p => (p.discriminator = discriminator, p))
        return klass
    }

    toImplClass() {
        let discriminator = getDiscriminator(this.klassName)
        let serialName = this.properties.find(p => p.name === discriminator)?.defaultValue || `"${this.klassName}"`
        if (SerialNameWhiteList.includes(serialName)) {
            serialName = this.klassName
        }
        const klass = new KotlinClass()
        klass.annotations = this.annotations
        klass.annotations.push(
            '@OptIn(ExperimentalSerializationApi::class)',
            '@SwcDslMarker',
            '@Serializable',
            `@JsonClassDiscriminator("${discriminator}")`,
            `@SerialName(${serialName})`,
        )
        klass.klassName = `${this.klassName}Impl`
        klass.headerComment = this.headerComment
        klass.annotations = this.annotations
        klass.modifier = 'class'
        klass.parents = [this.klassName]
        klass.properties = this.properties.map(p => p.clone()).map(p => {
            p.isOverride = true;
            p.discriminator = discriminator
            return p
        })
        return klass
    }
}


export function mergeKotlinProperties(source: KotlinClassProperty[], target: KotlinClassProperty[]) {
    const nameSet = new Set()
    source.forEach(k => nameSet.add(k.name))
    target.forEach(k => {
        if (!nameSet.has(k.name)) {
            nameSet.add(k.name)
            source.push(k.clone())
        }
    })
}

export function kotlinPropertiesAddOverride(list: KotlinClassProperty[]) {
    return list.map(k => k.clone()).map(k => (k.isOverride = true, k))
}

const d = debug('swc:dsl')


function toFunName(str: string) {
    const name = (str[0].toLowerCase() + str.slice(1))
    d('%s to kotlin function name ==> %s', str, name)
    if (kotlinKeywordMap.has(name)) return kotlinKeywordMap.get(name)
    return name
}


let noImplClassList: string[] | null = null
function getNoImplClassList() {
    if (noImplClassList == null) {
        noImplClassList = Array.from(new Set(
            noImplRootList.map(root => findAllChildrenByParent(root)).flat()))
    }
    return noImplClassList!!
}
export class KotlinExtensionFun {
    constructor(public receiver: string = '', public funName: string = '') { }

    toString() {
        let funName = this.funName
        const noImpl = funName.replace('Impl', '')
        if (getNoImplClassList().includes(funName)) {
            funName = funName.replace('Impl', '')
        }
        return [
            `fun ${this.receiver}.${toFunName(noImpl)}(block: ${noImpl}.() -> Unit): ${funName.replace('Impl', '')} {`,
            `  return ${funName}().apply(block)`,
            `}`,
        ].join('\n')
    }
}

const extFunMap = new Map<string, KotlinExtensionFun>();
export function addExtensionFun(extFun: KotlinExtensionFun) {
    if (extFun.receiver !== extFun.funName) {
        extFunMap.set(`${extFun.receiver} - ${extFun.funName.replace('Impl', '')}`, extFun)
    }
}

export function getAllExtensionFun() {
    return Array.from(extFunMap.values())
}