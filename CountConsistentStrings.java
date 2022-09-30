public class CountConsistentStrings {

    static int countConsistentStrings(String allowed, String[] words) {

        char[] ch = allowed.toCharArray();
        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            char[] fromArray = words[i].toCharArray();
            for (int x = 0; x < fromArray.length; x++) {
                for (int y = 0; y < ch.length; y++) {
                    if (fromArray[x] == ch[y] && x != fromArray.length - 1) {
                        break;
                    } else if (fromArray[x] == ch[y] && x == fromArray.length - 1) {
                        sum++;
                    } else if (fromArray[x] != ch[y] && y == ch.length - 1) {
                        x = fromArray.length - 1;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[] words = {"a","b","c","ab","ac","bc","abc"};
        String allowed = "abc";

        System.out.println(countConsistentStrings(allowed, words));
    }
}
