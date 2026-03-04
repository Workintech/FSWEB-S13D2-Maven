package org.example; // Eğer projede paket istenmiyorsa bu satırı silebilirsin.

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Palindrom Testi ---");
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(11212)); // false

        System.out.println("\n--- Mükemmel Sayı Testi ---");
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5));  // false

        System.out.println("\n--- Sayıları Kelimelere Dökme Testi ---");
        System.out.println(numberToWords(1010)); // "One Zero One Zero"
        System.out.println(numberToWords(-12));  // "Invalid Value"
    }

    public static boolean isPalindrome(int number) {
        // Negatif değerleri mutlak değer ile pozitife çeviriyoruz
        number = Math.abs(number);

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder words = new StringBuilder();

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    words.append("Zero ");
                    break;
                case '1':
                    words.append("One ");
                    break;
                case '2':
                    words.append("Two ");
                    break;
                case '3':
                    words.append("Three ");
                    break;
                case '4':
                    words.append("Four ");
                    break;
                case '5':
                    words.append("Five ");
                    break;
                case '6':
                    words.append("Six ");
                    break;
                case '7':
                    words.append("Seven ");
                    break;
                case '8':
                    words.append("Eight ");
                    break;
                case '9':
                    words.append("Nine ");
                    break;
            }
        }

        return words.toString().trim();
    }
}