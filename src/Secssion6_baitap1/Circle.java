package Secssion6_baitap1;

public class Circle {
    double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    // Thêm phương thức tính chu vi hình tròn
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String display() {
        return "Circle with radius " + radius + " has an area of " + getArea() + " and a perimeter of " + getPerimeter();
    }
}
