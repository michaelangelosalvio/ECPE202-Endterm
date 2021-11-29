import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class HashMapActivity {
    public static void main(String[] args) {
        Product p1 = new Product("11111","Kitkat",39);
        Product p2 = new Product("22222","Snickers",40);
        Product p3 = new Product("33333","Hersheys",60);
        Product p4 = new Product("44444","Butterfinger",80);
        Product p5 = new Product("11111","Coffee",80);

        LinkedList<Product> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p1);
        list.add(p2);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        removeDuplicates(list);

        /**
         * check your results here by checking printing the
         * list and verifying if there are no duplicates
         */

    }

    /**
     * Create a program that checks the list and removes duplicates
     * from it. The function accepts the list as a parameter
     *
     * Use HashMap and LinkedList to remove duplicates from the list
     * @param list
     */

    public static void removeDuplicates(LinkedList<Product> list) {
        /**
         * start code here
         */


        /**
         * end code here
         */
    }
}

