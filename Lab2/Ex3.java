import java.util.*;
public class Ex3 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("==== Covid-19 Screen Health ===");
        System.out.println("Q1. Feeling feverish and/or having chills? ");
        int index = 8;
        String[] ans = new String[8];
         ans[0] = input.nextLine();
         System.out.print("Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health condition? ");
         ans[1] = input.nextLine();
          System.out.print("Q3. A new cough that is not due to another health condition? ");
        ans[2] = input.nextLine();

        System.out.print("Q4. New chills that are not due to another health condition? ");
        ans[3] = input.nextLine();

        System.out.print("Q5. A new sore throat that is not due to another health condition? ");
        ans[4] = input.nextLine();

        System.out.print("Q6. A new loss of taste or smell? ");
        ans[5] = input.nextLine();

        System.out.print("Q7. Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days? ");
        ans[6] = input.nextLine();

        System.out.print("Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19? ");
        ans[7] = input.nextLine();
        System.out.println("\n---------------------------------");
        System.out.printf("| %-15s | %-10s |\n", "Questions", "Answer");
        System.out.println("---------------------------------");

        for (int i = 0; i < 8; i++) {
            System.out.printf("| Q%-14d | %-10s |\n", (i + 1), ans[i]);
        }

        System.out.println("---------------------------------");

        input.close();
    }
    
}
