package W2.P1.Shapes;

public class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}