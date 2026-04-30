package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number){
        int originalNumber = Math.abs(number);
        int reverseNumber = 0;
        int temp = originalNumber;

        while(temp > 0){
            int lastDigit = originalNumber % 10;
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

        if (number == 0) {
            return "Zero";
        }
        String result = "";
        String numberStr = String.valueOf(number);

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);

            switch (digit) {
                case '0': result += "Zero"; break;
                case '1': result += "One"; break;
                case '2': result += "Two"; break;
                case '3': result += "Three"; break;
                case '4': result += "Four"; break;
                case '5': result += "Five"; break;
                case '6': result += "Six"; break;
                case '7': result += "Seven"; break;
                case '8': result += "Eight"; break;
                case '9': result += "Nine"; break;
            }
            if (i < numberStr.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}
