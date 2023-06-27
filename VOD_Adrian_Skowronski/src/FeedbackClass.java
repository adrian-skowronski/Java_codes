import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FeedbackClass implements FeedbackInterface {
    private String filePath = "feedback.txt";

    public FeedbackClass(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> getFeedbacks() {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}