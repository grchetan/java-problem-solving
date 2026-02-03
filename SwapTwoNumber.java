//  swap two number without using 3 variable
import java.util.Scanner;
public class SwapTwoNumber {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a first number a:");
    int a = sc.nextInt();

    System.out.print("Enter a first number b:");
    int b = sc.nextInt();

    a = b + a;
    b = a - b;
    a = a - b;

    System.out.println("The a number is a:" + a );
    System.out.print("The a number is b:" + b );


     sc.close();


  }
  
}
