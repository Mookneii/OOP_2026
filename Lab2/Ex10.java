import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("=== Math Menu ===\r\n" + //
                        "1. Addition (+)\r\n" + //
                        "2. Substruction (-)\r\n" + //
                        "3. Multiplication (x)\r\n" + //
                        "4. Division (/)\r\n" + //
                        "5. Quit\r\n" + //
                        "");
        System.out.print("Please choose an option: ");
        int ch = input.nextInt();
        switch (ch) {
            case 1:{
                System.out.println("=== Addition (+)===\r\n" + //
                                        "Please input value A: ");
                int a = input.nextInt(); 
                 
                System.out.println("Please input value B: ");
                int b = input.nextInt(); 
                double res = a + b;
                System.out.println("Answer of A + B = "+ res);
                          
                
                break;
            }
                case 2:{
                    System.out.println("=== Substruction (-)===\r\n" + //
                                        "Please input value A: ");
                int a = input.nextInt(); 
                    
                System.out.println("Please input value B: ");
                int b = input.nextInt(); 
                double res1 = a - b;
                System.out.println("Answer of A - B = "+ res1);
                 break;         
                }
                 case 3:{
                    System.out.println("=== Multiplication (*)===\r\n" + //
                                        "Please input value A: ");
                int a1 = input.nextInt(); 
                   
                System.out.println("Please input value B: ");
                int b1 = input.nextInt(); 
                double res1 = a1 * b1;
                System.out.println("Answer of A * B = "+ res1);
                 break;         
                }
                case 4:{
                    System.out.println("=== Division (/)===\r\n" + //
                                        "Please input value A: ");
                int a1 = input.nextInt(); 
                      
                System.out.println("Please input value B: ");
                int b1 = input.nextInt(); 
                double res1 = (double)a1 / b1;
                System.out.println("Answer of A / B = "+ res1);
                 break;         
                }
                case 5: 
                System.exit(0);
        
            default:
                System.out.println("Invalid Input!");
                break;
        }
        System.out.println("Do you want to continue? If no go to Menu.\r\n" + //
                        "Input your answer (y/n): ");
                         input.nextLine();
        char s = input.nextLine().charAt(0);
       
        if(s == 'n' || s == 'N'){
            System.out.println("Programming ended!!");
            break;
        }
    }
    }
}
