/*
 * Application Name : Palindrome Checker Management System
 * Version          : 1.0
 * Use Case         : UC1 - Application Entry & Welcome Message
 * Description      : Displays the welcome message and system details
 *                    when the application starts.
 */

public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String input = "madam";
            boolean isPalindrome = true;

            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(input + " is a Palindrome.");
            } else {
                System.out.println(input + " is NOT a Palindrome.");
            }
        }
    }

