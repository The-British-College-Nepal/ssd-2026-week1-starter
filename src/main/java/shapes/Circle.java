package shapes;

/**
 * Concrete implementation of a Circle shape.
 * Extends {@link Shape}.
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Gets the radius of the circle.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius radius of the circle (must be positive)
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Area = pi * r^2
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // Circumference = 2 * pi * r
        return 2 * Math.PI * radius;
    }

    /**
     * Constructor for Circle.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        super(0); // A circle has 0 straight sides
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.radius = radius;
    }
}
