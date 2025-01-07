package FactoryPattern.Factory;

import FactoryPattern.Shapes.Circle;
import FactoryPattern.Shapes.Rectangle;
import FactoryPattern.Shapes.Shape;

public class ShapeFactory {

    // Factory method to create shapes
    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "Circle":
                return new Circle();

            case "Rectangle":
                return new Rectangle();

            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}
