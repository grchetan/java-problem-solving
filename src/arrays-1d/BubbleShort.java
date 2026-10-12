public class BubbleShort {
  public static void main(String[] args) {

    int[] nums = {4, 5, 3, 6,}; 
 int n = nums.length;

for (int i = 1; i < n; i++) {

  for (int j = 0; j < n - 1; j++) {

    if (nums[j] > nums[j + 1]) {
      int temp = nums[j];
      nums[j] = nums[j + 1];
      nums[j + 1] = temp;
    }

  }
}
  }
  
}
