/*
 * Application Name : Palindrome Checker Management System
 * Version          : 1.0
 * Use Case         : UC1 - Application Entry & Welcome Message
 * Description      : Displays the welcome message and system details
 *                    when the application starts.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        long end = System.nanoTime();
        long time = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + time + " ns");
    }
}

