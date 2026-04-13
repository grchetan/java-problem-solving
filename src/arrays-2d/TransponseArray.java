import java.util.Scanner;
public class TransponseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a row number :");
    int n = sc.nextInt();
    System.out.println("Enter a column number :");
    int m = sc.nextInt();

   
    int[][] arr = new int[n][m];
    System.out.println("Enter Array value");
      for(int i = 0; i < n; i++ ){
        for(int j = 0; j < m; j++ ){
          arr[i][j] = sc.nextInt();
      
        }
    }

    System.out.println("This is main array");
      for(int i = 0; i < n; i++ ){
        for(int j = 0; j < m; j++ ){
         System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
      }



      System.out.println("Transponse prossecing");
      int[][] arr2= new int[m][n]; 

      for(int i = 0; i < n; i++ ){
        for(int j = 0; j < m; j++ ){
          arr2[j][i] = arr[i][j] ;
      
        }
    }
    

      for(int i = 0; i < m; i++ ){
        for(int j = 0; j < n; j++ ){
          System.out.print(arr2[i][j]+ " ");
          
        }
        System.out.println();
    }
sc.close();
    
    
    
  }
  
}
