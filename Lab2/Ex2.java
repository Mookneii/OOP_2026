import java.util.Scanner;

public class Ex2 {
    public static void  main(String[] args){
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dollar in Riels:");
        Scanner input = new Scanner(System.in);
        double rate = input.nextDouble();
        System.out.print("Please input money to exchange in Riels: ");
        double amount = input.nextDouble();
        System.out.println();
        double ex = amount / rate;
        System.out.println(amount +" RIELS = "+ex+" USD");
    }
}
