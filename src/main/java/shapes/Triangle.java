package shapes;

/**
 * Concrete implementation of a Triangle shape.
 * Extends {@link Shape}.
 */
public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        // Heron's formula
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Constructor for Triangle with triangle inequality check.
     *
     * @param sideA length of side a
     * @param sideB length of side b
     * @param sideC length of side c
     */
    public Triangle(double sideA, double sideB, double sideC) {
        super(3);
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Sides must be positive numbers");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Invalid triangle: violated triangle inequality theorem");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
