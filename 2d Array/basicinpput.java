import java.util.Scanner;
public class basicinpput {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a first index number");
    int n = sc.nextInt();
    System.out.println("enter a second index number");
    int m = sc.nextInt();

    System.out.println("now enter a number for array");

    int[][] arr = new int[n][m];
    
    for(int i = 0; i < n; i++){
      for(int j = 0 ; j < m; j++){
        arr[i][j] = sc.nextInt();
      }
    }


      for(int i = 0; i < n; i++){
      for(int j = 0 ; j < m; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
  
}
