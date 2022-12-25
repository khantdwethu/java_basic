import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner InputWeight = new Scanner(System.in);
        System.out.println("Enter user Weight");
        double weight = InputWeight.nextDouble();

        Scanner inputHeight = new Scanner(System.in);
        System.out.println("Enter user Height");
        double height = inputHeight.nextDouble();

        double BMI = weight/Math.pow(height,2);

        System.out.println("your BMI is :"+ BMI);

        if (BMI<18.5 ){
            System.out.println("your weight is underweight");
        } else if (18.5 <= BMI && BMI < 25.0) {
            System.out.println("your weight is normal");
        } else if (25.0 <= BMI && BMI < 30.0) {
            System.out.println("your weight is overweight");
        } else if (30.0<BMI) {
            System.out.println("your weight is Obese");
        }
    }
}
