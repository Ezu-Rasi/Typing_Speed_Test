package example.com.Typing_SpeedTest.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import example.com.Typing_SpeedTest.model.TestResult;

public class ResultFileDAO {

    private static final String FILE = "results.txt";

    public void saveResult(TestResult result) {
        try (FileWriter fw = new FileWriter(FILE, true)) {
            fw.write(result.getDifficulty() + ","
                    + result.getTimeTaken() + ","
                    + result.getWpm() + ","
                    + result.getAccuracy() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving result.");
        }
    }

    public TestResult getLastResult() {
        List<TestResult> list = getAllResults();
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public List<TestResult> getAllResults() {
        List<TestResult> results = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                results.add(new TestResult(
                        p[0],
                        Double.parseDouble(p[1]),
                        Double.parseDouble(p[2]),
                        Double.parseDouble(p[3])
                ));
            }
        } catch (FileNotFoundException e) {
            // first run, file not created yet
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        return results;
    }
}
