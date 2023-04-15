import java.util.Scanner;

public class Main {
    //7.Napisz program umożliwiający wprowadzanie n liczb
    // oraz sortujący te liczby metodą bąbelkową lub wstawiania.
    // Wyniki wyświetlaj na konsoli.
    public static void main(String[] args) {
        int n = wczytajN();
        int arr[] = tablica(n);
        bubbleSort(arr, n);

    }
    public static int wczytajN(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
                int n = scan.nextInt();
                return n;
    }
    public static int[] tablica(int n){
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
           System.out.println("Wprowadź "+i+"."+" liczbę: ");
           Scanner scan = new Scanner(System.in);
           arr[i] =  scan.nextInt();
        }
        System.out.println("To już wszystkie liczby.");
        return arr;
    }

    public static void bubbleSort(int[] arr, int n){

   for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    // Wyświetlenie posortowanych liczb
        System.out.println("Posortowane liczby: ");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}