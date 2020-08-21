import java.util.*;


    public class Main {

        public static void main(String[] args) {
            String string = "madam";
            checkForPalindrome(string);
            anotherCheckForPalindrome(string);
        }


        public static void checkForPalindrome(String number) {
            int n = number.length();
            int passed = 0;
            int equalSymbols = 0;
            for (int i = 0; i <= n / 2; i++) {
                if (number.charAt(i) == number.charAt((n - 1) - passed)) {
                    equalSymbols++;
                    passed++;
                } else {
                    passed++;
                }
            }
            if (equalSymbols >= n / 2) {
                System.out.println("палиндром");
            } else {
                System.out.println("не палиндром");
            }
        }

        public static void anotherCheckForPalindrome(String string) {

            StringBuilder stringBuilder = new StringBuilder(string).reverse();
            String reverseString = stringBuilder.toString();
            if (string.equals(reverseString)) {
                System.out.println("палиндром");
            } else {
                System.out.println("не палиндром");
            }

        }
    }

