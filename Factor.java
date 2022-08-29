package matrixinternship;

// @author Ranjan
import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Factors of " + num + " are: ");

        if (num >= 0) {
            for (int i = 1; i <= num; ++i) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = num; i <= Math.abs(num); ++i) {

                // skips the iteration for i = 0
                if (i == 0) {
                    continue;
                } else {
                    if (num % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }

}
