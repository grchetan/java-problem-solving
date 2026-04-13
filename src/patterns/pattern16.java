public class pattern16 {
  public static void main(String[] args){

     int n = 5;
    for(int row = 0; row < n; row++){

        // Space
        for(int col = 0; col < 2 * row; col++){
            System.out.print("  ");
        }

        // Star Print
        for(int col = 0; col < n - row ; col++){
            System.out.print("* ");
        }
        System.out.println(); 
  }

  for(int row =n -2; row >= 0; row--) {
    for (int col = 0; col < 2*row; col++) {
      System.out.print( "  ");
    }

    for(int col = 0; col < n - row; col++){
      System.out.print("* ");

    }
    System.out.println();
  }
}
}