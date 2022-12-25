import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String[] args) {
        double score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Score : ");
        score = scanner.nextDouble();

        do {
            System.out.print("The grade is ");
            printGrade(score);
            System.out.print("Enter Your Score or type -1 to exist : ");
            score = scanner.nextDouble();
        }while (score != -1);

        System.out.println("program exist");


    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println("A");
        }else if (score >= 80.0) {
            System.out.println("B");
        }else if (score >= 70.0) {
            System.out.println("C");
        }else if (score >= 60.0) {
            System.out.println("D");
        }else System.out.println("F");
    }
}
