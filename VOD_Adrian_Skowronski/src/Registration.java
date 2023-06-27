import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {
    private static final String DATABASE_PATH = "database.txt";
    private Scanner scanner;

    public Registration() {
        this.scanner = new Scanner(System.in);
    }

    public void validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Nieprawidłowy adres e-mail");
        }
        System.out.println("Adres e-mail jest poprawny ");
    }

    public void validatePassword(String password) {
        if (password.length() < 6) {
            throw new IllegalArgumentException("Hasło musi mieć co najmniej 6 znaków");
        }
        System.out.println("Hasło jest wymaganej długości");
    }

    public void register() {
        System.out.println("Podaj login:");
        String username = scanner.nextLine();

        String password;
        while (true) {
            System.out.println("Podaj hasło o długości co najmniej 6 znaków:");
            password = scanner.nextLine();
            try {
                validatePassword(password);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Błąd walidacji: " + e.getMessage());
                System.out.println("Spróbuj ponownie.");
            }
        }

        String email;
        while (true) {
            System.out.println("Podaj adres e-mail:");
            email = scanner.nextLine();
            try {
                validateEmail(email);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Błąd walidacji: " + e.getMessage());
                System.out.println("Spróbuj ponownie.");
            }
        }

        System.out.println("Podaj ID bankowe:");
        String id = scanner.nextLine();

        if (storeUser(username, password, email, id)) {
            System.out.println("Rejestracja zakończona pomyślnie!");
        } else {
            System.out.println("Wystąpił problem podczas rejestracji. Spróbuj ponownie.");
        }
    }

    private boolean storeUser(String username, String password, String email, String id) {
        try {
            FileWriter writer = new FileWriter(DATABASE_PATH, true);
            writer.write(username + "," + password + "," + email + "," + id + ",0.0\n");
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void Registration() {
        Registration registration = new Registration();
        registration.register();
    }
}
