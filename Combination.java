import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ans = 1;   // har row ke liye reset

            for (int j = 0; j <= i; j++) {
                System.out.print(ans + " ");

                // next combination calculate
                ans = ans * (i - j) / (j + 1);
            }
            System.out.println(); // new line after each row
        }
    }
}
