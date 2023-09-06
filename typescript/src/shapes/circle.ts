function circle(radius: number): Shape {
    return {
        radius,
        computeArea: function (): number {
            return Math.PI * radius * radius * 0.5
        }
    }
}

export { circle }
