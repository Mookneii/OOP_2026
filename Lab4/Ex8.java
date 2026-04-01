class BasicMath {

    double addition(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

class AdvancedMath extends BasicMath {

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class Ex8 {
    public static void main(String[] args) {

        BasicMath bm = new BasicMath();
        System.out.println("BasicMath:");
        System.out.println("Addition: " + bm.addition(6, 9));
        System.out.println("Subtract: " + bm.subtract(6, 9));

        AdvancedMath am = new AdvancedMath();
        System.out.println("\nAdvancedMath:");
        System.out.println("Addition: " + am.addition(6, 9));
        System.out.println("Subtract: " + am.subtract(6, 9));
        System.out.println("Multiply: " + am.multiply(6, 9));
        System.out.println("Divide: " + am.divide(6, 9));
    }
}