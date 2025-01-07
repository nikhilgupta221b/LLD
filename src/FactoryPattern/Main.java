package FactoryPattern;

import FactoryPattern.Factory.ShapeFactory;
import FactoryPattern.Shapes.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        // Create a Rectangle
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
