public class wave {
  public static void wave(int[][] arr, int m,  int n){
for(int col = 0; col < n; col++){
  if(col % 2 == 0){
    for(int row = m - 1; row >=0; row-- ){
      System.out.print(arr[row][col]+ " ");
    }
  }else{
    for(int row = m -1; row >= 0; row--){
      System.out.print(arr[row][col]+" ");
    }
  }

    }
  }
  public static void main(String[] args) {

    int[][] arr = {{1,2,3,4} , {5,6,7,8}, {9,10,11,12}};

    int nrow = arr.length;
    int ncol = arr[0].length;

    wave(arr, nrow, ncol);

    
    
  }
  
}
