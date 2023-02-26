package QuadraKill;

import java.util.Scanner;

public class RunQuad {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Rectangle obj1 = new Rectangle();;
        Square obj2 = new Square();


        System.out.println("Press R for Rectangle or S for Square.");
        String choice = sc.nextLine();

        if(choice.equals(("R"))){
            System.out.println("A rectangle:");
            obj1.showDescription();

        } else if (choice.equals("S")) {
            System.out.println(" A square: ");
            obj2.showDescription();
        }else {
            System.out.println("Invalid Input");
        }
    }
}
