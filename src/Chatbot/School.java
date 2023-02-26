package Chatbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class School {
    public static void main(String[]args) throws InterruptedException{
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to STI chatbot!! \nWhat's your name? ");
        String chat = input.nextLine();
        Thread.sleep(2000);

        System.out.println("Nice to meet you, " + chat + " Im the STI chatbot.");
        System.out.println("How are you today?");
        Thread.sleep(2000);
        String feeling = input.nextLine();
        if(feeling.equalsIgnoreCase("good"))
            System.out.println("Wow! I feel the same way.");
        else if (feeling.equalsIgnoreCase("great")) {
            System.out.println("That's nice to know!");
        }else
            System.out.println("That's great!");
        Thread.sleep(2000);
        System.out.println("What your favorite subject in school?");
        String fave = input.nextLine();
        ArrayList subject = new ArrayList();
        Collections.addAll(subject, "Computer Programming", "Data Structure", "Human Computer Interaction");
        Collections.shuffle(subject);
        Thread.sleep(2000);
        System.out.println(fave + " is cool! But " + subject.get(0) + " is good and amazing to learn.");
    }
}

