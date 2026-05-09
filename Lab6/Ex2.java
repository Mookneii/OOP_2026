import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation cal = new Calculation();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. Sum of two values");
            System.out.println("2. Sum of three values");
            System.out.println("3. Sum of many values");
            System.out.println("4. Multiply of two values");
            System.out.println("5. Multiply of three values");
            System.out.println("6. Multiply of many values");
            System.out.println("7. Max of two values");
            System.out.println("8. Max of three values");
            System.out.println("9. Max of many values");
            System.out.println("10. Min of two values");
            System.out.println("11. Min of three values");
            System.out.println("12. Min of many values");
            System.out.println("13. Average of two values");
            System.out.println("14. Average of three values");
            System.out.println("15. Average of many values");
            System.out.println("16. Quit");
            System.out.print("Choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    int a1 = input.nextInt();
                    int b1 = input.nextInt();
                    System.out.println(cal.sum(a1, b1));
                    break;

                case 2:
                    int a2 = input.nextInt();
                    int b2 = input.nextInt();
                    int c2 = input.nextInt();
                    System.out.println(cal.sum(a2, b2, c2));
                    break;

                case 3:
                    int n3 = input.nextInt();
                    int[] arr3 = new int[n3];
                    for (int i = 0; i < n3; i++) arr3[i] = input.nextInt();
                    System.out.println(cal.sum(arr3));
                    break;

                case 4:
                    int a4 = input.nextInt();
                    int b4 = input.nextInt();
                    System.out.println(cal.multiply(a4, b4));
                    break;

                case 5:
                    int a5 = input.nextInt();
                    int b5 = input.nextInt();
                    int c5 = input.nextInt();
                    System.out.println(cal.multiply(a5, b5, c5));
                    break;

                case 6:
                    int n6 = input.nextInt();
                    int[] arr6 = new int[n6];
                    for (int i = 0; i < n6; i++) arr6[i] = input.nextInt();
                    System.out.println(cal.multiply(arr6));
                    break;

                case 7:
                    int a7 = input.nextInt();
                    int b7 = input.nextInt();
                    System.out.println(cal.max(a7, b7));
                    break;

                case 8:
                    int a8 = input.nextInt();
                    int b8 = input.nextInt();
                    int c8 = input.nextInt();
                    System.out.println(cal.max(a8, b8, c8));
                    break;

                case 9:
                    int n9 = input.nextInt();
                    int[] arr9 = new int[n9];
                    for (int i = 0; i < n9; i++) arr9[i] = input.nextInt();
                    System.out.println(cal.max(arr9));
                    break;

                case 10:
                    int a10 = input.nextInt();
                    int b10 = input.nextInt();
                    System.out.println(cal.min(a10, b10));
                    break;

                case 11:
                    int a11 = input.nextInt();
                    int b11 = input.nextInt();
                    int c11 = input.nextInt();
                    System.out.println(cal.min(a11, b11, c11));
                    break;

                case 12:
                    int n12 = input.nextInt();
                    int[] arr12 = new int[n12];
                    for (int i = 0; i < n12; i++) arr12[i] = input.nextInt();
                    System.out.println(cal.min(arr12));
                    break;

                case 13:
                    double a13 = input.nextDouble();
                    double b13 = input.nextDouble();
                    System.out.println(cal.average(a13, b13));
                    break;

                case 14:
                    double a14 = input.nextDouble();
                    double b14 = input.nextDouble();
                    double c14 = input.nextDouble();
                    System.out.println(cal.average(a14, b14, c14));
                    break;

                case 15:
                    int n15 = input.nextInt();
                    int[] arr15 = new int[n15];
                    for (int i = 0; i < n15; i++) arr15[i] = input.nextInt();
                    System.out.println(cal.average(arr15));
                    break;

                case 16:
                    return;
            }
        }
    }
}

class Calculation {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        return sum;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    int multiply(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) result *= nums[i];
        return result;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }

    int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
        }
        return max;
    }

    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    int min(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) min = nums[i];
        }
        return min;
    }

    double average(double a, double b) {
        return (a + b) / 2;
    }

    double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    double average(int[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        return sum / nums.length;
    }
}