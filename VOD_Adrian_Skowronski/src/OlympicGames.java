import java.io.IOException;
import java.util.List;

public class OlympicGames extends Video {
    public OlympicGames() {
        super();
    }

    public void videoList(String username) throws IOException {
        System.out.println(">>> Igrzyska Olimpijskie <<<");

        String filePath = "videos.csv";
        List<String> lines = Video.readDataFromDatabase(filePath);
        String kategoria = "5";

        Video.displayVideosByCategory(lines, kategoria);

        Payment payment = new Payment();
        payment.buying(username);

    }
}

