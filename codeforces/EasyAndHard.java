import java.util.Scanner;
public class EasyAndHard {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    boolean bol = false;

    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }


    for(int j = 0; j < n ; j++){
      if(arr[j] == 1){
        bol =  true;
      }
    }

    if(bol){
      System.out.println("HARD");
    }else{
      System.out.println("EASY");
    }
  }
  
  
}
