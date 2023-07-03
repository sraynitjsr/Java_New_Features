package com.sray;

public sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double calculateArea();
}

final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

final class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Shape triangle = new Triangle(3, 8);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
