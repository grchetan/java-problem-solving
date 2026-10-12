//        *
//      * * *
//    * * * * *
//  * * * * * * *


public class pattern8 {
    public static void main(String[] args){
        

        int n = 4;

        for(int row= 0; row < n; row++){
            for(int col = 0; col < n - row -1; col++)
            System.out.print("  ");
        for(int col = 0; col < 2 * row +1; col++)
        System.out.print(" *");
    System.out.println();
     
        }
       
    }
    
}
