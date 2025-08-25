/*
Shape.java
Spencer Renfro
8-23-2025
Purpose: Creates an abstract Shape class that extends Object and implements getNumberOfDimensions()
*/

package Shapes;

public abstract class Shape {
    protected int numberOfDimensions;

    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }
}