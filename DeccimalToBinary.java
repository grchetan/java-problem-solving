import java.util.Scanner;

public class DeccimalToBinary {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter kar number : ");
    int n = sc.nextInt();
    
    
    String ans = " ";

    while(n > 0) {
      int r = n % 2;
      n = n / 2 ;
      ans = r + ans;
    }

    System.out.println(ans);
 sc.close();
  }
  
  
}
