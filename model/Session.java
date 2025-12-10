package src.main.java.example.com.Typing_Speed_Test.model;

public class Session {
     private long startTime;
    private long endTime;

    public Session(long startTime) {
        this.startTime = startTime;
    }

    public void endSession(long endTime) {
        this.endTime = endTime;
    }

    public long getDuration() {
        return endTime - startTime;
    }
}
