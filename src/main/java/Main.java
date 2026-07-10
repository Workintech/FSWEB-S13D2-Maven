package org.example ;
public class Main {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return original == reverse;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0 || number > 9999) {
            return "Invalid Value";
        }

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String numStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sb.append(words[digit]);
            if (i != numStr.length() - 1) sb.append(" ");
        }

        return sb.toString();
    }
}
