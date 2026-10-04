package shapes;

/**
 * Concrete implementation of a Square shape.
 * Extends {@link Shape}.
 */
public class Square extends Shape {

    private double size;

    /**
     * Gets the size (width/height) of the square.
     *
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the square.
     *
     * @param size size of the square (must be positive)
     */
    public void setSize(double size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Square size must be greater than zero");
        }
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getPerimeter() {
        return 4 * size;
    }

    /**
     * Constructor for Square.
     *
     * @param size length of each side
     */
    public Square(double size) {
        super(4); // A square always has 4 sides
        if (size <= 0) {
            throw new IllegalArgumentException("Square size must be greater than zero");
        }
        this.size = size;
    }
}
