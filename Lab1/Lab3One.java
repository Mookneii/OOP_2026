public class Lab3One {
    public static void main(String[] args) {
       int rows = 10;
       int cols = 10;
       for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
       }
    }
}
