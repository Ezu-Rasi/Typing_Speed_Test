package example.com.Typing_SpeedTest.model;

public class Session {
    private long startTime;
    private long endTime = -1;

    public Session(long startTime) {
        this.startTime = startTime;
    }

    public void endSession(long endTime) {
        this.endTime = endTime;
    }

    public long getDuration() {
        if (endTime == -1) {
            throw new IllegalStateException("Session has not ended. Call endSession() first.");
        }
        return endTime - startTime;
    }
}
