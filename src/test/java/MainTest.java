import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.stream.IntStream;

import static org.example.Main.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    @DisplayName("Palindromic Sayılar Testi")
    @Test
    public void testIsPalindrome(){
        IntStream.of(-1221, 707).forEach(i -> assertTrue(isPalindrome(i)));
        assertFalse(isPalindrome(11212));
    }

    @DisplayName("Mükemmel Sayılar Testi")
    @Test
    public void testIsPerfectNumber(){
        assertTrue(Main.isPerfectNumber(6));
        assertTrue(Main.isPerfectNumber(28));
        assertFalse(Main.isPerfectNumber(5));
        assertFalse(Main.isPerfectNumber(-1));

    }

    @DisplayName("Sayıları Kelimelere Cevirme Testi")
    @Test
    public void testNumberToWords(){
        assertEquals("One Two Three", Main.numberToWords(123));
        assertEquals("One Zero One Zero", Main.numberToWords(1010));
        assertEquals("Invalid Value", Main.numberToWords(-12));
    }
}
