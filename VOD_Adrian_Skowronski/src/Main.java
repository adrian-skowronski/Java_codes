import java.io.IOException;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("VOD Konkursów Skoków Narciarskich - Dzień Dobry! :>");
        menu();
    }

    public static void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        Registration registration = new Registration();
        Login_Admin loginAdmin = new Login_Admin();


        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Logowanie");
            System.out.println("2. Rejestracja");
            System.out.println("3. Panel administracyjny");
            System.out.println("4. Wyjście");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    login.login();
                    break;
                case 2:
                    registration.register();
                    break;
                case 3:
                    Login_Admin.logAdmin();
                case 4:
                    System.out.println("Dziękujemy za wizytę. Do zobaczenia!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niedostępna opcja :< Spróbuj ponownie.");
            }
        }


    }
}

