package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        chatBotGreeting("Nova", 2023);
        askForUserName();
        guessUserName();
        botCountingToNumber();
        botPopQuiz();
        end();
    }

    private static void chatBotGreeting(String botName, int birthYear ) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    private static void askForUserName(){
        System.out.println("Please, remind me your name.");
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    private static void guessUserName() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int userAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + userAge + "; that's a good time to start programming!");
    }

    private static void botCountingToNumber() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
    }

    private static void botPopQuiz() {
        System.out.println("Let's test your programming knowledge.");
        boolean correctAnswer = false;

        while (!correctAnswer) { 
            System.out.println("Why do we use methods?");
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");

            int userAnswer = scanner.nextInt();

            if (userAnswer != 4) {
                System.out.println("Please, try again.");
            } else {
                correctAnswer = true;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); 
    }
}
