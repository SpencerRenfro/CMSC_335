package W2.P1.Shapes;

public class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side must be positive.");
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}