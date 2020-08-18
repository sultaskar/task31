import java.util.*;


    public class Main {

        public static void main(String[] args) {
            String number = "21212";
            checkForPalindrome(number);
        }




        public static void checkForPalindrome(String number) {
            int n = number.length();
            int passed = 0;
            int equalSymbols = 0;
            for (int i = 0; i <= n/2; i++) {
                if (number.charAt(i) == number.charAt((n - 1) - passed)) {
                    equalSymbols++;
                    passed++;
                } else {
                    passed++;
                }
            }
                if (equalSymbols >= n/2){
                    System.out.println("палиндром");
                }
                else {
                    System.out.println("не палиндром");
                }
            }
        }

