public class Reverse {

  //Optimized Array reverse Array

  public static void Reverse_arr (int[] arr ){ 
  int i = 0, j = arr.length -1;

  while (i <= j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
  
}
  for(int k = 0; k < arr.length; k++ ){
    System.out.print(arr[k]);
  }
  }
  public static void main(String[] args) {

    int[] arr = {2, 4 , 9, -1 , 0, 8 , 9};
   

    Reverse_arr(arr);
    
  
  }
  
}
