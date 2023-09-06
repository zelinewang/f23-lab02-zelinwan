import { newRectangle } from "./shapes/rectangle.js";

function newRenderer(width: number, height: number) {
    return {
        draw() {
            const area: number = newRectangle(height, width).computeArea()
            console.log("Shape drawn\n" + "Its area is " + area)
        }
    }
}

export { newRenderer }