
public class patter6 {
    public static void main(String[] args) {    

    int n = 9;
    for(int row = 0; row < n; row++){

        // Space
        for(int col = 0; col < 2 * row; col++){
            System.out.print("      ");
        }

        // Star Print
        for(int col = 0; col < n - row ; col++){
            System.out.print("*    ");
        }
        System.out.println();

    }
    
}
}