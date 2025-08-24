package W2.P1.Shapes;

public class Torus extends ThreeDimensionalShape {
    private final double majorRadius; // R
    private final double minorRadius; // r

    public Torus(double majorRadius, double minorRadius) {
        if (majorRadius <= 0 || minorRadius <= 0) {
            throw new IllegalArgumentException("Major and minor radii must be positive.");
        }
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius;
    }
}