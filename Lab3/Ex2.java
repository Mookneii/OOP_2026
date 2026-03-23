import java.util.Scanner;
import java.util.*;

public class Ex2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0;
        
        
        System.out.println("How many number to be input?");
        System.out.print("Number of input: ");
        int index = input.nextInt();
        int[] arr = new int[index];
        for(int i=0; i<index;i++){
            System.out.print("Value #"+(i+1)+": ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        input.close();
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Max: "+arr[index-1]);
        System.out.println("Min: "+arr[0]);
        System.out.println("Average: "+ (double)(sum / index));
        System.out.println("Sum: "+ sum);
        
        
    }
}
