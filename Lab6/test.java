import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws Exception {
        // PrintWriter writer = new PrintWriter("file.txt");
        // writer.println("Hello");
        // writer.println("World");
        // writer.close();
        Scanner read = new Scanner(new File("file.txt"));
        while(read.hasNextLine()){

            String line = read.nextLine();
            String[] part = line.split(",");    
            for( String s: part){
                System.out.print(s + " ");
            }        
            System.out.println();
        }
        read.close();

    }
}
