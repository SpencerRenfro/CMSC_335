/*
Square.java
Spencer Renfro
8-23-2025
Purpose: Create a Square class that extends TwoDimensionalShape and implements getArea()
*/

package Shapes;

public class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}