public class pattern17 {
  public static void main(String[] args){

    int n = 7;
    int mid = n/2;

    for(int row = 0 ; row <=mid ;row++ ){
         for(int col = 0 ; col < n/2 - row; col++){
          System.out.print("*");
      }

      for(int col = 0 ; col < 2 * row + 1 ; col++) {
        System.out.print(" ");
    }
    


  }
  
}}
