import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    @DisplayName("Palindrom Sayılar Testi")
    @Test
    public void testIsPalindrome(){
        assertEquals(Main.isPalindrome(-1221), true);
        assertEquals(Main.isPalindrome(707), true);
        assertEquals(Main.isPalindrome(11212), false);
    }

    @DisplayName("Mükemmel Sayılar Testi")
    @Test
    public void testIsPerfectNumber(){
        assertEquals(Main.isPerfectNumber(6), true);
        assertEquals(Main.isPerfectNumber(28), true);
        assertEquals(Main.isPerfectNumber(5), false);
        assertEquals(Main.isPerfectNumber(-1), false);

    }

    @DisplayName("Sayıları Kelimelere Cevirme Testi")
    @Test
    public void testNumberToWords(){
        assertEquals(Main.numberToWords(123), "One Two Three");
        assertEquals(Main.numberToWords(1010), "One Zero One Zero");
        assertEquals(Main.numberToWords(-12), "Invalid Value");
    }
}
