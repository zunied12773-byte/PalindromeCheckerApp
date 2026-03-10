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
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : false");
        }
    }
}

