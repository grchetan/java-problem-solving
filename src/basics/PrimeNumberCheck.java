// Check prime number 
import java.util.Scanner;
public class PrimeNumberCheck {
  public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int n = sc.nextInt();

    boolean isPrime = true;
    if(n <= 1){
      System.out.println("it is not prime");
    }

    for(int i = 2; i < n ;  i++){

      if(n % i == 0){
        isPrime = false;
        break;
      }
    }

    if(isPrime) {
      System.out.println("It is prime");
    }
    else {
      System.out.println("It is not prime");
    }

  sc.close();

  }
}
