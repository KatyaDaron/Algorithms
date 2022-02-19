public class PalindromeShort {

    static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int r = 0;
        while (r < x) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return x == r || r / 10 == x;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1));
    }
}