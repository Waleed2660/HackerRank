import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String input = scan.nextLine();
            System.out.println("Input is Palindrome: " + checkPalindrome(input));
        }
    }

    static boolean checkPalindrome(String inputString) {
        if (inputString.equals(new StringBuffer(inputString).reverse().toString())) return true;

        return false;
    }
}
