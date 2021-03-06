import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //Start with string of numbers
        String jcdString = "0123456789";

        //Convert string numbers to cha array
        char[] jcdCharArray = jcdString.toCharArray();

        //Define an integer array based on size of original numbers
        int[] jcdIntegerArray = new int[jcdString.length()];

        //For loop to populate integer array
        for (int i = 0; i < jcdString.length(); i++) {

            jcdIntegerArray[i] = (int)jcdCharArray[i] - 48;
        }

        System.out.println(Arrays.toString(jcdIntegerArray));

    }
}
