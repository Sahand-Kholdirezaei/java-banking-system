import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        double balance = 1000;
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            System.out.print("Select an option: ");

            int option;

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (option) {

                case 1:
                    showBalance(balance, currency);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount;

                    try {
                        depositAmount = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Please enter a number. ");
                        scanner.nextLine();
                        break;
                    }

                    if (depositAmount <= 0) {
                        System.out.println("Amount most be greater than 0.");
                    } else {
                        balance = balance + depositAmount;
                        System.out.println("Deposit succesful: " + currency.format(depositAmount));
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount;

                    try {
                        withdrawAmount = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Please enter a number");
                        scanner.nextLine();
                        break;
                    }


                    if (withdrawAmount <= 0) {
                        System.out.println("Amount most be greater than 0.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdraw succesful: " + currency.format(withdrawAmount));
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

    public static void showMenu() {
        System.out.println("\nWelcome to Banking System");
        System.out.println("1 - Check your balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
    }
    public static void showBalance(double balance, NumberFormat currency) {
        System.out.println("Your Balance: " + currency.format(balance));
    }
}