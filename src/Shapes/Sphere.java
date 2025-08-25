/*
Sphere.java
Spencer Renfro
8-23-2025
Purpose: Create a Sphere class that extends ThreeDimensionalShape and implements getVolume()
*/
package Shapes;

public class Sphere extends ThreeDimensionalShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}