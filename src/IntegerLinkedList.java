import java.util.LinkedList;

public class IntegerLinkedList {


    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();

        String string1  = "No lemon, no melon"; // palindrome
        System.out.println(isPalindrome(string1));
        String string2 = "Reviver";
        System.out.println(isPalindrome(string2));
        String string3 = "Hello";
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
