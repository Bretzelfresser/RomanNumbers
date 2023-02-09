import java.awt.*;
import java.util.Locale;
import java.util.Map;

public class RomanTranslator {
    protected static final Map<Character, Integer> TRANSLATION = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static int translate(String romanNumber) {
        romanNumber = romanNumber.toUpperCase(Locale.ROOT);
        if (romanNumber.length() == 0)
            return 0;
        int prevValue = 0;
        int number = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int value = TRANSLATION.get(romanNumber.charAt(i));
            if (value < prevValue){
                number -= value;
            }else {
                number += value;
            }
            prevValue = value;
        }
        return number;
    }
}
