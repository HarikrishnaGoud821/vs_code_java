package Abstractclass2;
abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    double radius;
    public Circle(double r)
    {
        System.out.println("Circle....,");
        radius = r;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;
    public Rectangle(double l, double b) {
        System.out.println("Rectangle...,");
        length = l;
        breadth = b;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
    public double area() {
        return length * breadth;
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Shape s = r;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        Shape c = new Circle(15);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
    }