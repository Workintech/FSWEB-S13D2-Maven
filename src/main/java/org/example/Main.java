package org.example;

public class Main {
    public static void main(String[] args) {



    }

    public static boolean isPalindrome(int num1) {
        int original = num1; // num1'in orijinal halini koruyor.
        int reverse = 0;

        num1 = Math.abs(num1); // Negatif sayılar için mutlak değeri alıyor.

        while (num1 != 0) {
            int remainder = num1 % 10;
            reverse = reverse * 10 + remainder;
            num1 = num1 / 10;
        }

        return original == reverse || original == -reverse; // Pozitif ve negatif palindromları kontrol ediyor.
    }

    public static boolean isPerfectNumber(int number1) {

        if (number1 <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i < number1 / 2; i++) {

            if (number1 % i == 0)
                sum += i;
        }
        if (number1 == sum) {
            return true;
        }
        return false;
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

