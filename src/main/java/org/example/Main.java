package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPalindrome(int num1) {


        num1 = Math.abs(num1); // Negatif sayılar için mutlak değeri alıyor.

        char[] digits = String.valueOf(num1).toCharArray();
        String reversed = "";

        for (int i = digits.length - 1; i >= 0; i--) {

            reversed += digits[i];
        }


        return reversed.equalsIgnoreCase(String.valueOf(num1));
    }

    public static boolean isPerfectNumber(int number1) {
        if (number1 < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number1 / 2; i++) {

            if (number1 % i == 0)
                sum += i;
        }
        return number1 == sum;
    }

    public static String numberToWords(int number1) {
        if (number1 < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(number1).toCharArray();
        String numToText = "";

        for (char digit : digits) {

            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine";
                    break;

            }
        }
        return numToText.trim();
    }


}

