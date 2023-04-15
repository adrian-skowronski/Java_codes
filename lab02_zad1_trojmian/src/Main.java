import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wyznacz pierwiastki trójmianu kwadratowego postaci ax^2+bx+c");
        double a = wczytajA();
        double b = wczytajB();
        double c = wczytajC();
        double delta = delta(a, b, c);
        double pierwiastekDelty = pierwiastekDelty(delta);
        double x1 = x1(a, b, pierwiastekDelty);
        double x2 = x2(a, b, pierwiastekDelty);
        rozwiazanie(delta, x1 ,x2);
    }

    public static double wczytajA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź współczynnik a: ");
        double a = scan.nextDouble();
        return a;

    }

    public static double wczytajB() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź współczynnik b: ");
        double b = scan.nextDouble();
        return b;

    }

    public static double wczytajC() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź współczynnik c: ");
        double c = scan.nextDouble();
        return c;
    }

    public static double delta(double a, double b, double c) {
        double delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.println("delta = " + delta);
        return delta;
    }

    public static double pierwiastekDelty(double delta) {
        double pierwiastekDelty = Math.sqrt(delta);
        System.out.println("Pierwiastek kwadratowy z delty wynosi: " + pierwiastekDelty);
        return pierwiastekDelty;
    }

    public static double x1(double a, double b, double pierwiastekDelty) {
        double x1 = ((-b + pierwiastekDelty) / 2 * a);
        System.out.println("x1 = " + x1);
        return x1;
    }

    public static double x2(double a, double b, double pierwiastekDelty) {
        double x2 = ((-b - pierwiastekDelty) / 2 * a);
        System.out.println("x2 = " + x2);
        return x2;
    }
    public static void rozwiazanie(double delta, double x1, double x2){
        if (delta<0) System.out.println("Brak pierwiastków równania!");
        else if (delta==0) System.out.println("Jest tylko jeden pierwiasetk tego równania i wynosi on: "+x1);
        else System.out.println("Są dwa piewiastki tego równania: x1 = " +x1+ " oraz x2 = " +x2);
    }
}