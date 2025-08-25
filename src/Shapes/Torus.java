/*
Torus.java
Spencer Renfro
8-23-2025
Purpose: Create a Torus class that extends ThreeDimensionalShape and implements getVolume()
*/

package Shapes;

public class Torus extends ThreeDimensionalShape {
    private final double majorRadius; // R
    private final double minorRadius; // r

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius;
    }
}