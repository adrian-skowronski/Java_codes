import java.io.IOException;
import java.util.List;

public class AbroadWorldCup extends Video {
    public AbroadWorldCup() {
        super();

    }

    public void videoList(String username) throws IOException {
        System.out.println(">>> Puchar Świata - Konkursy Zagraniczne <<<");

        String filePath = "videos.csv";
        List<String> lines = readDataFromDatabase(filePath);
        String kategoria = "2";

        displayVideosByCategory(lines, kategoria);

        Payment payment = new Payment();
        payment.buying(username);
    }
}