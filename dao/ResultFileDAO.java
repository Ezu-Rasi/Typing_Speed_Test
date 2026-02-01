package src.main.java.example.com.Typing_SpeedTest.dao;

import java.io.FileWriter;
import java.io.IOException;

public class ResultFileDAO {

    public static void saveResult(double time, int wpm, double accuracy) {

        try {
            FileWriter writer = new FileWriter("results.txt", true);

            writer.write("Typing Speed Test Result\n");
            writer.write("Time Taken: " + time + " seconds\n");
            writer.write("WPM: " + wpm + "\n");
            writer.write("Accuracy: " + String.format("%.2f", accuracy) + "%\n");
            writer.write("----------------------------\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error while saving result.");
        }
    }
}

