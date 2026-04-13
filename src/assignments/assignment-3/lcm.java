import java.util.Scanner;
public class lcm {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a first number :");
    long n1 = sc.nextLong();

    
    System.out.println("Enter a second number :");
    long n2 = sc.nextLong();
    long product = 1;


    for(long i = 2; i < n1 * n2; i++){
      while (n1 % i == 0 || n2 % i == 0) {
      if (n1 % i == 0 && n2 % i == 0) {
        product = product * i;
        n1 = n1 / i;
        n2 = n2 / i;

        
      }else if (n1 % i == 0) {
        product = product *i;
        n1 = n1 / i;

      }else if (n2 % i == 0) {
        product = product *i;
        n2 = n2 / i;

      }
    }
    }

    System.out.println(product);
    sc.close();

  }
  
}
