import java.util.Scanner;
public class basic {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int column = sc.nextInt();
    int[][] arr = new int[rows][column];

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < rows; j++){
        arr[i][j] = sc.nextInt();
      }
    }

      for(int i = 0; i < rows; i++){
      for(int j = 0; j < rows; j++){
        
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }



    sc.close();
    
  }

  
  
}
