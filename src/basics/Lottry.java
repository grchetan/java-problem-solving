import java.util.Scanner;
public class Lottry {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    System.out.print("Enter a lottery Number: ");
    int n = sc.nextInt();

    if(n >= 50 && n <= 80){
        System.out.println("Congrats ! You have Winner a Bike ");
        if(n >= 50 && n <= 65){
            System.out.println(" Model: Bullet ");

        }
        else if (n >= 50 && n <= 65) {
            System.out.println(" Model: Rajdool ");
        }
    }
    else if (n >= 200 && n <= 280) {
         System.out.println("Congrats ! You have Winner a Kurkure ");
          if(n >= 200 && n <= 240){
            System.out.println(" Flavor : Chilli  ");

        }
        else if (n >= 241 && n <= 280) {
            System.out.println(" Flavor : onion ");
        }
    }

    else if (n >= 300 && n <= 460) {
         System.out.println("Congrats ! You have Winner a Macbook ");
            if(n >= 300 && n <= 380){
            System.out.println(" Model : M1 chip ");

        }
        else if (n >= 381 && n <= 460) {
            System.out.println(" Model : M2 chip");
    } 
    }

    else if (n >= 1100 && n <= 1500) {
         System.out.println("Congrats ! You have Winner a Cycle ");
           if(n >= 1100 && n <= 1300){
            System.out.println(" Brand : Avon Cycle ");

        }
        else if (n >= 1301 && n <= 1500) {
            System.out.println(" Brand : Hero Cycle");
    }
    else {
        System.out.println("better for next time ");
    }

    }
     sc.close(); 
    
}
}