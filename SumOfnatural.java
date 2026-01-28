import java.util.Scanner;
public class SumOfnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();
     
        int sum = 0;
        for(int i = 1; i <= n;){
            sum = sum + i;
            i++;
        }

        sc.close();
    }
    
}
 