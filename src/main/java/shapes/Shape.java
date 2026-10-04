package shapes;

/**
 * Abstract superclass representing a geometric shape.
 * Demonstrates encapsulation, abstraction, and inheritance in Java.
 *
 * @author Sudan Pudasaini / Mark Dixon
 */
public abstract class Shape {

    /**
     * Number of sides of the shape.
     */
    private int sides;

    /**
     * Gets the number of sides.
     *
     * @return the number of sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * Sets the number of sides.
     *
     * @param sides the number of sides (must be non-negative)
     */
    public void setSides(int sides) {
        if (sides < 0) {
            throw new IllegalArgumentException("Sides cannot be negative");
        }
        this.sides = sides;
    }

    /**
     * Calculates the area of the shape.
     *
     * @return the calculated area
     */
    public abstract double getArea();

    /**
     * Calculates the perimeter (or circumference) of the shape.
     *
     * @return the calculated perimeter
     */
    public abstract double getPerimeter();

    /**
     * Constructor for Shape.
     *
     * @param sides the number of sides
     */
    public Shape(int sides) {
        if (sides < 0) {
            throw new IllegalArgumentException("Sides cannot be negative");
        }
        this.sides = sides;
    }
}
