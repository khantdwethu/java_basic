public class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Noted : Your current balance value is : " + this.balance);
    }

    void makeDeposit(int balance) {
        this.balance = this.balance + balance;
        System.out.println("Noted : Successful!!! \n Your deposit amount is : " + balance + " and your current balance is : " + this.balance);
    }

    void makeWithdraw(int balance) {

        if (this.balance- balance < 30) {
            System.out.println("Noted : Failed!!! \n Sorry You can't effort to withdraw process, your current balance amount is below $ 30 or cannot withdraw all amount");
        } else if (this.balance < balance) {
            System.out.println("Noted : Failed!!! \n Sorry You can't effort to withdraw process, your current balance is : " + this.balance + " and your withdraw amount is " + balance);
        } else {
            this.balance = this.balance - balance;
            System.out.println("Noted : Successful!!! \n Your withdraw amount is : " + balance + " and your current balance is : " + this.balance);
        }
    }


}
