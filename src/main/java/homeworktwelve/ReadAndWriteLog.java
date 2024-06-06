package homeworktwelve;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static homeworktwelve.WarningType.*;

public class ReadAndWriteLog {

    private Map<String, Integer> logCounts;

    public ReadAndWriteLog() {
        this.logCounts = new HashMap<>();
        logCounts.put(INFO.getWarningType(), 0);
        logCounts.put(WARN.getWarningType(), 0);
        logCounts.put(ERROR.getWarningType(), 0);
    }

    public void readAndCountErrorInFile(final String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("[INFO]")) {
                    logCounts.put(INFO.getWarningType(), logCounts.get(INFO.getWarningType()) + 1);
                } else if (line.startsWith("[WARN]")) {
                    logCounts.put(WARN.getWarningType(), logCounts.get(WARN.getWarningType()) + 1);
                } else if (line.startsWith("[ERROR]")) {
                    logCounts.put(ERROR.getWarningType(), logCounts.get(ERROR.getWarningType()) + 1);
                }
            }
        } catch (IOException e ) {
            throw new RuntimeException("FILE NOT FOUND: " + e.getMessage());
        }
    }

    public void writeErrorTypeInNewFile(final String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<String, Integer> entry : logCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
