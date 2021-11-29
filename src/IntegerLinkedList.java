import java.util.LinkedList;
import java.util.Locale;

public class IntegerLinkedList {


    public static void main(String[] args) {
//        String string1  = "No lemon, no melon"; // palindrome
//        System.out.println(isPalindrome(string1));
//        String string2 = "Reviver";
//        System.out.println(isPalindrome(string2));
        String string3 = "Hello World";
        System.out.println(isPalindrome(string3));


    }

    /**
     *
     * @param value - String to check if it is a palindrome or not
     * @return true if is a palindrome, returns false if not
     */

    public static boolean isPalindrome(String value) {
        /**
         * code starts here
         */
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        value = value.toLowerCase();
        for ( int i = 0 ; i < value.length() ; i++ ) {
            char c = value.charAt(i);

            if ( c >= 'a' && c <= 'z' ) {
                stack.push(c);
                queue.add(c);
            }
        }

        while ( !stack.isEmpty() ) {
            char c1 = stack.pop();
            char c2 = queue.remove();
            System.out.println ("Comparing " + c1 + " and " + c2);

            if ( c1 != c2 ) {
                return false;
            }
        }

        return true;

        /**
         * code ends here
         */
    }
    public static void print(LinkedList<Integer> stack) {
        for ( Integer e : stack ) {
            System.out.print(e);
            System.out.print(" --> ");
        }
        System.out.println("NULL");
    }

}
