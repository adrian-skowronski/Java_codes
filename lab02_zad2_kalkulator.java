import java.util.Scanner;

public class lab02_zad2_kalkulator {
    public static void main(String[] args) {
        Run();
        Close();
    }

    public static void Run() {
        Menu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Którą opcję wybierasz?");
        int opcja = scan.nextInt();
        switch (opcja) {
            case 1:
                double a = InputInt1();
                double b = InputInt2();
                Suma(a, b);
                break;
            case 2:
                a = InputInt1();
                b = InputInt2();
                Roznica(a, b);
                break;
            case 3:
                a = InputInt1();
                b = InputInt2();
                Iloczyn(a, b);
                break;
            case 4:
                a = InputInt1();
                b = InputInt2();
                Iloraz(a, b);
                break;
            case 5:
                a = InputInt1();
                b = InputInt2();
                Potega(a, b);
                break;
            case 6:
                a = InputInt1();
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


    public static void Menu() {
        //wyswietlenie tekstu dla ussera z info jakie może wykonać operacje
        System.out.println("Witaj w kalkulatorze. Wybierz opcję aby wykonać przypisaną do niej operację:");
        System.out.println("1 - suma a+b");
        System.out.println("2 - różnica a-b");
        System.out.println("3 - iloczyn a*b");
        System.out.println("4 - iloraz a/b");
        System.out.println("5 - potęga a^b");
        System.out.println("6 - pierwiastek kwadratowy z a");
        System.out.println("7 - funkcje trygonometryczne dla kąta podanego w mierze łukowej");
    }

    public static double InputInt1() {
        //wczytanie pierwszej liczby
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę a:");
        double a = scan.nextDouble();
        return a;
    }

    public static double InputInt2() {
        //wczytanie drugiej liczby
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź liczbę b: ");
        double b = scan.nextDouble();
        return b;
    }

    public static String InputStrign() {
        Scanner sc = new Scanner(System.in);
        String znak = sc.next();
        return znak;
    }

    public static void Suma(double a, double b) {
        double suma = a + b;
        System.out.println(a + " + " + b + " = " + suma);
    }

    public static void Roznica(double a, double b) {
        double roznica = a - b;
        System.out.println(a + " - " + b + " = " + roznica);

    }

    public static void Iloczyn(double a, double b) {
        double iloczyn = a * b;
        System.out.println(a + " * " + b + " = " + iloczyn);
    }

    public static void Iloraz(double a, double b) {
        if (b == 0) System.out.println("Nie dziel przez 0!");
        else {
            double iloraz = a / b;
            System.out.println(a + " / " + b + " = " + iloraz);
        }
    }

    public static void Potega(double a, double b) {
        double potega = Math.pow(a, b);
        System.out.println(a + " ^ " + b + " = " + potega);

    }

    public static void Pierwiastek(double a) {
        double pierwiastek = Math.sqrt(a);
        System.out.println("pierwiastek kwadratowy z " + a + " wynosi " + pierwiastek);

    }

    public static void funTryg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miarę łukową kąta w radianach:");
        double kat = scan.nextDouble();
        double sin = Math.sin(kat);
        double cos = Math.cos(kat);
        double tan = Math.tan(kat);
        System.out.println("sin" + kat + " = " + sin);
        System.out.println("cos" + kat + " = " + cos);
        System.out.println("tan" + kat + " = " + tan);
    }


    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjść? Wybierz t lub T");
        String znak = InputStrign();
        String st1 = "t";
        String st2 = "T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
        //equals zwraca true jeżeli dwa podane ciągi są takie same, czyli czy znak ==st1
    }
}
