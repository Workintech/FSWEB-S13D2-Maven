package org.example;

public class Main {
    public static void main(String[] args) {
        int[] num = {12321, 6, 28, 123 };
        System.out.println(num[0] + " palindrome mu? " + isPalindrome(num[0]));

        System.out.println(num[1] +" Mükemmel sayı mı? " + isPerfectNumber(num[1]));
        System.out.println(num[2] +" Mükemmel sayı mı? " + isPerfectNumber(num[2]));
        System.out.println(numberToWords(num[3]));
    }

    public static boolean isPalindrome(int num) {
        int orijinal = num;
        int tersi = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            tersi = tersi * 10 + digit;
            temp /= 10;
        }

        return orijinal == tersi;
    }

    public static boolean isPerfectNumber(int num) {
        if(num < 1) {
            return false;
        }
        int sum = 0;

        for(int i= 1; i <= num/2;i++) {
            if(num % i ==0) {
                sum += i;
            }

        }
        return sum == num;
    }
    public static String numberToWords(int num) {
            int temp = num;
            String result = "";
        String[] numWords = {"Sıfır","Bir","İki","Üç","Dört","Beş","Altı","Yedi","Sekiz","Dokuz"};

        if (num < 0) {
            return "Geçersiz Değer";
        }

        if (num == 0) {
            return "Sıfır";
        }

        while(temp > 0) {
                int digit = temp % 10;
                result = numWords[digit] + " " + result;
                temp /= 10;
            }
        return result.trim();
    }
}

