import java.util.Scanner;

public class BankSimulator {

    public static void main(String[] args) {

//        declaration
        int choose, amount;
        BankAccount user = new BankAccount(500);

//        import Scanner object
        Scanner optionScanner = new Scanner(System.in);
        Scanner amountScanner = new Scanner(System.in);

// main process
        do {

//            choose option
            do {
                System.out.println("(1) check your balance,");
                System.out.println("(2) make a deposit,");
                System.out.println("(3) make a  withdraw,");
                System.out.println("(4) exit the program.");
                System.out.print("Choose Your Options : ");
                choose = optionScanner.nextInt();

            } while (choose > 5 || choose <= 0);

//            do action depend on option
            switch (choose) {

//                check balance option process
                case 1:
                    user.checkBalance();
                    break;

//                    deposit option process
                case 2:
                    do {
                        System.out.print("please Enter deposit balance : ");
                        amount = amountScanner.nextInt();
                    } while (amount <= 0);
                    user.makeDeposit(amount);
                    break;

//                    withdraw option process
                case 3:
                    do {
                        System.out.print("please Enter withdraw amount : ");
                        amount = amountScanner.nextInt();
                    } while (amount <= 0);
                    user.makeWithdraw(amount);
                    break;

//                    exist program process
                case 4:
                    System.out.println("Thank for using our program :)");
                    break;
            }
        } while (choose != 4);


    }

}
