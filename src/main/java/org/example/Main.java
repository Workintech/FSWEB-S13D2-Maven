package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi){
        String [] chars = Integer.toString(Math.abs(sayi)).split("");
        String reversed = "";
        for (int i = chars.length; i > 0; i--){
            reversed += chars [i-1];
        }
        return Integer.parseInt(reversed) == Math.abs(sayi);
    }

    public static boolean isPerfectNumber(int sayi) {
        if (sayi <= 0){
            return false;
    }
        int toplam = 0;
                for (int i = 1; i <= sayi/2; i++){
                    if (sayi % i == 0){
                        toplam += i;

                    }
                }
                return toplam == sayi;
    }

    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }

        String[] numToStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] chars = Integer.toString(sayi).split("");
        String[] wordsArr = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {
            wordsArr[i] = numToStr[Integer.parseInt(chars[i])];
        }
        return String.join(" ", wordsArr);
    }
}
