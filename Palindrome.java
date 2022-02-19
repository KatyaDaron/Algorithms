import java.util.Arrays;

class Palindrome {

    static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        char[] beginning = s.substring(0, s.length() / 2).toCharArray();
        char[] ending = s.length() % 2 == 0 ? s.substring(s.length() / 2).toCharArray() : s.substring(s.length() / 2 + 1).toCharArray();
        char[] temp = new char[ending.length];
        int ti = 0;

        for (int i = ending.length - 1; i >= 0; i--) {
            temp[ti] = ending[i];
            ti++;
        }
        ending = temp;

        return Arrays.equals(beginning, ending);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1));

    }
}