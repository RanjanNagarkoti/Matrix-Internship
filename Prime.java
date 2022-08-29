package matrixinternship;

// @author Ranjan
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = false;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                result = true;
                break;
            }
        }

        if (!result) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
