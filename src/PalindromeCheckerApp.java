import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}