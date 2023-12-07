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
  parent2ChildMap.set(child, cSet)

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
export function getParentsByChild(child: string) {
  return Array.from(child2ParentMap.get(child) ?? [])
}

export function getAllParents(){
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
  return Array.from(child2ParentMap.get(type) ?? []);
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
   return Array.from(new Set([...child2ParentMap.keys(), ...parent2ChildMap.keys() ]))
}