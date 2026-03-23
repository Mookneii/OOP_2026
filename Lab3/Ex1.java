import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Program for calculating roots of quadratic equation\r\n" + //
                        "ax^2+ bx +c=0");
        System.out.print("Input value of a: ");
        double a = input.nextDouble();
        System.out.print("Input value of b: ");
        double b = input.nextDouble();
        System.out.print("Input value of c: ");
        double c = input.nextDouble();
        Quadratic cal = new Quadratic();
        cal.Cal(a, b, c);
    }
}
class Quadratic{
    public void Cal(double a, double b, double c){
        double delta = (b * b) - 4*a*c;
        double x1 = (-b - Math.sqrt(delta));
        double x2 = (-b + Math.sqrt(delta));
        System.out.println("X1 = "+x1+", X2 = "+x2);
    }
}
