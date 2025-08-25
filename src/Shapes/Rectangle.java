/*
Rectangle.java
Spencer Renfro
8-23-2025
Purpose: Create a Rectangle class that extends TwoDimensionalShape and implements getArea()
*/

package Shapes;

public class Rectangle extends TwoDimensionalShape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}