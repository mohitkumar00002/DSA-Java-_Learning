// 
package Polymorphism;

class Shape {
    double area(double a, double b) {
        System.out.println("Calculating area in Shape class");
        return 0;
    }
}

class Rectangle extends Shape {
    @Override
    double area(double length, double breadth) {
        return length * breadth;
    }
}

class Triangle extends Shape {
    @Override
    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class RunTimePolymorphismWithParams {
    public static void main(String[] args) {
        Shape s; // parent reference

        s = new Rectangle();
        System.out.println("Area of Rectangle: " + s.area(10, 5));

        s = new Triangle();
        System.out.println("Area of Triangle: " + s.area(10, 5));
    }
}
