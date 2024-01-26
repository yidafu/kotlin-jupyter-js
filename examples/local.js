console.log('local message')

export const foo = 123;

export function functionName() { }
export class ClassName { }

const var3 = true;
const var4 = {}
const var5 = "default"
export { var3, var4 as obj, var5 as default }

const obj = {a: 1, b: 2};
export const { a, b: c } = obj;

export default "123"

export default function () { }

export default class Xxx { }
