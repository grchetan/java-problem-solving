import java.util.Scanner;
public class Findlargest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[8];
    int largest = arr[0];

    System.out.println("Enter a number array :");

    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }

    for(int i = 1; i < arr.length; i++) {
      if(arr[i] > largest) {
        largest = arr[i];
      }

    }


    System.out.println("The largest number in the array is: " + largest);

    sc.close();

    

  }

  
}
