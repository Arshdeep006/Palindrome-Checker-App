import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

class UseCase7PalindromeCheckerApp {

    static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Checker App");
        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");
    }
}