import java.io.IOException;
import java.util.Scanner;

public class UserMenu {
    public UserMenu() {
    }

    public void showMenu(String username) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = true;

        while (isLoggedIn) {
            System.out.println("---- Menu ----");
            System.out.println("1. Wyświetl informacje o Twoim koncie");
            System.out.println("2. Doładuj Twoje saldo");
            System.out.println("3. Przejdź do panelu VOD");
            System.out.println("4. Zostaw feedback o aplikacji");
            System.out.println("5. Wyloguj");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    User user = new User();
                    user.info(username);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Podaj swoje ID bankowe:");
                    String inputId = scanner.nextLine();
                    User user1 = new User();
                    user1.checkUserId(username, inputId);
                    boolean isIdValid = user1.checkUserId(username, inputId);
                    if (isIdValid) {
                        System.out.println("Podaj kwotę do doładowania:");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        user1.addFunds(username, amount);
                    } else {
                        System.out.println("Nieprawidłowe ID bankowe.");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Wybierz kategorię filmu:");
                    System.out.println("1. Puchar Świata Konkursy Polskie");
                    System.out.println("2. Puchar Świata Konkursy Zagraniczne");
                    System.out.println("3. Turniej Czterech Skoczni");
                    System.out.println("4. Mistrzostwa Świata");
                    System.out.println("5. Igrzyska Olimpijskie");
                    System.out.print("Podaj numer kategorii: ");
                    int categoryChoice = scanner.nextInt();
                    switch (categoryChoice) {
                        case 1:
                            PolishWorldCup polishWorldCup = new PolishWorldCup();
                            polishWorldCup.videoList(username);
                            break;
                        case 2:
                            AbroadWorldCup abroadWorldCup = new AbroadWorldCup();
                            abroadWorldCup.videoList(username);
                            break;
                        case 3:
                            FourHillsTournament fourHillsTournament = new FourHillsTournament();
                            fourHillsTournament.videoList(username);
                            break;
                        case 4:
                            WorldChampionships worldChampionships = new WorldChampionships();
                            worldChampionships.videoList(username);
                            break;
                        case 5:
                            OlympicGames olympicGames = new OlympicGames();
                            olympicGames.videoList(username);
                            break;
                        default:
                            System.out.println("Nieprawidłowy numer kategorii.");
                            UserMenu userMenu = new UserMenu();
                            userMenu.showMenu(username);
                            return;
                    }
                case 4:
                    Feedback feedback = new Feedback();
                    Feedback.leaveFeedback(username);
                case 5:
                    System.out.println();
                    System.out.println("Wylogowano pomyślnie.");
                    isLoggedIn = false;
                    Main main = new Main();
                    Main.menu();
                    break;
                default:
                    System.out.println();
                    System.out.println("Nieprawidłowy wybór.");
            }
        }

    }
}