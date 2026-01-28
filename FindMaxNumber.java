import java.util.Scanner;
public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of grade :");
        float num = sc.nextFloat();

        if (num >= 91 && num <= 100) {
            System.out.print("Your grade is A");
            
        }
           else if (num >= 81) {
            System.out.print("Your grade is B");
            
        }
             else if (num >= 71) {
            System.out.print("Your grade is c");
            
        }
             else if (num >= 61) {
            System.out.print("Your grade is d");
            
        }
             else if (num >= 51) {
            System.out.print("Your grade is E");
            
        }
         else if (num >= 100) {
            System.out.print("Please Enter Only 100");
            
        }
        else {
             System.out.print("You are fail");
        }

        sc.close();
        

    }
}
