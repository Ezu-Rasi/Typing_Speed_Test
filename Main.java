package src.main.java.example.com.typing_speed_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello guys welcome to typing speed test");
        System.out.println("This is a simple typing speed test application.");
        System.out.println("------------------------------------------------");

        System.out.println("\n==== Typing Speed Test Menu ====");
        System.out.println("1. Start Typing Test");
        System.out.println("2. View Last Test Result");
        System.out.println("3. View Test History");
        System.out.println("4. Change Difficulty Level");
        System.out.println("5. Instructions");
        System.out.println("6. About Program");
        System.out.println("7. Exit");

        System.out.print("Enter choice: ");
        int num = input.nextInt();
        input.nextLine();

       if (num == 1) {

    System.out.println("Start Typing Test");
    System.out.println("Feature not added yet!");
 
       }else if (num == 2) { 

    System.out.println("View Last Test Result");
    System.out.println("No results available yet!");

      } else if (num == 3) {

     System.out.println("View Test History");
     System.out.println("History is empty.");

     } else if (num == 4) {

    System.out.println("Change Difficulty Level");
    System.out.print("Choose level (Easy / Medium / Hard): ");
    String level = input.nextLine();
    System.out.println("Difficulty set to: " + level);

     } else if (num == 5) {

    System.out.println("Instructions");
    System.out.println("- Type the sentence quickly and accurately.");
    System.out.println("- WPM and Accuracy will be calculated.");

    } else if (num == 6) {

    System.out.println("About Program");
    System.out.println("This is a simple Java Typing Speed Test project.");

    } else if (num == 7) {

    System.out.println("Exit");
    System.out.println("Goodbye!");

    } else {

    System.out.println("Invalid choice! Please try again.");
   }
        input.close();
    }
}
