package org.example; // Eğer projede paket istenmiyorsa bu satırı silebilirsin.

public class Main {

    public static void main(String[] args) {
        // Yazdığın algoritmaları burada test edebilirsin
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

    // 1. Görev: Palindrom Sayıyı Bulma
    public static boolean isPalindrome(int number) {
        // Negatif değerleri mutlak değer ile pozitife çeviriyoruz
        number = Math.abs(number);

        int originalNumber = number;
        int reversedNumber = 0;

        // Sayıyı tersten oluşturma algoritması
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        // İlk baştaki sayı ile tersten oluşturulan sayıyı kıyasla
        return originalNumber == reversedNumber;
    }

    // 2. Görev: Mükemmel Sayıları Bulma
    public static boolean isPerfectNumber(int number) {
        // 0'dan küçük değerler için doğrudan false dön
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        // Sayının yarısına kadar olan bölenleri bulup topluyoruz
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Bölenlerin toplamı sayının kendisine eşit mi?
        return sumOfDivisors == number;
    }

    // 3. Görev: Sayıları Kelimelere Dök
    public static String numberToWords(int number) {
        // Sayı 0'dan küçükse hata mesajı dön
        if (number < 0) {
            return "Invalid Value";
        }

        // 0 durumu için özel kontrol
        if (number == 0) {
            return "Zero";
        }

        // Sayıyı String'e, sonra da karakter dizisine çeviriyoruz
        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder words = new StringBuilder();

        // Her bir rakamı switch-case ile kelimeye dönüştür
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

        // En sonda fazladan kalan boşluğu trim() ile silerek döndür
        return words.toString().trim();
    }
}