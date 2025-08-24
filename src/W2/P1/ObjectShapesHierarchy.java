package W2.P1;

public class ObjectShapesHierarchy {

    // Shape.java
    public static abstract class Shape {
        protected int numberOfDimensions;
        public int getNumberOfDimensions() { return numberOfDimensions; }
    }

    // TwoDimensionalShape.java
    public static abstract class TwoDimensionalShape extends Shape {
        public TwoDimensionalShape() { numberOfDimensions = 2; }
        public abstract double getArea();
    }

    // ThreeDimensionalShape.java
    public static abstract class ThreeDimensionalShape extends Shape {
        public ThreeDimensionalShape() { numberOfDimensions = 3; }
        public abstract double getVolume();
    }

    // Circle.java
    public static class Circle extends TwoDimensionalShape {
        private final double radius;
        public Circle(double radius) {
            if (radius <= 0) throw new IllegalArgumentException("Radius must be positive.");
            this.radius = radius;
        }
        @Override public double getArea() { return Math.PI * radius * radius; }
    }
    public static class Rectangle extends TwoDimensionalShape {
        private final double length;
        private final double width;
        public Rectangle(double length, double width) {
            if (length <= 0 || width <= 0) throw new IllegalArgumentException("Length and width must be positive.");
            this.length = length;
            this.width = width;
        }
        @Override public double getArea() { return length * width; }
    }
    public static class Square extends TwoDimensionalShape {
        private final double side;
        public Square(double side) {
            if (side <= 0) throw new IllegalArgumentException("Side must be positive.");
            this.side = side;
        }
        @Override public double getArea() { return side * side; }
    }
    public static class Triangle extends TwoDimensionalShape {
        private final double base;
        private final double height;
        public Triangle(double base, double height) {
            if (base <= 0 || height <= 0) throw new IllegalArgumentException("Base and height must be positive.");
            this.base = base;
            this.height = height;
        }
        @Override public double getArea() { return 0.5 * base * height; }
    }
    public static class Sphere extends ThreeDimensionalShape {
        private final double radius;
        public Sphere(double radius) {
            if (radius <= 0) throw new IllegalArgumentException("Radius must be positive.");
            this.radius = radius;
        }
        @Override public double getVolume() { return 4.0 / 3.0 * Math.PI * radius * radius * radius; }
    }
    public static class Cube extends ThreeDimensionalShape {
        private final double side;
        public Cube(double side) {
            if (side <= 0) throw new IllegalArgumentException("Side must be positive.");
            this.side = side;
        }
        @Override public double getVolume() { return side * side * side; }
    }
    public static class Cone extends ThreeDimensionalShape {
        private final double radius;
        private final double height;
        public Cone(double radius, double height) {
            if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be positive.");
            this.radius = radius;
            this.height = height;
        }
        @Override public double getVolume() { return Math.PI * radius * radius * height / 3.0; }
    }
    public static class Cylinder extends ThreeDimensionalShape {
        private final double radius;
        private final double height;
        public Cylinder(double radius, double height) {
            if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be positive.");
            this.radius = radius;
            this.height = height;
        }
        @Override public double getVolume() { return Math.PI * radius * radius * height; }
    }
    public static class Torus extends ThreeDimensionalShape {
        private final double majorRadius;
        private final double minorRadius;
        public Torus(double majorRadius, double minorRadius) {
            if (majorRadius <= 0 || minorRadius <= 0) throw new IllegalArgumentException("Major and minor radii must be positive.");
            this.majorRadius = majorRadius;
            this.minorRadius = minorRadius;
        }
        @Override public double getVolume() { return 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius; }
    }
}
