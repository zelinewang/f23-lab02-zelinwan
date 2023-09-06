package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        // So every time if you wanna do a different shape,
        // you could just make a new shape interface subclass,
        // then put that into your render which takes interface Shape

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
