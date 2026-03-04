import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 1000;

        System.out.println("Welcome to Banking System");
        System.out.println("1 - Check your balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Select an option: ");

        int option = scanner.nextInt();

        System.out.println("You selected: " + option);



    }
}