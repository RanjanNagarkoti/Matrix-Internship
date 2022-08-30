package matrixinternship;

// @author Ranjan
public class Question22 {

    public static void main(String[] args) {
        String s1 = "JOHN";
        String s2 = "SMITH";

        String result = "";

        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                result = result + s1.charAt(i) + s2.charAt(i);
            }
            result = result + s2.substring(s1.length(), s2.length());
        } else {
            for (int i = 0; i < s2.length(); i++) {
                result = result + s1.charAt(i) + s2.charAt(i);
            }
            result = result + s1.substring(s2.length(), s1.length());
        }
        System.out.println(result);
    }

}
