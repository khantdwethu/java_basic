import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        int totalPoint, diceValue, betValue;
        Scanner scanner = new Scanner(System.in);

        totalPoint = 100;
        System.out.println("your starting amount is " + totalPoint + " points ");


       do {
           do {
               System.out.print("Enter your bet amount :");
               betValue = scanner.nextInt();
               System.out.println("your bet : " + betValue);
           } while ( betValue > totalPoint || betValue < 0  );

        diceValue = (int) (1 + Math.random() * 6);
           System.out.println("dice value is :" + diceValue);

        if(diceValue == 6){
            totalPoint += betValue * 2;
        } else if (diceValue == 4 || diceValue == 5) {
            totalPoint += betValue + betValue;
        }else if( diceValue == 3){
            totalPoint= totalPoint;
        } else if (diceValue == 1 || diceValue == 2) {
            totalPoint -= betValue;
        }

           System.out.println("Total amount : "+ totalPoint);
       }while (totalPoint !=0);


    }
}
