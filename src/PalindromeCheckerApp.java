public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "level";
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
}
}
