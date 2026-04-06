import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File file = new File("data.txt");

        while (true) {
            System.out.println("\n1. View");
            System.out.println("2. Add line");
            System.out.println("3. Quit");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                Scanner read = new Scanner(file);
                while (read.hasNextLine()) {
                    System.out.println(read.nextLine());
                }
                read.close();
            }

            else if (opt == 2) {
                FileWriter fw = new FileWriter(file, true);
                System.out.print("Input text: ");
                fw.write(sc.nextLine() + "\n");
                fw.close();
            }

            else break;
        }
    }
}