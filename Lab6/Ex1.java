import java.util.Scanner;

class Ex1{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
        Math math = new Math();

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Reverse a number");
            System.out.println("2. Rounded number");
            System.out.println("3. Count distinct number");
            System.out.println("4. Decimal to Binary");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Input number: ");
                int num = sc.nextInt();
                System.out.println("Output is: " + math.reverseNumber(num));

            } else if (choice == 2) {
                System.out.print("Input number: ");
                double num = sc.nextDouble();
                System.out.println("Output is: " + math.roundedNumber(num));

            } else if (choice == 3) {
                System.out.print("How many numbers? ");
                int n = sc.nextInt();
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                }

                System.out.println("Distinct count: " + math.countDistinct(arr));

            } else if (choice == 4) {
                System.out.print("Input decimal: ");
                int num = sc.nextInt();
                System.out.println("Binary: " + math.decimalToBinary(num));

            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
    
} 
class AbstractMath{
    int reverseNumber(int num){
        return 0;
    }
    int roundedNumber(double num){
        return 0;
    }
    int countDistinct(int[] values){
        return 0;
    }
    int decimalToBinary(int decimal){
        return 0;
    }
}
class Math extends AbstractMath{
    @Override
    int reverseNumber(int num){
        int reversed = 0;
        while (num!=0) {
            int digit = num % 10;
            reversed = reversed *10 + digit;
            num /= 10;
            
        }
        return reversed;
    }
    @Override
    int roundedNumber(double num){
        int integerPart = (int) num;
        double decimalPart = num - integerPart;
        if (decimalPart >= 0.5){
            return integerPart +1;
        }
        else{
            return integerPart;
        }
    }
    @Override
    int countDistinct(int[] values){
        int count = 0; 
        for(int i =0; i< values.length;i++){
            boolean isDuplicate = false;
            for (int j=0; j<i;j++){
                if(values[i] == values[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                count++;
            }
        }
        return count;
    }
    @Override
    int decimalToBinary(int decimal){
        int binary =0;
        int place = 1;
        while(decimal >0){
            int remainder = decimal % 2;
            binary += remainder * place;
            decimal /=2;
        }
        return binary;
    }
}