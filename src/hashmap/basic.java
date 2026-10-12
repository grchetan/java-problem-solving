
import java.util.*;

public class basic {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 5};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }


        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }




        System.out.println(map);
    }
}
  

