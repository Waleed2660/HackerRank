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
        if (inputString.equals(new StringBuilder(inputString).reverse().toString())) return true;

        return false;
    }
}

/*
 * The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of
 * characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.
 * The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class
 * by making a mutable sequence of characters. However the StringBuilder class differs from the StringBuffer class on the basis of synchronization.
 * The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does. Therefore this class is designed for use
 * as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case).
 * Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations.
 * Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that
 * StringBuffer be used
 */