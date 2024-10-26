package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int numberInt) {
            String numberString = String.valueOf(numberInt);
            String reverseNumberString = "";

            if(numberString.charAt(0) == '-'){
                numberString = numberString.replace("-", "");
                numberInt = Integer.parseInt(numberString);
            }

            for (int i = numberString.length()-1; i > -1; i--){
                reverseNumberString += numberString.charAt(i);
            }

            int result = Integer.parseInt(reverseNumberString);
            if(result == numberInt){
                return true;
            }
            else{
                return false;
            }
        }

    public static boolean isPerfectNumber(int numberInt) {
        int toplam = 0;

        if(numberInt < 0){
            return false;
        }

        for(int i = 1; i < numberInt; i++){
            if(numberInt % i == 0){
              toplam = toplam + i;
            }
        }
        if(toplam == numberInt){
            return true;
        }
        else{
            return false;
        }
    }
    public static String numberToWords(int numberInt) {
        String numberString = "";
        if(numberInt < 0){
            System.out.println("Yanlis sayi");
            return "Invalid Value";
        }
        String numberAsString = String.valueOf(numberInt);

        char basamak;

        for(int i = 0; i < numberAsString.length(); i++){
            basamak = numberAsString.charAt(i);

            switch (basamak){
                case '0':
                    numberString = numberString + " " + "Zero";
                    break;
                case '1':
                    numberString = numberString + " " + "One";
                    break;
                case '2':
                    numberString = numberString + " " + "Two";
                    break;
                case '3':
                    numberString = numberString + " " + "Three";
                    break;
                case '4':
                    numberString = numberString + " " + "Four";
                    break;
                case '5':
                    numberString = numberString + " " + "Five";
                    break;
                case '6':
                    numberString = numberString + " " + "Six";
                    break;
                case '7':
                    numberString = numberString + " " + "Seven";
                    break;
                case '8':
                    numberString = numberString + " " + "Eight";
                    break;
                case '9':
                    numberString = numberString + " " + "Nine";
                    break;
            }
        }
        return numberString.trim();
    }
}

