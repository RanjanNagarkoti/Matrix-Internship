package matrixinternship;

// @author Ranjan
import java.util.Scanner;

public class MatrixInternship {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.printf("The factorial of %d is %d", num, factorial);
    }

}
