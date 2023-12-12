

export function removeComment(str: string) {
    if (!str) return str
    return str.replace(/\/\*(.|\r\n|\n)*?\*\//, '')
}