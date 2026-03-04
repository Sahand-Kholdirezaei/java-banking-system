import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nWelcome to Banking System");
            System.out.println("1 - Check your balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option){

                case 1:
                    System.out.println("Your Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Put amount to deposit: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Amount most be greater than 0.");
                    } else {
                        balance = balance + depositAmount;
                        System.out.println("Deposit succesful.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0){
                        System.out.println("Amount most be greater than 0.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdraw succesful.");
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}