public class Lab3 {
    public static void main(String[] args) {
        // System.out.println("************************"); 
        // System.out.println(" **********************");
        // System.out.println("  ********************");
        // System.out.println("   ******************");
        // System.out.println("    ****************");
        // System.out.println("     **************");
        // System.out.println("      ************");
        // System.out.println("       **********");
        // System.out.println("        ********");
        // System.out.println("         ******");
        // System.out.println("          ****");
        // System.out.println("           **");
        int rows =10;
        for( int i = rows; i>=1;i--){
            for(int j =0; j< rows-i; j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        

         


    }
}
