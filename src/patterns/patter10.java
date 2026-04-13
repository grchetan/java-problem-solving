import java.util.Scanner;

public class patter10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mid = n / 2;

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(Math.abs(row - mid) + Math.abs(col - mid) == mid){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // next row
        }

        sc.close();
    }
}
