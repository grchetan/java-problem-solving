import java.util.Scanner;

public class pattern13 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();



        for(int row = 0; row < n ; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }


            // for(int space = 0; space <= n)

        }
        sc.close();
        
    }
    
    
}
