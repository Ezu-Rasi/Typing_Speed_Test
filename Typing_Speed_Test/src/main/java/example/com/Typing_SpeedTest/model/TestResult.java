package example.com.Typing_SpeedTest.model;

public class TestResult {

    private String difficulty;
    private double timeTaken;
    private double wpm;
    private double accuracy;

    public TestResult(String difficulty, double timeTaken, double wpm, double accuracy) {
        this.difficulty = difficulty;
        this.timeTaken = timeTaken;
        this.wpm = wpm;
        this.accuracy = accuracy;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public double getTimeTaken() {
        return timeTaken;
    }

    public double getWpm() {
        return wpm;
    }

    public double getAccuracy() {
        return accuracy;
    }

    @Override
    public String toString() {
        return "Difficulty: " + difficulty +
                " | Time: " + String.format("%.2f", timeTaken) +
                " sec | WPM: " + String.format("%.2f", wpm) +
                " | Accuracy: " + String.format("%.2f", accuracy) + "%";
    }
}