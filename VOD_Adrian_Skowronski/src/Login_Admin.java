import java.io.IOException;
import java.util.Scanner;

public class Login_Admin {
    public Login_Admin() {
    }

    public static void logAdmin() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login administratora:");
        String adminUsername = scanner.nextLine();
        System.out.println("Podaj hasło administratora:");
        String adminPassword = scanner.nextLine();
        Admin admin = new Admin();
        if (admin.login(adminUsername, adminPassword)) {
            System.out.println("Zalogowano jako administrator!");
            Admin admin1 = new Admin();
            Admin.panel();
        } else {
            System.out.println("Nieprawidłowy login lub hasło administratora.");
            Main main = new Main();
            Main.menu();
        }

    }
}
