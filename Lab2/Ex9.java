import java.util.Scanner;
import java.util.*;

public class Ex9 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int index =100;
        int count =0;
        int[] nums = new int[index];
        for(int i =0 ;i<index; i++){
            System.out.println("Input value in Array at index "+i+": ");
            nums[i] = input.nextInt();
            input.nextLine();
            count++;
            System.out.println();
            System.out.println("Do you want to add more (y/n)?: ");
            char ans = input.nextLine().charAt(0);
            if(ans != 'y'){
                break;
            }

        }
        Arrays.sort(nums,0,count);
        System.out.println("The biggest number among in Array is: "+nums[count-1]);
    }
}
