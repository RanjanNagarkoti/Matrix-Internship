package matrixinternship;

// @author Ranjan
public class Question14 {

    public static void main(String[] args) {
        int[] arr = {10, 1, 100, 98, 56, 32, 41, 74, 92, 21, 26, 36};

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
