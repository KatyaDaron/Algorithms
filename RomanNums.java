import java.util.HashMap;
import java.util.Map;

public class RomanNums {

    static Map<String, Integer> values = new HashMap<>();

    public static void main(String[] args) {

        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        System.out.println(romanToInt("III"));

    }

    static int romanToInt(String s) {

        String lastSymbol = s.substring(s.length() - 1);
        int lastValue = values.get(lastSymbol);
        int total = lastValue;

        for (int i = s.length() - 2; i >= 0; i--) {

            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);

            total = lastValue > currentValue ? total - currentValue : total + currentValue;

            lastValue = currentValue;
        }
        return total;
    }
}
