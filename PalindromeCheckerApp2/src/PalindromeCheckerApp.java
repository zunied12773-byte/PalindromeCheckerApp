/*
 * Application Name : Palindrome Checker Management System
 * Version          : 1.0
 * Use Case         : UC1 - Application Entry & Welcome Message
 * Description      : Displays the welcome message and system details
 *                    when the application starts.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

