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
        System.out.println("1 - suma elementów tablicy");
        System.out.println("2 - iloczyn elementów tablicy");
        System.out.println("3 - wartość średnia");
        System.out.println("4 - wartość minimalna");
        System.out.println("5 - wartość maksymalna");
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
            case 5:
                opcja5(array);
                break;
            default:
                System.out.println("Niedostępna opcja");
        }
    }
    public static void opcja1(int array[]){
        //suma elementów tablicy
        int suma = 0;
        for (int i=0; i<10; i++){
            suma = suma + array[i];
        }
        System.out.println("Suma elementów tablicy: "+suma);
    }
    public static void opcja2(int array[]){
        //iloczyn  elementów tablicy
        int iloczyn = 1;
        for (int i=0; i<10; i++){
            iloczyn = iloczyn * array[i];
        }
        System.out.println("Iloczyn elementów tablicy: "+iloczyn);
    }
    public static void opcja3(int array[]){
        //wartość średnia}
        int suma = 0;
        for (int i=0; i<10; i++){
            suma = suma + array[i];
        }
        double srednia = suma/10;
        System.out.println("Średnia elementów tablicy: "+srednia);
        }

    public static void opcja4(int array[]){
        //wartość minimalna
        int min = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimalna wartość: " + min);
        }

    public static void opcja5(int array[]){
        //wartośc maksymalna
        int max = array[0];
        for(int i = 1; i < 10; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maksymalna wartość: " + max);
    }
}