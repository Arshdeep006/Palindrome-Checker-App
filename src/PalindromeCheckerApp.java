public class PalindromeCheckerApp {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String value = scanner.nextLine();

            char[] letters = value.toCharArray();
            int left = 0;
            int right = letters.length - 1;
            boolean palindrome = true;

            while (left < right) {
                if (letters[left] != letters[right]) {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (palindrome) {
                System.out.println("The entered string is a palindrome");
            } else {
                System.out.println("The entered string is not a palindrome");
            }

            scanner.close();git add .
}
}
