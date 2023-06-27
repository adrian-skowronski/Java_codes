import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Payment {

    public Payment() {
    }

    public void buying(String username) throws IOException {
        UserMenu userMenu = new UserMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tytuł filmu, który chcesz kupić: ");
        String chooseTitle = scanner.nextLine();
        boolean filmFound = false;
        double saldo = 0.0;
        Path path = Paths.get("database.txt");
        if (Files.exists(path, new LinkOption[0])) {
            Iterator i = Files.readAllLines(path).iterator();

            while (i.hasNext()) {
                String line = (String) i.next();
                String[] fields = line.split(",");
                String storedUsername = fields[0];
                if (storedUsername.equals(username)) {
                    saldo = Double.parseDouble(fields[4]);
                    break;
                }
            }
        }

        String filePath = "videos.csv";
        Path path2 = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path2);
        Iterator i = lines.iterator();

        while (i.hasNext()) {
            String line = (String) i.next();
            String[] parts = line.split(";");
            String title = parts[1];
            double price = Double.parseDouble(parts[3]);
            if (title.equals(chooseTitle)) {
                filmFound = true;
                if (saldo >= price) {
                    double newBalance = saldo - price;
                    System.out.println("*** Zakup udany! Na twój adres e-mail wysłaliśmy link dostępu do wybranego video! ***\nSaldo po zakupie: " + newBalance);
                    User user = new User();
                    user.updateBalance(username, newBalance);
                    userMenu.showMenu(username);
                } else {
                    System.out.println("Nie masz wystarczającego salda, aby dokonać zakupu.");
                    userMenu.showMenu(username);
                }
                break;
            }
        }

        if (!filmFound) {
            System.out.println("Film o podanym tytule nie istnieje.");
            userMenu.showMenu(username);
        }

    }
}