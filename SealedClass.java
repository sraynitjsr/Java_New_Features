public sealed class Shape
    permits Circle, Square, Triangle {

    public abstract double area();

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(6.0, 8.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
        System.out.println("Triangle Area: " + triangle.area());
    }
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

final class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
