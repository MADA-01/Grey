package banking;

import java.util.Scanner;

public class mada {

    static Scanner scanner = new Scanner(System.in); //whole program
    // mada is the name of my banking

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 1000.05;
        boolean isRunning = true;
        int choice;

// dislay menu

        while (isRunning) {
            
        System.out.println("************");
        System.out.println("MADA BANK");
        System.out.println("************");
        System.out.println("1. Show balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
        System.out.println("************");

// get the process users choice

        System.out.print("enter your choice (1-4): ");
        choice = scanner.nextInt(); 

        switch (choice) {

            default: System.out.println("Invalid choice");

            case 1:  showBalance(balance);break;
            case 2:  balance = balance + deposit();break; // or balance += deposit
            case 3:  balance -= withdraw (balance);break;
            case 4: isRunning = false;

            //exit message
            System.out.println("Thank you!! ");
                                            
        }
        }

        scanner.close();
        
    }
    //show balance()
    static void showBalance(double balance){
        System.out.println(" ************");
        System.out.printf("$%.2f\n " , balance); // or just ("$" + balance);
    }
    //deposit
    static double deposit(){

        double amount;

        System.out.print("Enter amount to Deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println(" Ammount error!! ");
            return 0;
        }
        else {
            return amount;
        }

    }
    //withdraw
    static double withdraw (double balance){

        double amount;

        System.out.println("enter amount to withdraw:");
        amount = scanner.nextDouble();

            if(amount > balance) {
                System.out.println("Insufficient funds");
                return 0;

            }else if  (amount < 0){
                System.out.println("Amount cannot be negative");
                return 0;
            }else{
        return amount;
            }
        }
}
