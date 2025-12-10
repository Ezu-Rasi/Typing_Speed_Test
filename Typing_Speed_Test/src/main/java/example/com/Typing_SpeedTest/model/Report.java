package src.main.java.example.com.Typing_SpeedTest.model;

public class Report {
     private String userName;
    private int wpm;
    private double accuracy;

    public Report(String userName, int wpm, double accuracy) {
        this.userName = userName;
        this.wpm = wpm;
        this.accuracy = accuracy;
    }

    public String getUserName() {
        return userName;
    }

    public int getWpm() {
        return wpm;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void display() {
        System.out.println("=== Typing Test Report ===");
        System.out.println("User: " + userName);
        System.out.println("WPM: " + wpm);
        System.out.println("Accuracy: " + accuracy + "%");
    }
}
