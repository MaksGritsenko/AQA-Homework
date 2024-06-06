package homeworktwelve;

public class LogAnalyzer {
    public static void main(String[] args) {

        String inputFilePath = "log.txt";
        String outputFilePath = "report.txt";
        ReadAndWriteLog readWrite = new ReadAndWriteLog();
        readWrite.readAndCountErrorInFile(inputFilePath);
        readWrite.writeErrorTypeInNewFile(outputFilePath);
    }
}
