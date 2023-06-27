import java.io.IOException;
import java.util.List;

public class FourHillsTournament extends Video {
    public FourHillsTournament() {
        super();
    }

    public void videoList(String username) throws IOException {
        System.out.println(">>> Turniej Czterech Skoczni <<<");

        String filePath = "videos.csv";
        List<String> lines = readDataFromDatabase(filePath);
        String kategoria = "3";

        displayVideosByCategory(lines, kategoria);

        Payment payment = new Payment();
        payment.buying(username);
    }
}