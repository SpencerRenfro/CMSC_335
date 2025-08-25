/*
Cube.java
Spencer Renfro
8-23-2025
Purpose: Create a Cube class that extends ThreeDimensionalShape and implements getVolume()
*/

package Shapes;

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