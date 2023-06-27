import java.io.IOException;
import java.util.List;

public class PolishWorldCup extends Video {
    public PolishWorldCup() {
        super();
    }

    public void videoList(String username) throws IOException {
        System.out.println(">>> Puchar Świata - Konkursy Polskie <<<");

        String filePath = "videos.csv";
        List<String> lines = Video.readDataFromDatabase(filePath);
        String kategoria = "1";

        Video.displayVideosByCategory(lines, kategoria);

        Payment payment = new Payment();
        payment.buying(username);
    }
}
