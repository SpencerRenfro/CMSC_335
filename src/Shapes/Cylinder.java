/*
Cylinder.java
Spencer Renfro
8-23-2025
Purpose: Create a Cylinder class that extends ThreeDimensionalShape and implements getVolume()
*/

package Shapes;

public class Cylinder extends ThreeDimensionalShape {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}