
import java.util.Scanner;
public class countDigit {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number :");
    int n = sc.nextInt();

    System.out.println("what number count : ");
    int digit = sc.nextInt();

    int count = 0;
    while( n > 0) {
      int reminder = n % 10;
      if(digit == reminder){
        count++;

      }
      n = n/10;
    }

    System.out.println(count);


    sc.close();





  }
}
