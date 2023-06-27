import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class User {
    private double currentBalance2;

    public User() {
    }

    public void info(String username) {
        try {
            Path path = Paths.get("database.txt");
            if (Files.exists(path, new LinkOption[0])) {
                Iterator i = Files.readAllLines(path).iterator();

                while (i.hasNext()) {
                    String line = (String) i.next();
                    String[] fields = line.split(",");
                    String storedUsername = fields[0];
                    if (storedUsername.equals(username)) {
                        String password = fields[1];
                        String email = fields[2];
                        String id = fields[3];
                        double saldo = Double.parseDouble(fields[4]);
                        this.currentBalance2 = saldo;
                        System.out.println("Login: " + username);
                        System.out.println("Hasło: " + password);
                        System.out.println("E-mail: " + email);
                        System.out.println("ID bankowe: " + id);
                        System.out.println("Saldo: " + saldo);
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nie można odczytać informacji o koncie.");
    }

    public double getCurrentBalance2(String username) {
        return this.currentBalance2;
    }

    public void addFunds(String username, double amount) {
        String[] fields = new String[0];

        try {
            Path path = Paths.get("database.txt");
            if (Files.exists(path, new LinkOption[0])) {
                List<String> lines = Files.readAllLines(path);

                for (int i = 0; i < lines.size(); ++i) {
                    String line = (String) lines.get(i);
                    fields = line.split(",");
                    String storedUsername = fields[0];
                    if (storedUsername.equals(username)) {
                        double currentBalance = Double.parseDouble(fields[4]);
                        double newBalance = currentBalance + amount;
                        fields[4] = String.valueOf(newBalance);
                        lines.set(i, String.join(",", fields));
                        Files.write(path, lines);
                        System.out.println("Saldo konta zaktualizowane pomyślnie.");
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nie można zaktualizować salda konta.");
        double currentBalance2 = Double.parseDouble(fields[4]);
    }

    public boolean checkUserId(String username, String inputId) {
        try {
            Path path = Paths.get("database.txt");
            if (Files.exists(path, new LinkOption[0])) {
                Iterator i = Files.readAllLines(path).iterator();

                while (i.hasNext()) {
                    String line = (String) i.next();
                    String[] fields = line.split(",");
                    String storedUsername = fields[0];
                    String storedId = fields[3];
                    if (storedUsername.equals(username) && storedId.equals(inputId)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public double getCurrentBalance2() {
        return this.currentBalance2;
    }

    public void updateBalance(String username, double newBalance) {
        try {
            Path path = Paths.get("database.txt");
            if (Files.exists(path, new LinkOption[0])) {
                List<String> lines = Files.readAllLines(path);

                for (int i = 0; i < lines.size(); ++i) {
                    String line = (String) lines.get(i);
                    String[] fields = line.split(",");
                    String storedUsername = fields[0];
                    if (storedUsername.equals(username)) {
                        fields[4] = String.valueOf(newBalance);
                        lines.set(i, String.join(",", fields));
                        Files.write(path, lines);
                        this.currentBalance2 = newBalance;
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nie można zaktualizować salda konta.");
    }
}

