import java.util.*;

public class binarySearch {
    
    public static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,10};
        int target = 8;

       
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, target));
    }
}