import java.util.Scanner;
public class BinaryDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  

    String bin = "";


    while(n > 0) {
      int r = n % 2;
      n = n / 2 ;
      bin = r + bin;
    }

    System.out.println("the binary number is :" + bin);

    
    int binary = Integer.parseInt(bin);


    int power = 0 , d = 0;
    
    while(binary  > 0) {
      int r = binary % 10;
      d = d + r * (int) Math.pow(2, power);
      binary = binary / 10 ;
      power++;
    }

    System.out.println(d);


    
  }
  
}
