import debug from "debug"
import { ToKotlinClass, kotlinKeywordMap, noImplRootList } from "./constant"
import { findAllChildrenByParent, getCommonParent, getRoot } from "./extend-relationship"
import { ClassDiscriminatorMap } from "./variables"
import { removeComment } from "./utils"

export const k = debug('swc:kotlin')

export const SerialNameWhiteList = ['OptionalChainingCall', 'BindingIdentifier', 'TemplateLiteral', 'CallExpression', 'Identifier', 'TemplateLiteral']

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

    isArray() {
        return this.type.startsWith('Array<')
    }
    getType() {
        let type = this.type
        if (this.isArray()) {
            type = this.type.match(/Array<(.+)>/)?.[1] ?? this.type
        }
        if (type.startsWith('Union.U')) {
            return this.type
                .match(/Union\.U\d<([^>]+)>/)?.[1]?.split(',')
                ?.map(s => s.trim()) ?? [type]
        }
        return [type]
    }
    getAnnotation() {
        const actualType = removeComment(this.getActualType()).replace('<', '').replace('>', '')

        if (actualType.startsWith('Booleanable')) {
            return `@Serializable(${actualType}Serializer::class)\n  `
        }
        return ''
    }

    private _actualType = ''
    getActualType() {
        if (this._actualType) return this._actualType
        const that = this;
        let type = this.type.trim()
        if (type.startsWith('Array<')) {
            const innerType = type.match(/Array<(.+)>/)?.[1]
            if (innerType) {
                type = processUnion(innerType)!!
                this._actualType = `Array<${type}>`

                return `Array<${type}>`
            }
            this._actualType = type
            return type
        }
        function processUnion(t: string) {

            if (t.includes('Union.U')) {

                const types = removeComment(t)
                    .match(/Union\.U\d<([^>]+)>/)?.[1]?.split(',')
                    ?.map(s => s.trim()) ?? []
                    
                if (types.includes('Boolean')) {
                    if (types?.length == 2) {
                        const anotherType = types.find(t => t !== 'Boolean') ?? 'String'
                        return `Booleanable${anotherType.replace('<', '').replace('>', '')}`
                    }
                    if (types?.length === 3) {
                        const anotherType = types.filter(t => t !== 'Boolean') ?? []
                        if (anotherType[1].includes(`Array<${anotherType[0]}`)) {
                            return `Booleanable${anotherType[1].replace('<', '').replace('>', '')}`
                        }

                    }
                }

                if (!t.includes('Boolean')
                    && !t.includes('String')
                    && !t.includes('Int')
                    && !t.includes('Array<')) {

                    return getCommonParent(types ?? [])
                }
            }
            return t
        }
        this._actualType = processUnion(type)!!
        return that._actualType 
    }
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
        const type = this.getActualType()
        const annotation = this.getAnnotation()
        return [
            this.comment ? this.comment + '\n' : '',
            annotation ? annotation : '',
            this.name === this.discriminator ? '  // conflict with @SerialName\n  //' : '',
            this.isOverride ? ' override ' : ' ',
            ' var ',
            kotlinKeywordMap.has(this.name) ? kotlinKeywordMap.get(this.name) : this.name,
            type ? [': ', type, '?'].join('') : ''
        ].join('')
    }

    toStringWithValue() {
        const type = this.getActualType()
        const annotation = this.getAnnotation()
        return [
            this.name === this.discriminator ? '  // conflict with @SerialName\n  //' : '',
            '  ',
            annotation ? annotation : '',
            this.isOverride ? 'override' : '',
            ' var ',
            kotlinKeywordMap.has(this.name) ? kotlinKeywordMap.get(this.name) : this.name,
            type ? [' : ', type, '?'].join('') : '',
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

    clone() {
        const kClass = new KotlinClass()
        kClass.klassName = this.klassName
        kClass.headerComment = this.headerComment
        kClass.annotations = this.annotations.map(s => s)
        kClass.modifier = this.modifier
        kClass.parents = this.parents.map(s => s)
        kClass.properties = this.properties.map(p => p.clone())
        return kClass
    }

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
        klass.annotations = ['@SwcDslMarker']
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
        if (SerialNameWhiteList.includes(this.klassName)) {
            serialName = `"${this.klassName}"`
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

const e = debug('swc:ext')


function toFunName(str: string) {
    const name = (str[0].toLowerCase() + str.slice(1))
    // e('%s to kotlin function name ==> %s', str, name)
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
    constructor(
        public receiver: string = '',
        public funName: string = '',
        private comments: string = '',
    ) { }

    toString() {
        let funName = this.funName
        const noImpl = funName.replace('Impl', '')
        if (getNoImplClassList().includes(funName)) {
            funName = funName.replace('Impl', '')
        }
        return [
            this.comments,
            `fun ${this.receiver}.${toFunName(noImpl)}(block: ${noImpl}.() -> Unit): ${funName.replace('Impl', '')} {`,
            `  return ${funName}().apply(block)`,
            `}`,
        ].join('\n')
    }
}

const extFunMap = new Map<string, KotlinExtensionFun>();
export function addExtensionFun(extFun: KotlinExtensionFun) {
    if (extFun.receiver !== extFun.funName) {
        e('add extension function %s.%s()', extFun.receiver, toFunName(extFun.funName))
        extFunMap.set(`${extFun.receiver} - ${extFun.funName.replace('Impl', '')}`, extFun)
    }
}

export function getAllExtensionFun() {
    return Array.from(extFunMap.values())
}