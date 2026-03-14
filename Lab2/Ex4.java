import java.util.Scanner;

public class Ex4 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int sec = input.nextInt();
        int hour = sec / 3600;
        int remain = sec % 3600;
        int min = remain / 60;
        int secs = remain % 60;
        System.out.println("Time corresponding to "+sec +" seconds is:: "+hour+":"+min+":"+secs);

    }
}
