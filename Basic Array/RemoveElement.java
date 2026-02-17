public class RemoveElement {
  public static void main(String[] args) {

    int[] nums = {3 , 2 , 2, 3};
    int rem = 0;
    int val = 3;
   

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val ){
                nums[rem] = nums[i];
                rem++;
                

            }
          
        }

          for(int i = 0; i < nums.length ; i++){
            System.out.print(nums[i] +" ");
          }


    

  }
  
}
