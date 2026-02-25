public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (text.equals(reversed)) {
            System.out.println("The entered string is a palindrome");
        } else {
            System.out.println("The entered string is not a palindrome");
        }

        input.close();
}
}
