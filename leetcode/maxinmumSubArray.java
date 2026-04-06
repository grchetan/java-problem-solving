import java.util.Scanner;

public class maxinmumSubArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

    int maxi = Integer.MIN_VALUE, sum = 0;
    int start = 0 , end = 0 , tempStart = 0;
    for(int i = 0; i < nums.length; i++){

      sum = sum + nums[i];
      if(sum > maxi){
        maxi = sum;
        start = tempStart;
        end = i;
      }

      if(sum < 0){
        sum = 0;
        tempStart = i + 1;

      }
    }

    for(int i = start; i <= end; i++){
      System.out.println(nums[i] + " ");
    }

    
  }
}