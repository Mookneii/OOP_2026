public class Ex6 {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println("The factorial of n :");
         c.factorial(6);
       c.rectangleSurface(5.4, 6);
       c.circleSurface(2.5);
       c.max(5, 23, 12, 6, 7);
       c.min(2, 1, 23, 6, 9);
    }
}
class Calculator{
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    void rectangleSurface(double width, double height){
        System.out.println("Surface of rectangle is: "+ width*height);
    }
    void circleSurface(double radius){
        System.out.println("Surface of circle is: "+3.14 * radius * radius);
    }
    void max(int a, int b, int c, int d, int e) {
    int max = a;

    if (b > max) max = b;
    if (c > max) max = c;
    if (d > max) max = d;
    if (e > max) max = e;

    System.out.println("Biggest number is: " + max);
}
    void min(int a, int b, int c, int d, int e){
        int min = a;

    if (b < min) min = b;
    if (c < min) min = c;
    if (d < min) min = d;
    if (e < min) min = e;
    System.out.println("Smallest number is: " + min);
    }
}