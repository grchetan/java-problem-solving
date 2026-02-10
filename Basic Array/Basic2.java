import java.util.Scanner;
public class Basic2 {
  public static void main(String[] args) {

    int[] even = new int[6] ;
    int[] arr = {2 , 3 ,4 ,4};
    
    Scanner sc = new Scanner(System.in);

   
    for(int i = 0; i < 6; i++){
      System.out.println("Enter a number : " + i);
      even[i] = sc.nextInt();
    }

    for(int i = 0; i < 6; i++){
      
      System.out.print(even[i]);
 
    }

    sc.close(); 
    
  }
  
}

