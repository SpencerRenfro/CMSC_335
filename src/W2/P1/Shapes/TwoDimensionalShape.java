package W2.P1.Shapes;

public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape() {
        this.numberOfDimensions = 2;
    }

    public abstract double getArea();
}
