import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Feedback {
    public Feedback() {
    }

    public static void leaveFeedback(String username) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swoje uwagi i feedback:");
            String feedback = scanner.nextLine();
            String feedbackFilePath = "feedback.txt";
            String feedbackEntry = username + ": " + feedback;
            Files.write(Paths.get(feedbackFilePath), (feedbackEntry + System.lineSeparator()).getBytes(), new OpenOption[]{StandardOpenOption.APPEND});
            System.out.println("Feedback został zapisany pomyślnie.");
            UserMenu userMenu = new UserMenu();
            userMenu.showMenu(username);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania feedbacku.");
            UserMenu userMenu = new UserMenu();
            userMenu.showMenu(username);
        }

    }
}