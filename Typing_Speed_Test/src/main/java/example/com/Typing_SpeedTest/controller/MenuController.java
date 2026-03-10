package example.com.Typing_SpeedTest.controller;

import java.util.Scanner;

import example.com.Typing_SpeedTest.dao.ResultFileDAO;
import example.com.Typing_SpeedTest.model.TestResult;

public class MenuController {

    private Scanner input = new Scanner(System.in);
    private ResultFileDAO resultDAO = new ResultFileDAO();
    private String difficulty = "Easy";

    public void startMenu() {

        System.out.println("Hello guys welcome to typing speed test");
        System.out.println("--------------------------------------");

        boolean running = true;

        while (running) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    startTypingTest();
                    break;
                case 2:
                    viewLastResult();
                    break;
                case 3:
                    viewHistory();
                    break;
                case 4:
                    changeDifficulty();
                    break;
                case 5:
                    instructions();
                    break;
                case 6:
                    about();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        input.close();
    }

    private void showMenu() {
        System.out.println("\n==== Typing Speed Test Menu ====");
        System.out.println("1. Start Typing Test");
        System.out.println("2. View Last Test Result");
        System.out.println("3. View Test History");
        System.out.println("4. Change Difficulty Level");
        System.out.println("5. Instructions");
        System.out.println("6. About Program");
        System.out.println("7. Exit");
        System.out.print("Enter choice: ");
    }

    private void startTypingTest() {

        String text = "Java is a powerful programming language";
        System.out.println("\nDifficulty: " + difficulty);
        System.out.println("Type this sentence:");
        System.out.println(text);
        System.out.println("\nPress ENTER to start...");
        input.nextLine();

        long start = System.currentTimeMillis();
        String typed = input.nextLine();
        long end = System.currentTimeMillis();

        double timeSeconds = (end - start) / 1000.0;
        int words = text.split(" ").length;
        double wpm = (words / timeSeconds) * 60;

        int correctChars = calculateCorrectChars(text, typed);
        double accuracy = (double) correctChars / text.length() * 100;

        System.out.printf("Time: %.2f sec\n", timeSeconds);
        System.out.printf("WPM: %.2f\n", wpm);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        TestResult result = new TestResult(difficulty, timeSeconds, wpm, accuracy);
        resultDAO.saveResult(result);

        System.out.println("Result saved!");
    }

    private int calculateCorrectChars(String original, String typed) {
        int correct = 0;
        int len = Math.min(original.length(), typed.length());

        for (int i = 0; i < len; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                correct++;
            }
        }
        return correct;
    }

    private void viewLastResult() {
        TestResult r = resultDAO.getLastResult();
        if (r == null) {
            System.out.println("No results found.");
        } else {
            System.out.println("\nLast Result:");
            System.out.println(r);
        }
    }

    private void viewHistory() {
        System.out.println("\nTest History:");
        for (TestResult r : resultDAO.getAllResults()) {
            System.out.println(r);
        }
    }

    private void changeDifficulty() {
        System.out.print("Choose (Easy/Medium/Hard): ");
        difficulty = input.nextLine();
        System.out.println("Difficulty set to " + difficulty);
    }

    private void instructions() {
        System.out.println("Type the sentence as fast and accurate as possible.");
    }

    private void about() {
        System.out.println("Simple Java Typing Speed Test using MVC & DAO.");
    }
}