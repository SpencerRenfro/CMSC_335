package W2.P1.Shapes;

public class Cone extends ThreeDimensionalShape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }
}