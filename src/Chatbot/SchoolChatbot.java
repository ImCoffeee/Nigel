package Chatbot;

import java.util.Scanner;

public class SchoolChatbot {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String userInput;
        String response;

        System.out.println("Welcome to STI chatbot! How can I help you today?");

        while (true) {
            userInput = input.nextLine();

            if (userInput.toLowerCase().contains("courses")) {
                Thread.sleep(2000);
                response = "Our school offers a wide variety of course like BSIT, BSCPE, BSCS, and BSHM. \nFor more information you can inquire in our school. ";
            } else if (userInput.toLowerCase().contains("schedule")) {
                Thread.sleep(2000);
                response = "For you to find you schedule just visit the STI website.";
            } else if (userInput.toLowerCase().contains("payment")) {
                Thread.sleep(2000);
                response = "You currently don't have any payment";
            } else if (userInput.toLowerCase().contains("grades")) {
                Thread.sleep(2000);
                response = "You can find your grades in OneSTI website or app.";
            } else if (userInput.toLowerCase().contains("teachers")) {
                Thread.sleep(2000);
                response = "Our staff of educators is committed and skilled. On our website, you can get more details about them.";
            } else if (userInput.toLowerCase().contains("bye")) {
                Thread.sleep(1000);
                response = "Goodbye! Have a great day.";
                break;
            } else {
                response = "I'm sorry, I didn't understand. Could you please repeat that?";
            }
            System.out.println(response);
        }
    }
}





