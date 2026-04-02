import java.util.Scanner;

public class Monkey {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter total number of monkey :");
    int n = sc.nextInt();

    System.out.println("Enter Bnanas per monkey :");
    int k = sc.nextInt();

    System.out.println("Enter Peanuts per monkey :");
    int j = sc.nextInt();

    System.out.println("Enter Total no of Peanuts  :");
    int p = sc.nextInt();

    System.out.println("Enter Total no of Bananas  :");
    int m = sc.nextInt();

    int totalEatsBananasPeanuts = k + j; 
    int totalMonkey = n - totalEatsBananasPeanuts;


    System.out.println(totalMonkey);


    


    sc.close();
  }
  
}
