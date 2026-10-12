import java.util.Scanner;
public class sumNumber {

  public static float sum(int a , int b ,int c , int d) {
   int sums = a + b + c + d;
   int avg = sums / 4;
   return avg;
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("Enter a first number : ");
    int a = sc.nextInt();

    System.out.println("Enter a second number : ");
    int b = sc.nextInt();

    System.out.println("Enter a third number : ");
    int c = sc.nextInt();

    System.out.println("Enter a fourth number : ");
    int d = sc.nextInt();


   
    System.out.println("the number average is " + sum(a, b , c, d));

    sc.close();
    
  }
  
}
