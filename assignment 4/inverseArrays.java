import java.util.Scanner;

public class inverseArrays {

    public static void inverseArray(int[] arr, int[] inverse, int index) {
        
        // Base case
        if(index == arr.length) {
            return;
        }

        // Work
        inverse[arr[index]] = index;

        // Recursive call
        // add file
        inverseArray(arr, inverse, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] inverse = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        inverseArray(arr, inverse, 0);

        for(int i = 0; i < n; i++) {
            System.out.print(inverse[i] + " ");
        }
    }
}