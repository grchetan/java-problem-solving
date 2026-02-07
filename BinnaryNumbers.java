import java.util.Scanner;
public class BinnaryNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary number : ");
    int n = sc.nextInt();

    int power = 0 , d = 0;
    while( n > 0) {
      int r = n % 10;
      d = d + r * (int) Math.pow(2, power);
      n = n / 10 ;
      power++;


    }

    System.out.println(d);

sc.close();
  }
  
}
