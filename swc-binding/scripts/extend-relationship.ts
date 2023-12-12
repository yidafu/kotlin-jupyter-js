import debug from "debug";

const log = debug('swc:relation')

export const nodeExtendsList: Array<[/* 父类型 */string,/* 子类型 */string]> = []

export const child2ParentMap = new Map<string, Set<string>>();
export const parent2ChildMap = new Map<string, Set<string>>();

export function addRelation(parent: string, child: string) {
    log('add relation ==> %s extends %s', child, parent)
    const pSet = child2ParentMap.get(child) ?? new Set();
    pSet.add(parent)
    child2ParentMap.set(child, pSet)

    const cSet = parent2ChildMap.get(parent) ?? new Set();
    cSet.add(child)
    parent2ChildMap.set(parent, cSet)

    nodeExtendsList.push([parent, child])
}
export function isGrandChild(child: string) {
    return findAllChildrenByParent(child).length === 0
}

export function getRoot(child: string): string | undefined {
    const list = child2ParentMap.get(child)
    if (list && list.size > 0) {
        for (const type of list) {
            const isRoot = getRoot(type)
            if (isRoot) return isRoot;
        }
        return undefined
    } else {
        return child
    }
}
export function findParentsByChild(child: string) {
    return Array.from(child2ParentMap.get(child) ?? [])
}

export function findAllParentByChild(child: string) {
    const result: string[] = []
    findParentsByChild(child).forEach(p => {
        result.push(p)
        result.push(...findAllParentByChild(p))
    })
    return Array.from(new Set(result))
}

export function getAllParents() {
    return Array.from(parent2ChildMap.keys())
}

export function getAllChildren() {
    return Array.from(child2ParentMap.keys())
}

export function findAllGrandChildren(type: string): string[] {
    const result: string[] = []
    const childTypes = nodeExtendsList.filter(i => i[0] === type).map(i => i[1])
    if (childTypes.length) {
        childTypes.forEach(c => {
            result.push(...findAllGrandChildren(c))
        })
    } else {
        result.push(type)
    }
    return Array.from(new Set(result));
}

export function findAllDirectChildren(type: string): string[] {
    return Array.from(parent2ChildMap.get(type) ?? []);
}

export function findAllChildrenByParent(type: string): string[] {
    const result: string[] = []
    const childTypes = nodeExtendsList.filter(i => i[0] === type).map(i => i[1])
    result.push(...childTypes)
    if (childTypes.length) {
        childTypes.forEach(c => {
            result.push(...findAllChildrenByParent(c))
        })
    }
    return Array.from(new Set(result));
}

export function getAll() {
    return Array.from(new Set([...child2ParentMap.keys(), ...parent2ChildMap.keys()]))
}

export function findAllRelativeByName(node: string): string[] {
    const children = findAllGrandChildren(node)
    const result: string[] = []
    children.forEach(c => {
        result.push(c)
        result.push(...findAllParentByChild(c))
    })
    return Array.from(new Set(result))
}


export function getCommonParent(children: string[]) {
    const child2ParentPathMap = new Map<string, string[]>();
    children.forEach(child => {
        child2ParentPathMap.set(child, getPathWithFound(child))
    })
    const parentPathList = Array.from(child2ParentPathMap.values())
    const distanceMap = new Map<string, number>()
    const allParentTypes = new Set(parentPathList.flat())
    allParentTypes.forEach(pType => {
        let maxDistance = -1
        parentPathList.forEach(list => {
            maxDistance = Math.max(maxDistance, list.indexOf(pType))
        })
        distanceMap.set(pType, maxDistance)
    })
    // console.log(distanceMap)
    let commonType = 'Node'
    let minDistance = 999
    Array.from(distanceMap.entries()).forEach(([k, v]) => {
        // console.log(k, v, minDistance, v < minDistance)
        if (v <= minDistance) {
            commonType = k
            minDistance = v
        }
    })
    // console.log(commonType)
    return commonType
}

export function getPathWithFound(child: string) {
    const path2Node = Array.from(new Set(getPathWithOrder('Node', child) ?? [child]))
    const pSet = child2ParentMap.get(child) ?? new Set();
    pSet.forEach(p => {
        if (!path2Node.includes(p) && p !== 'HasSpan') {
            path2Node.unshift(p)
        }
    })
    return path2Node
}
export function getPathWithOrder(node: string, child: string): string[] | undefined {
    const cSet = parent2ChildMap.get(node) ?? new Set()
    if (cSet?.has(child)) {
        return [child, node]
    } else {
        for (const c of cSet ) {
            const res = getPathWithOrder(c, child)
            if (res) {
                return [c, ...res]
            }
        }
    }
    return undefined
}