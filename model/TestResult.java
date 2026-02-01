package src.main.java.example.com.Typing_SpeedTest.model;

public class TestResult {
    private int wpm;
    private double accuracy;
    private String date;

    public TestResult(int wpm, double accuracy, String date) {
        this.wpm = wpm;
        this.accuracy = accuracy;
        this.date = date;
    }

    public int getWpm() {
        return wpm;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public String getDate() {
        return date;
    }

    public void display() {
        System.out.println("=== Test Result ===");
        System.out.println("WPM: " + wpm);
        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println("Date: " + date);
    }
}