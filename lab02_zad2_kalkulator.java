import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Run();
        Close();
    }

    public static void Run() {
        Menu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Którą opcję wybierasz?");
        int opcja = scan.nextInt();
        int a = InputInt1();
        int b = InputInt2()
        switch (opcja) {
            case 1:
                System.out.println("a + b =");
                int a = InputInt1();
                int b = InputInt2();
                Suma(a, b);
                break;
            case 2:
                System.out.println("a - b =");
                int a = InputInt1();
                int b = InputInt2();
                Roznica(a, b);
                break;
            case 3:
                System.out.println("a * b =");
                int a = InputInt1();
                int b = InputInt2();
                Iloczyn(a, b);
                break;
            case 4:
                System.out.println("a / b =");
                int a = InputInt1();
                int b = InputInt2();
                Iloraz(a, b);
                break;
            case 5:
                System.out.println("a ^ b =");
                int a = InputInt1();
                int b = InputInt2();
                Potega(a, b);
            case 6:
                System.out.println("pierwiastek kwadratowy z a =");
                int a = InputInt1();
                Pierwiastek(a);
                break;
            case 7:
                funTryg();
                break;
            default:
                System.out.println("Wybrałeś niedostępną opcję");
                break;
        }

    }

    //menu
    public static void Menu() {
        //wyswietlenie tekstu dla ussera z info jakie może wykonać operacje
        System.out.println("Witaj w kalkulatorze. Wybierz opcję aby wykonać przypisaną do niej operację:");
        System.out.println("1 - suma");
        System.out.println("2 - różnica");
        System.out.println("3 - iloczyn");
        System.out.println("4 - iloraz");
        System.out.println("5 - potęga");
        System.out.println("6 - pierwiastek");
        System.out.println("7 - funkcje trygonometryczne dla kąta podanego w mierze łukowej");
    }

    public static int InputInt1() {
        //wczytanie pierwszej liczby
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę a:");
        int a = scan.nextInt();
        return a;
    }
    public static int InputInt2() {
        //wczytanie drugiej liczby
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź liczbę b: ");
        int b = scan.nextInt();
        return b;
    }

    public static String InputStrign() {
        Scanner sc = new Scanner(System.in);
        String znak = sc.next();
        return znak;
    }

    public static void Suma(int a, int b) {
        int suma = Math.addExact(a, b);
        System.out.println(a+"+"+b+"="+suma);
    }
    public static void Roznica(int a, int b) {
        int roznica = Math.subtractExact(a, b);
        System.out.println(a+"-"+b+"="+roznica);

    }

    public static void Iloczyn(int a, int b) {
        int iloczyn = Math.multiplyExact(a, b);
        System.out.println(a+"*"+b+"="+iloczyn);
    }

    public static void Iloraz(int a, int b) {
        if (b==0) System.out.println("Nie dziel przez 0!");
        else {
            int iloraz = Math.divideExact(a, b);
            System.out.println(a + "/" + b + "=" + iloraz);
        }
    }

    public static void Potega(int a, int b) {
        int potega = Math.pow(a, b);
        System.out.println(a+"^"+b+"="+potega);

    }

    public static void Pierwiastek(int a) {
        int pierwiastek = Math.sqrt(a);
        System.out.println("pierwiastek kwadratowy z "+a+"wynosi "+pierwiastek);

    }

    public static void funTryg() {

    }


    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjść t || T");
        String znak = InputStrign();
        String st1 = "t";
        String st2 = "T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
        //equals zwraca true jeżeli dwa podane ciągi są takie same, czyli czy znak ==st1
    }
}