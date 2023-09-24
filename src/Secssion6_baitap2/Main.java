package Secssion6_baitap2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();
        if(a == 0 && b == 0 && c==0 ) {
            System.out.println("Phương trình vô số nghiệm.");
        } else if ( a==0 && b==0 && c!=0 ) {
            System.out.println("Phương trình vô nghiệm.");
        } else if ( a==0 && b!=0 && c!=0 ) {
            System.out.println("Phương trình có nghiệm là ." + -c/b);
        } else {
            if (discriminant > 0) {
                double root1 = equation.getRoot1();
                double root2 = equation.getRoot2();
                System.out.println("Nghiệm 1: " + root1);
                System.out.println("Nghiệm 2: " + root2);
            } else if (discriminant == 0) {
                double root1 = equation.getRoot1();
                System.out.println("Nghiệm duy nhất: " + root1);
            } else {
                System.out.println("Phương trình không có nghiệm thực.");
            }
        }

        scanner.close();
    }
}
