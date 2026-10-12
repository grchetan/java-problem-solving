import java.util.*;
public class sorting {
  public static void main(String[] args) {
        int[][] arr = {
            {3, 1, 2},
            {9, 5, 6},
            {8, 7, 4}
        };

        int n = arr.length, m = arr[0].length;
        int[] flat = new int[n * m];

        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                flat[k++] = arr[i][j];
            }
        }

        Arrays.sort(flat);

        k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = flat[k++];
            }
        }

        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }

}

