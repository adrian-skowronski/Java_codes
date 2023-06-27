import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;

public class Login {

    Scanner scanner;

    public Login() {
        this.scanner = new Scanner(System.in);
    }

    public void login() throws IOException {
        System.out.println("Podaj login:");
        String username = this.scanner.nextLine();
        System.out.println("Podaj hasło:");
        String password = this.scanner.nextLine();
        if (this.validateUser(username, password)) {
            System.out.println("Zalogowano pomyślnie!");
        } else {
            System.out.println("Nieprawidłowy login lub hasło.");
            this.login();
        }

        UserMenu userMenu = new UserMenu();
        userMenu.showMenu(username);
    }

    private boolean validateUser(String username, String password) {
        try {
            Path path = Paths.get("database.txt");
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
}