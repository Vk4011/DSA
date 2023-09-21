package Abstraction;
class Abstractdemo{
    public static void main(String[] args) {
        System.out.println("\n\t Abstraction \n");
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("\tCircle Area      : " + circle.calculateArea());
        System.out.println("\tCircle Perimeter : " + circle.calculatePerimeter());

        System.out.println("\tRectangle Area     : " + rectangle.calculateArea());
        System.out.println("\tRectangle Perimeter: " + rectangle.calculatePerimeter());

        
    }
}

// Abstract class representing a Shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double calculateArea();
    
    // Abstract method for calculating perimeter
    abstract double calculatePerimeter();
}

// Concrete class representing a Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}



                output:

                 Abstraction 

        Circle Area      : 78.53981633974483
        Circle Perimeter : 31.41592653589793
        Rectangle Area     : 24.0
        Rectangle Perimeter: 20.0

        