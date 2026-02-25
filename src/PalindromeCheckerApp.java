public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized successfully.");
        System.out.println();

        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}