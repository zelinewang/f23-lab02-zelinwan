package edu.cmu.cs.cs214.lab02;

public class Main {
    public static void main(String[] args) {
        double height = 2;
        double width = 3;
        // Rectangle rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(height, width);

        renderer.draw();
    }
}
