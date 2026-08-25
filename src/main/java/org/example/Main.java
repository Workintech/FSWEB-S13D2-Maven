package org.example;

public class Main {


    public static boolean isPalindrome(int number) {
        int n = Math.abs(number);
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }


    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }


    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(number);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '0': sb.append("Zero"); break;
                case '1': sb.append("One"); break;
                case '2': sb.append("Two"); break;
                case '3': sb.append("Three"); break;
                case '4': sb.append("Four"); break;
                case '5': sb.append("Five"); break;
                case '6': sb.append("Six"); break;
                case '7': sb.append("Seven"); break;
                case '8': sb.append("Eight"); break;
                case '9': sb.append("Nine"); break;
            }
            if (i < s.length() - 1) sb.append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        // Palindrom testleri
        System.out.println("isPalindrome(-1221) -> " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) -> " + isPalindrome(707));
        System.out.println("isPalindrome(11212) -> " + isPalindrome(11212));

        System.out.println();

        // Mükemmel sayı testleri
        System.out.println("isPerfectNumber(6) -> " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) -> " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) -> " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) -> " + isPerfectNumber(-1));

        System.out.println();


        System.out.println("numberToWords(123) -> " + numberToWords(123));
        System.out.println("numberToWords(1010) -> " + numberToWords(1010));
        System.out.println("numberToWords(-12) -> " + numberToWords(-12));
        System.out.println("numberToWords(0) -> " + numberToWords(0));
    }
}
