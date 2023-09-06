package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Renderer {
    private Rectangle rectangle;
    
    Renderer(double height, double width) {
        this.rectangle = new Rectangle(height, width);
    }

    void draw() {
        double area = rectangle.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
