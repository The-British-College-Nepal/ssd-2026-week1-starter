package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver program demonstrating Object-Oriented Polymorphism.
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("💻 SSD Week 1: Polymorphic Shape Execution");
        System.out.println("==================================================");

        // Polymorphic list holding various subclasses of Shape
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(5.0));
        shapeList.add(new Circle(3.0));
        shapeList.add(new Triangle(3.0, 4.0, 5.0));

        // Dynamic method dispatch
        for (Shape shape : shapeList) {
            System.out.printf("Type: %-10s | Sides: %d | Perimeter: %8.2f | Area: %8.2f%n",
                    shape.getClass().getSimpleName(),
                    shape.getSides(),
                    shape.getPerimeter(),
                    shape.getArea());
        }
        System.out.println("==================================================");
    }
}
