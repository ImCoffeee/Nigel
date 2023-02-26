package MachineLearningAlgo;
import java.util.Scanner;
public class FastFood {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to McDonald's!!! Can I take you order sir/ma'am?");
        String food = input.nextLine();
        Thread.sleep(2000);

        System.out.println("The order that you said, " + food + ", Is that right?");
        String Yes = input.nextLine();
            if (Yes.equalsIgnoreCase("Yes"))
                System.out.println("Your order is now being made.");
            else if (Yes.equalsIgnoreCase("That's right"))
                System.out.println("Your order may take sometimes. Please wait. ");
            Thread.sleep(2000);
         System.out.println("Is there anything else that you would like to order?");
         String order = input.nextLine();
         if(order.equalsIgnoreCase("Yes")) {
             System.out.println("Can I take your order?");
             String ch = input.nextLine();
             System.out.println("Your order is " + ch + " I will add it to your previous order. Please wait for the delivery.");
         }else if (order.equalsIgnoreCase("No")){
             System.out.println("Your order is now out for delivery. Thank you for your order! Please wait patiently.");
         }
    }
}



