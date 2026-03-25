
import java.util.Scanner;

public class SerejaandDima {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    
    int serejaScore = 0 , dimaScore = 0;;

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
    }

    int left = 0 , right = n - 1;

    int turn = 0;


    while (left <= right) {
      int pick;
      if (arr[left] > arr[right]){
      pick = arr[left];
      left++;}

     else{
      pick=  arr[right];
      right--;
     }

    if (turn % 2 == 0) {
    serejaScore += pick;
    } else {
      dimaScore += pick;
      }

    turn++;
}

    System.out.println(serejaScore +" "+ dimaScore);

  }

}
