import java.util.Scanner;
public class Factorial {
public static int factorialNum(int n) {
  int factorial = 1;

  for(int i = 1; i <= n; i++){
    factorial *= i;
  }
  
  return factorial;
  
}


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number :");
    int n = sc.nextInt();


    factorialNum(n);
    System.out.println("the factorial is "+factorialNum(n));

  
    sc.close();

  }
  
}
