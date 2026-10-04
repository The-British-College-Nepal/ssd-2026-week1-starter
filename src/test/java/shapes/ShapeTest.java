package shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Automated JUnit 5 tests for Week 1 Shape hierarchy.
 */
class ShapeTest {

    @Test
    @DisplayName("Square: Area and Perimeter calculation")
    void testSquareCalculations() {
        Square sq = new Square(4.0);
        assertEquals(4, sq.getSides(), "Square must have 4 sides");
        assertEquals(16.0, sq.getArea(), 0.001, "Square area must equal size^2");
        assertEquals(16.0, sq.getPerimeter(), 0.001, "Square perimeter must equal 4 * size");
    }

    @Test
    @DisplayName("Square: Invalid negative size throws IllegalArgumentException")
    void testSquareInvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-5.0));
        assertThrows(IllegalArgumentException.class, () -> new Square(0.0));
    }

    @Test
    @DisplayName("Circle: Area and Perimeter calculation")
    void testCircleCalculations() {
        Circle circle = new Circle(2.0);
        assertEquals(0, circle.getSides(), "Circle must have 0 straight sides");
        assertEquals(Math.PI * 4.0, circle.getArea(), 0.001);
        assertEquals(2 * Math.PI * 2.0, circle.getPerimeter(), 0.001);
    }

    @Test
    @DisplayName("Circle: Invalid negative radius throws IllegalArgumentException")
    void testCircleInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-2.0));
        assertThrows(IllegalArgumentException.class, () -> new Circle(0.0));
    }

    @Test
    @DisplayName("Triangle: Area (Heron's formula) and Perimeter")
    void testTriangleCalculations() {
        Triangle tri = new Triangle(3.0, 4.0, 5.0);
        assertEquals(3, tri.getSides(), "Triangle must have 3 sides");
        assertEquals(12.0, tri.getPerimeter(), 0.001);
        assertEquals(6.0, tri.getArea(), 0.001);
    }

    @Test
    @DisplayName("Triangle: Triangle inequality violation throws IllegalArgumentException")
    void testTriangleInequality() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1.0, 2.0, 10.0));
    }

    @Test
    @DisplayName("Polymorphic behavior via Shape reference")
    void testPolymorphism() {
        Shape shape = new Square(5.0);
        assertEquals(25.0, shape.getArea(), 0.001);
    }
}
