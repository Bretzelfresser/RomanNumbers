import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingleTester {

    @Test
    public void testRomanTranslator(){
        assertEquals(RomanTranslator.translate("I"), 1);
        assertEquals(RomanTranslator.translate("II"), 2);
        assertEquals(RomanTranslator.translate("III"), 3);
        assertEquals(RomanTranslator.translate("IV"), 4);
        assertEquals(RomanTranslator.translate("V"), 5);
        assertEquals(RomanTranslator.translate("VI"), 6);
        assertEquals(RomanTranslator.translate("VII"), 7);
        assertEquals(RomanTranslator.translate("VIII"), 8);
        assertEquals(RomanTranslator.translate("IX"), 9);
        assertEquals(RomanTranslator.translate(""), 0);

        assertEquals(RomanTranslator.translate("XXXIII"), 33);
        assertEquals(RomanTranslator.translate("LXXXI"), 81);
        assertEquals(RomanTranslator.translate("XLIV"), 44);
        assertEquals(RomanTranslator.translate("CMXCIX"), 999);
        assertEquals(RomanTranslator.translate("CDXLIV"), 444);
    }
}
