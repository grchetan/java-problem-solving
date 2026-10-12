import java.util.Scanner;


public class patterns {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number :");
    int n = sc.nextInt();

    for(int row = 0 ; row < n; row++){

      for(int col = 0 ; col < n - row - 1; col++){
        System.out.print(" *");
      }
      System.out.println(); 
    }
    sc.close();
  }
}
