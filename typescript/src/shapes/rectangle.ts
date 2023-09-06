interface Rectangle {
    computeArea: () => number
}

function newRectangle(width: number, height: number): Rectangle {
    return {
        computeArea: function (): number {
            return width * height
        }
    }
}

export { newRectangle }
