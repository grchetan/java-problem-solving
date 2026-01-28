public class patter4 {
    public static void main(String[] args){


        int n = 5;

        for(int row = 0; row < n; row++){
            System.out.println();
            for(int col = 0; col < n; col++) {
            if(col < n - row -1){
                System.out.print("  ");
            }else
            {
                System.out.print(" *");
            }

            }
        }
    }
    
}
