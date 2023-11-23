package org.JavaHW;
import java.lang.Math;
public class Rectangle {
    private double width;
    private double height;
    private final double angle = 90.0;

    public Rectangle() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAngle() {
        return angle;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public static void main(String[] args) {

    // Default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Default constructor result:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Angle: " + rectangle1.getAngle());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle1.getDiagonal());

    // Constructor
        Rectangle rectangle2 = new Rectangle(22.0, 11.0);
        System.out.println("Constructor with width and height:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Angle: " + rectangle2.getAngle());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle2.getDiagonal());

        // Setters and getters
        rectangle2.setWidth(20.0);
        rectangle2.setHeight(10.0);
        System.out.println("Setting width and height:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Diagonal: " + rectangle2.getDiagonal());


    }

}

