import java.io.IOException;
import java.util.List;

public class WorldChampionships extends Video {
    public WorldChampionships() {
        super();
    }


    public void videoList(String username) throws IOException {
        System.out.println(">>> Mistrzostwa Świata <<<");

        String filePath = "videos.csv";
        List<String> lines = readDataFromDatabase(filePath);
        String kategoria = "4";

        displayVideosByCategory(lines, kategoria);

        Payment payment = new Payment();
        payment.buying(username);
    }

}
