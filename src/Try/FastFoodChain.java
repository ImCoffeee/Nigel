package Try;

import java.util.Scanner;

public class FastFoodChain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our fast food chain! What would you like to order?");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Salad");
        System.out.println("4. Fries");
        System.out.println("5. Soft Drink");

        int choice = input.nextInt();
        double totalCost = 0;

        switch (choice) {
            case 1:
                System.out.println("You have chosen a burger. That will be $5.99.");
                totalCost += 5.99;
                break;
            case 2:
                System.out.println("You have chosen a pizza. That will be $7.99.");
                totalCost += 7.99;
                break;
            case 3:
                System.out.println("You have chosen a salad. That will be $4.99.");
                totalCost += 4.99;
                break;
            case 4:
                System.out.println("You have chosen fries. That will be $2.99.");
                totalCost += 2.99;
                break;
            case 5:
                System.out.println("You have chosen a soft drink. That will be $1.99.");
                totalCost += 1.99;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        System.out.println("Your total cost is $" + totalCost);
    }
}
