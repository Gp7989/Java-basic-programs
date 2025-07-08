import java.util.Scanner;

public class Exceptionhandling {
        void check ( int num ) throws Exception {
            if (num <= 0)
                throw new Exception("invalid");
            System.out.print("Enter a number: ");
            int originalNum = num;
            int sum = 0;
            int digit;
            while (num > 0) {
                digit = num % 10;
                sum = sum + (digit * digit * digit);
                num = num / 10;
            }
            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number.");
            } else {
                System.out.println(originalNum + " is not an Armstrong number.");
            }
        }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Exceptionhandling obj = new Exceptionhandling();
        obj.check(num);
    }
}
