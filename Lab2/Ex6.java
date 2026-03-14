import java.util.Scanner;

public class Ex6 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check whether it is a prime number: ");
        int num = input.nextInt();
        boolean check = true;
        if(num <= 1){
            check = false;
        }else if((num % 3 == 0) && (num % 2 != 0)){
            check = false;
            System.out.println(num + " is not a prime number, because it is divisible by 3.");
        }else{
            for(int i = 2 ; i<num; i++){
                if( num % i == 0){
                    check = false;
                    break;
                }
            }
        }
        if(check){
             System.out.println(num+" is a prime number.");
        }


    }
}
