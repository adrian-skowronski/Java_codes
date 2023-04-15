import java.util.Scanner;

public class Main {
    //tablica 10 intów
    public static void main(String[] args) {


        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Wprowadź "+i+ " element tablicy:");
            Scanner scan = new Scanner(System.in);
            array[i] =scan.nextInt();
        }
        System.out.println("Co chcesz wykonać? Wybierz odpowiednią opcję:");
        System.out.println("1 - wyświetl wszystkie elementy tablicy od pierwszego do ostatniego indeksu");
        System.out.println("2 - wyświetl wszystkie elementy tablicy od ostatniego do pierwszego indeksu");
        System.out.println("3 - wyświetl elementy tablicy o nieparzystych indeksach");
        System.out.println("4 - wyświetl elementy tablicy o parzystych indeksach");
        Scanner scanner = new Scanner(System.in);
        int opcja;
        opcja = scanner.nextInt();
        switch (opcja){
            case 1:
                opcja1(array);
                break;
            case 2:
                opcja2(array);
                break;
            case 3:
                opcja3(array);
                break;
            case 4:
                opcja4(array);
                break;
            default:
                System.out.println("Niedostępna opcja");
        }
    }
    public static void opcja1(int array[]){
        // wyświetlanie tablicy od 1. do ostatniego elementu
        for (int i=0; i<10; i++){
            System.out.println("array["+i+"] ="+array[i]);
        }
    }
    public static void opcja2(int array[]){
        //wyświetlanie tablicy od ostatmiego do 1. elementu
        for (int i=9; i>=0; i--){
            System.out.println("array["+i+"] ="+array[i]);
        }
    }
    public static void opcja3(int array[]){
        //wyświetlanie elementów o nieparzystych indeksach
        for (int i=0; i<10; i++){
            if(i%2!=0){
                System.out.println("array["+i+"] ="+array[i]);
            }
        }
    }
    public static void opcja4(int array[]){
        //wyświetlanie elementów o parzystych indeksach
        for (int i=0; i<10; i++){
            if(i%2==0){
                System.out.println("array["+i+"] ="+array[i]);
            }
        }
    }
}