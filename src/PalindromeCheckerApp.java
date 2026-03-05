import java.util.Scanner;

class PalindromeCheckerApp {

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Checker App");
        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input, 0, input.length() - 1))
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");
    }
}