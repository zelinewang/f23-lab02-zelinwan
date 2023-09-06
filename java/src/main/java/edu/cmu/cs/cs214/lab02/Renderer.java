package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;
    
    // Renderer(double height, double width) {
    //     this.rectangle = new Rectangle(height, width);
    // }

    // BUT WHAT IF you want to render other shapes? 
    // make Renderer a class using all the shapes! use the INTERFACE!!
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
