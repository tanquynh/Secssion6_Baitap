package Secssion6_baitap1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
        System.out.println(circle.display());

        scanner.close();
    }
}
