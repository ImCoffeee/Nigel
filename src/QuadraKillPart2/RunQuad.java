package QuadraKillPart2;

import QuadraKill.Rectangle;
import QuadraKill.Square;

import java.util.Scanner;

public class RunQuad {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Rectangle obj1 = new Rectangle();
        Square obj2 = new Square();
        Parallelogram obj3 = new Parallelogram();
        Rhombus obj4 = new Rhombus();
        Trapeziod obj5 = new Trapeziod();

        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        String choice = sc.nextLine();

        if(choice.equals(("R"))){
            System.out.println("A rectangle:");
            obj1.showDescription();

        } else if (choice.equals("S")) {
            System.out.println(" A square: ");
            obj2.showDescription();

        } else if (choice.equals("P")) {
            System.out.println(" A parallelogram");
            obj3.showDescription();

        } else if (choice.equals("H")) {
            System.out.println("A rhombus");
            obj4.showDescription();

        }else if (choice.equals("T")){
            System.out.println("A trapezoid");
            obj5.showDescription();
        }else {
            System.out.println("Invalid Input");

        }

    }
}
