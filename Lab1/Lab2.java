import org.w3c.dom.Text;

public class Lab2{
    public static void main(String[] args){
        System.out.printf("%-10s %20s\n", "\\n", "Line break.");
        System.out.printf("%-10s %20s\n", "\\t", "Tabulation.");
        System.out.printf("%-10s %20s\n", "\'", "Single quote.");
        System.out.printf("%-10s %20s\n", "\"", "Double quote.");
        System.out.printf("%-10s %20s\n", "\\", "\sign.");
        System.out.printf("%-10s %20s\n", "\\\\", "\\Sign.");
        System.out.printf("%-10s %20s\n", "//", "Line comment.");
        System.out.printf("%-10s %20s\n", "/*...*/", "Block comment.");
        System.out.printf("%-10s %20s\n", "\"\"\"\n\"\"\"", "Text block.");

    }
    
}