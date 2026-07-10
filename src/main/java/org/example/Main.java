package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        int originalNumber = Math.abs(number);
        int reverseNumber = 0;
        int temp = originalNumber;

        while(temp > 0){
            int lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        return originalNumber == reverseNumber;
    }
    public static boolean isPerfectNumber(int number){
        if(number < 0){
            return false;
        }

        int sum = 0;

        for(int i=1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";

        for(char digit : digits){
            switch (digit){
                case '0':
                    numToText = "Zero";
                    break;
                case '1':
                    numToText = "One";
                    break;
                case '2':
                    numToText = "Two";
                    break;
                case '3':
                    numToText = "Three";
                    break;
                case '4':
                    numToText = "Four";
                    break;
                case '5':
                    numToText = "Five";
                    break;
                case '6':
                    numToText = "Six";
                    break;
                case '7':
                    numToText = "Seven";
                    break;
                case '8':
                    numToText = "Eight";
                    break;
                case '9':
                    numToText = "Nine";
                    break;

            }

        }
        return numToText.trim();
    }
}
