import java.io.File;
import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius,area,PI=3.14;

        do {
            System.out.println("Enter Positive integer:");
            radius = scanner.nextDouble();
        }while (radius<0);

        area = Math.pow(radius,2)*PI;

        System.out.println("area is : "+ area);
    }
}
