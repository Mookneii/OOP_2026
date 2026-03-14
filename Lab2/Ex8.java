import java.util.Scanner;
import java.util.*;

public class Ex8 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Input value of A: ");
        nums[0] = input.nextInt();
         System.out.print("Input value of B: ");
        nums[1] = input.nextInt();
         System.out.print("Input value of C: ");
        nums[2] = input.nextInt();
         System.out.print("Input value of D: ");
        nums[3] = input.nextInt();
         System.out.print("Input value of E: ");
        nums[4] = input.nextInt();
        Arrays.sort(nums);
        System.out.println("he smallest number among A, B, C, D, and E is:"+nums[0] );

    }
}
