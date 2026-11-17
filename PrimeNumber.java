
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        String input = System.getenv("NUMBER");
        int num;

        if (input != null) {
            num = Integer.parseInt(input);
            System.out.println("Number: " + num);
        } else {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            sc.close();
        }

        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num) && isPrime; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
