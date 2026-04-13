import java.util.Scanner;

public class namePrint {
  public static void printName(String name , int a){
    System.out.println(name);
  }
public static void main(String[] args) {

  
  Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter you name :");
    String name = sc.next();

    System.out.println("Enter you name :");
    int a = sc.nextInt();
    


    printName(name , a);

   

    sc.close();

  
  }  
}
