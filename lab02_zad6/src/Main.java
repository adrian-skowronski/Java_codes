import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        petla();
    }
    public static void petla(){
        while(true){
            System.out.println("Wprowadź liczbę całkowitą:");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            if(x<0) {
                System.out.println("Koniec pętli");
                break;
            }
            System.out.println("Wprowadziłeś: " +x);
        }
    }
}