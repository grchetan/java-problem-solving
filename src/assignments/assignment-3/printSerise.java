import java.util.Scanner;
public class printSerise {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a seriese of number :");
    int n1 = sc.nextInt();
    
    System.out.println("Enter a seriese of number :");
    int n2= sc.nextInt();

    int count = 0;
    int i = 1;

    int term;

    while (count < n1) {
      term = 3 * i + 2;

      if (term % n2 != 0) {
        System.out.println(term);
        count++;
      }

      i++;
    }

    sc.close();



  }

  
}
