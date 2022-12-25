import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][3];

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + "columns");

        // to put data to matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
            System.out.println();
        }

        // to display matrix data
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");

            }
            System.out.println();
        }
        
        
    }
}
