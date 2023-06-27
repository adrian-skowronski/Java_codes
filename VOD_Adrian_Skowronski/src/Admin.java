import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Admin {

    public Admin() {
    }

    public boolean login(String username, String password) {
        try {
            Path path = Paths.get("admin_database.txt");
            if (Files.exists(path, new LinkOption[0])) {
                Iterator i = Files.readAllLines(path).iterator();

                while (i.hasNext()) {
                    String line = (String) i.next();
                    String[] fields = line.split(",");
                    String storedUsername = fields[0];
                    String storedPassword = fields[1];
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void panel() throws IOException {
        boolean exit = false;

        while (!exit) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl bazę danych zarejestrowanych użytkowników");
            System.out.println("2. Wyświetl zostawione feedbacki");
            System.out.println("3. Zarządzanie dostępnymi video");
            System.out.println("4. Wyloguj");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            Admin admin = new Admin();

            switch (choice) {
                case 1:
                    System.out.println("Zarejestrowani użytkownicy:");
                    System.out.println("login, hasło, e-mail, ID bankowe, saldo");

                    try {
                        Path path = Paths.get("database.txt");
                        if (Files.exists(path)) {
                            List<String> lines = Files.readAllLines(path);
                            for (String line : lines) {
                                System.out.println(line);
                            }
                            System.out.println();
                            admin.panel();
                        }
                    } catch (IOException e) {
                        System.out.println("Błąd podczas odczytu pliku.");
                    }

                    break;
                case 2:
                    System.out.println("Użytkownicy zostawili następujące feedbacki: ");
                    System.out.println();

                    FeedbackClass feedbackFetcher = new FeedbackClass("feedback.txt");
                    List<String> feedbacks = feedbackFetcher.getFeedbacks();

                    if (feedbacks != null) {
                        for (String feedback : feedbacks) {
                            System.out.println(feedback);
                        }
                    } else {
                        System.out.println("Błąd podczas odczytu pliku.");
                    }
                    System.out.println();

                    admin.panel();
                    break;
                case 3:
                    System.out.println("Dostępne video:");
                    System.out.println("Nr kategorii, tytuł, zwycięzca, cena");
                    try {
                        Path path = Paths.get("videos.csv");
                        if (Files.exists(path)) {
                            List<String> lines = Files.readAllLines(path);
                            for (String line : lines) {
                                System.out.println(line);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Błąd podczas odczytu pliku.");
                    }
                    System.out.println("Wybierz 1, aby zaktualizować cenę pojedynczego video");
                    System.out.println("Wybierz 2, aby usunąć wybrane video");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:


                            System.out.print("Podaj nazwę miejsca: ");
                            scanner.nextLine();
                            String miejsce = scanner.nextLine();

                            System.out.print("Podaj nową cenę: ");

                            double nowaCena = Double.parseDouble(scanner.nextLine());


                            List<String> lines = new ArrayList<>();
                            try (BufferedReader br = new BufferedReader(new FileReader("videos.csv"))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    lines.add(line);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }


                            boolean znaleziono = false;
                            List<String> aktualizowaneLinie = new ArrayList<>();
                            for (String line : lines) {
                                String[] parts = line.split(";");
                                if (parts[1].equals(miejsce)) {
                                    parts[3] = String.valueOf(nowaCena);
                                    line = String.join(";", parts);
                                    znaleziono = true;
                                }
                                aktualizowaneLinie.add(line);
                            }


                            try (BufferedWriter bw = new BufferedWriter(new FileWriter("videos.csv"))) {
                                for (String line : aktualizowaneLinie) {
                                    bw.write(line);
                                    bw.newLine();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }


                            if (znaleziono) {
                                System.out.println("Cena została zaktualizowana pomyślnie.");
                                admin.panel();
                            } else {
                                System.out.println("Nie znaleziono miejsca o podanej nazwie.");
                                admin.panel();
                            }
                            break;
                        case 2:
                            System.out.println("Podaj tytuł video do usunięcia: ");
                            scanner.nextLine();
                            String titleToRemove = scanner.nextLine();

                            try {
                                Path path = Paths.get("videos.csv");
                                if (Files.exists(path)) {
                                    List<String> lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
                                    List<String> updatedLines = new ArrayList<>();

                                    boolean removed = false;
                                    for (String line : lines1) {
                                        String[] fields = line.split(";");
                                        String title = fields[1];

                                        if (!title.equalsIgnoreCase(titleToRemove)) {
                                            updatedLines.add(line);
                                        } else {
                                            removed = true;
                                        }
                                    }

                                    if (removed) {
                                        Files.write(path, updatedLines, StandardCharsets.UTF_8);
                                        System.out.println("Usunięcie pozycji zakończone pomyślnie.");
                                        admin.panel();
                                    } else {
                                        System.out.println("Pozycja o podanym tytule nie została znaleziona.");
                                        admin.panel();
                                    }
                                } else {
                                    System.out.println("Plik bazy danych nie istnieje.");
                                    admin.panel();
                                }
                            } catch (IOException e) {
                                System.out.println("Błąd podczas usuwania pozycji.");
                                e.printStackTrace();
                                admin.panel();
                            }
                            break;
                        default:
                            System.out.println("Wybrałeś niedostępną opcję.");
                            admin.panel();
                            break;

                    }


                case 4:
                    System.out.println("Wylogowano administratora");
                    System.out.println();
                    exit = true;
                    Main main = new Main();
                    Main.menu();
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
            }
        }

    }
}