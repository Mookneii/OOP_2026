public class Ex5 {
    public static void main (String[] args){
        
        Calculator c = new Calculator();
        System.out.print("Result A + B is: ");
        c.add(5, 3);
        System.out.println();
        System.out.print("Result of A - B is: ");
        c.subtract(7, 1);
        System.out.println();
        System.out.print("Result of A * B is: ");
        c.multiply(23, 5);
        System.out.println();
        System.out.print("Result of A / B is: ");
        c.divide(20, 4);
        System.out.println();
        c.min(9, 2);
        c.max(7, 4);
        

    }
}
class Calculator{
   
    int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    int subtract(int a, int b){
        System.out.println(a-b);
        return a-b;
    }
    int multiply(int a, int b){
        System.out.println(a*b);
        return a*b;
    }
    int divide(int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    public void max(int a, int b){
        if(a > b){
            System.out.println(a+" is maximum number.");
        }else if(a == b){
            System.out.println("A and B cant be the same.");
        }
        else{
            System.out.println(b+" is maximum number.");
        }
        

    }
    public void min(int a, int b){
        if(a > b){
            System.out.println(b+" is minimum number.");
        }else if(a == b){
            System.out.println("A and B cant be the same.");
        }
        else{
            System.out.println(a+" is minimum number.");
        }
        
    }
}