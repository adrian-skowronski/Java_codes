import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcja = menu();
        Scanner scan = new Scanner(System.in);
        switch(opcja){
            case 1:
                System.out.println("Wprowadź promień koła: ");
                double r = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name = scan.next();
                Circle circle = new Circle(r,name);
                        circle.wypisz();
                        break;
            case 2:
                System.out.println("Wprowadź długość boku a: ");
                double a = scan.nextDouble();
                System.out.println("Wprowadź długośc boku b: ");
                double b = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name2 = scan.next();
                Rectangle rectangle = new Rectangle(a,b,name2);
                rectangle.wypisz();
                break;
            case 3:
                System.out.println("Wprowadź długość boku a: ");
                double a2 = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name3 = scan.next();
                Square square = new Square(a2,name3);
                square.wypisz();
                break;
            case 4:
                System.out.println("Wprowadź długośc krawędzi a: ");
                double a3 = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name4 = scan.next();
                Cube cube = new Cube(a3,name4);
                cube.wypisz();
                break;
            case 5:
                System.out.println("Wprowadź długość krawędzi a: ");
                double a4 = scan.nextDouble();
                System.out.println("Wprowadź długość krawędzi b: ");
                double b2 = scan.nextDouble();
                System.out.println("Wprowadź długość krawędzi c: ");
                double c = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name5 = scan.next();
                Rectangular rectangular = new Rectangular(a4,b2,c,name5);
                rectangular.wypisz();
                break;
            case 6:
                System.out.println("Wprowadź promień podstawy: ");
                double r2 = scan.nextDouble();
                System.out.println("Wprowadź wysokość stożka: ");
                double h = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name6 = scan.next();
                Cone cone = new Cone(h,r2,name6);
                cone.wypisz();
                break;
            case 7:
                System.out.println("Wprowadź promień kuli: ");
                double r3 = scan.nextDouble();
                System.out.println("Wprowadź nazwę figury: ");
                String name7 = scan.next();
                Sphere sphere = new Sphere(r3,name7);
                sphere.wypisz();
                break;
            default:
                System.out.println("Wybrałeś niedostępną opcję!");
        }
    }
    public static int menu(){
        System.out.println("Wybierz figurę: ");
        System.out.println("1 - koło");
        System.out.println("2 - prostokąt");
        System.out.println("3 - kwadrat");
        System.out.println("4 - sześcian");
        System.out.println("5 - prostopadłościan");
        System.out.println("6 - stożek");
        System.out.println("7 - kula");
        System.out.print("Wybieram opcję: ");
        Scanner scan = new Scanner(System.in);
        int o = scan.nextInt();
        return o;
    }
}