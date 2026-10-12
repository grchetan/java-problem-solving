import java.util.Scanner;
public class FactorisationPrint {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number :");
    int num = sc.nextInt();

/*     int i = 2;
    while(i <= num){
      if(num % i == 0){
        num = num / i;
        System.out.print(" " +i);
      }
      else if(num % i != 0){
        i++;
      }
    } */
     for(int i = 2 ; i <=num; i++){
      while(num % i ==0){
        System.out.print(" " + i );
        num =  num/ i;
      }
     }


    sc.close();
  }
  
}
