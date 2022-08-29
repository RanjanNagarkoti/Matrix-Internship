package matrixinternship;

// @author Ranjan
import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
