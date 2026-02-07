import java.util.Scanner;
public class sumofplaces {
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a numbers step 1:");
    int n = sc.nextInt();
   
    int oddSum = 0;
    int evenSum = 0;
    int place = 0;
    
    //  int reminder = n % 10;
     
    //  if(place == 0){
    //   oddSum +=reminder;
    //   place = 1;
    //   n = n / 10;
    //  }

    //  else if(place == 1){
    //   evenSum += reminder;
    //   place = 0;
    //    n = n / 10;
    //  }
    for(place = 1; n > 0; place++ ){

    int reminder = n % 10;
     
     if(place % 2 == 1){
      oddSum +=reminder;
      
      n = n / 10;
     }

     else if(place % 2 == 0){
      evenSum += reminder;
      
       n = n / 10;
     }


      }
      
    
   
    System.out.println(oddSum);
    System.out.println(evenSum);








    sc.close();
  
}
}