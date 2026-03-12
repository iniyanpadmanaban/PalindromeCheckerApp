public class PalindromeCheckerApp {

    static boolean checkPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        if (result) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        System.out.println("Execution Time: " + (endTime - startTime) + " ns");

    }
}