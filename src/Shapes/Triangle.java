/*
Triangle.java
Spencer Renfro
8-23-2025
Purpose: Create a Triangle class that extends TwoDimensionalShape and implements getArea()
*/

package Shapes;

public class Triangle extends TwoDimensionalShape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}