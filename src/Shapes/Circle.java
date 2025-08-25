/*
Circle.java
Spencer Renfro
8-23-2025
Purpose: Create a Circle class that extends TwoDimensionalShape and implements getArea()
*/

package Shapes;

public class Circle extends TwoDimensionalShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}