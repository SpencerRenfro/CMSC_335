/*
ThreeDimensionalShape.java
Spencer Renfro
8-23-2025
Purpose: Create an abstract ThreeDimensionalShape class that extends Shape and implements getVolume()
*/

package Shapes;

public abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape() {
        this.numberOfDimensions = 3;
    }

    public abstract double getVolume();
}