/*
Triangle.java
Spencer Renfro
8-23-2025
Purpose: Create an abstract TwoDimensionalShape class that extends Shape and implements getArea()
*/

package Shapes;

public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape() {
        this.numberOfDimensions = 2;
    }
    public abstract double getArea();
}
