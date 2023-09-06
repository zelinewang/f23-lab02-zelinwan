function circle(radius: number): Shape {
    return {
        computeArea: function (): number {
            return Math.PI * radius * radius * 0.5
        }
    }
}
