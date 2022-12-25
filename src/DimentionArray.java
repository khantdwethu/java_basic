import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class DimentionArray {
    public static void main(String[] args) {
        String[] storedItems = {"broccoli", "onion", "carrot", "turnip", "mango", "bread", "garlic", "celery", "apple", "banana", "raisins", "grapes", "lemon", "orange", "potato"};
        int[] itemQuantities = {23, 5, 7, 15, 2, 13, 13, 8, 20, 30, 3, 25, 10, 9, 1};
        double[] itemPrices = {2.0, 0.89, 0.7, 1.5, 2.99, 3.45, 1.45, 1.12, 3.99, 0.25, 4.99, 7.00, 1.75, 1.80, 3.25};
        runTransaction(storedItems, itemQuantities,itemPrices);
    }

    public static void runTransaction(String[] items, int[] quantities, double[] prices) {
        int choose = 0;
        Scanner scanner = new Scanner(System.in);


        do {
//            choose option
            do {
                System.out.println("What would you like to do? \n" +"1. Display all inventory \n" +
                        "2. Display inventory with lower than 5 quantity \n" +
                        "3. Display highest and lowest inventory value items \n" +
                        "4. Display total inventory value \n" +
                        "5. Exit");
                System.out.print("Your choose : ");
                choose = scanner.nextInt();
            }while (choose>6 || choose<0);


//            do action depend on choose
            switch (choose){
//                to print all inventory
                case 1:
                    System.out.println();
                    for (int i = 0; i <items.length ; i++) {
                        System.out.println("Item: "+ items[i] + "\t Quantity: "+ quantities[i] + "\t Prices : "+ prices[i]);
                    }
                    System.out.println();
                    break;

//                    to print lower than 5 qty
                case 2:
                    System.out.println();
                    for (int i = 0; i <items.length ; i++) {
                        if(quantities[i]<5){
                            System.out.println("Item: "+ items[i] + "\t Quantity: "+ quantities[i] + "\t Prices : "+ prices[i]);

                        }
                    }
                    System.out.println();
                    break;

//                    to print total value
                case 4:
                    System.out.println();
                    int sum = 0;
                    for (int i = 0; i <items.length ; i++) {
                        sum+= prices[i];
                    }
                    System.out.println("Total inventory Value : $" + sum);

                    System.out.println();
                    break;

//                    to print min and max value
                case 3:
                    System.out.println();
                    double[] arr = new double[prices.length];
                    for (int i = 0; i < prices.length; i++) {
                        arr[i] = prices[i];
                    }

                    Arrays.sort(arr);

                    double min = arr[0];
                    double max= arr[arr.length-1];

                    System.out.println();


                    System.out.println("HEIGHT :");
                    for (int i = 0; i < prices.length; i++) {
                        if(prices[i] == max){
                            System.out.println("Item: "+ items[i] + "\t Quantity: "+ quantities[i] + "\t Prices : "+ prices[i]);

                        }
                    }


                    System.out.println("LOWEST :");
                    for (int i = 0; i < prices.length; i++) {
                        if(prices[i] == min){
                            System.out.println("Item: "+ items[i] + "\t Quantity: "+ quantities[i] + "\t Prices : "+ prices[i]);
                        }
                    }
                    System.out.println();


//                    to exist program
                case 5:
                    System.out.println("Thank you for using program");break;
            }

        }while ( choose !=5);
        return ;
    }
}
