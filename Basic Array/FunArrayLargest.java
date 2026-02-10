public class FunArrayLargest {

  public static void maximum(int[] arr){

    int maxi = arr[0];

    for(int i= 0; i < arr.length; i++){
      if (arr[i] > maxi) {
        maxi = arr[i];

        
        
      }
    }
  }
  public static void main(String[] args) {
    
  int[] arr = {1, 23, 4, 64,8 ,-2};

  maximum(arr);

 




  }
  
}
