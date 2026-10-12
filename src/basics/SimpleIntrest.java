import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a year time :");
        float t = sc.nextFloat();

        System.out.print("Enter a rate of intrest :");
        float r = sc.nextFloat();


        System.out.print("Enter a principle :");
        int p = sc.nextInt();


        float total = (t * r * p) / 100;
        

        System.out.print("Total amount is :" + total);

        sc.close();
        


    }
}
