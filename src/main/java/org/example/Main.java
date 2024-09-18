package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String strNum = String.valueOf(num);
        int length = strNum.length();
        for (int i = 0; i < length / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if(num<0) return false;
        int total = 0;
        for(int i = 1; i<num;i++){
          if(num%i==0){
              total = total + i;
          }
        };
        return total==num;
    }


    public static String numberToWords(int num) {
        if(num<0) return "Invalid Value";
        String strNum = String.valueOf(num);
        String result = "";

        for(char character : strNum.toCharArray()){
            switch (character){
                case '0': result = result + "Zero "; break;
                case '1': result = result + "One " ; break;
                case '2': result = result + "Two "; break;
                case '3': result = result + "Three "; break;
                case '4': result = result + "Four "; break;
                case '5': result = result + "Five "; break;
                case '6': result = result + "Six "; break;
                case '7': result = result + "Seven "; break;
                case '8': result = result + "Eight "; break;
                case '9': result = result + "Nine "; break;
            }
        };

        System.out.println(result);
        return result.trim();
    }

}
