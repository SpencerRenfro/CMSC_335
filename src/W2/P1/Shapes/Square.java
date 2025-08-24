package W2.P1.Shapes;

public class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side must be positive.");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}