import java.util.Scanner;
public class Fibnacci {
  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("Enter a number :");
    int n = sc.nextInt();

    int a = 0;
    int b = 1;
    int cur = 0;
    for (int i = 1; i < n - 1; i++  ) {
    cur = a + b;
    a = b;
    b = cur; 
   
         
    }
    System.out.println();
    System.out.println("The fibonacci " + n + " sum of number is " + cur);
    
    
    sc.close();

  }
  
}
