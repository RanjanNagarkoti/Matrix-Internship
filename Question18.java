package matrixinternship;

// @author Ranjan
public class Question18 {

    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 12; j += 4) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
