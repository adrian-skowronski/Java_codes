import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Video {
    protected String category;
    protected String title;
    protected String winner;
    protected double price;

    public Video(String category, String title, String winner, double price) {
    }

    public Video() {

    }

    protected static List<String> readDataFromDatabase(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllLines(path);
    }

    protected static void displayVideosByCategory(List<String> lines, String category) {
        for (String line : lines) {
            String[] parts = line.split(";");
            String kategoriaFilmu = parts[0];
            String tytul = parts[1];
            String zwyciezca = parts[2];
            String cena = parts[3];
            if (kategoriaFilmu.equals(category)) {
                System.out.println("Tytuł: " + tytul);
                System.out.println("Zwycięzca: " + zwyciezca);
                System.out.println("Cena [zł]: " + cena);
                System.out.println("---------------------------");
            }
        }
    }

    public void add(Video video) {
    }
}