import java.util.Scanner;
public class OptimizedTranspose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a row");
    int row = sc.nextInt();
    System.out.println("Enter a colum");
    int col = sc.nextInt();


    int[][] arr = new int[row][col];

       for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    for(int i = 0 ; i < row; i++){

      for(int j = 0; j < i; j++){

        int temp = arr[i][j];

      
      }
    }

    sc.close();
    
  }
  
}
