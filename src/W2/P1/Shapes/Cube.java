package W2.P1.Shapes;

public class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}