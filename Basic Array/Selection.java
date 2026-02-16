public class Selection {
  public static void main(String[] args) {
    
    int[] arr = {2 , 12, 9 , 6 , 7 ,10};


    for(int i = 0; i < arr.length -1 ; i++){
      int mini = i;
      
      for(int j = i+1 ; j < arr.length; j++){

        if(arr[j] < arr[mini]){
          mini = j;

        }

      }
      // swap array
      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;
        
      }

       // print array
    for (int num : arr) {
      System.out.print(num + " ");
      System.out.println();
    }

    




  }
  
}
