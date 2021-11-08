import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();

        Employee e1 = new Employee("Juan");
        Employee e2 = new Employee("Cherry");
        Employee e3 = new Employee("Michael");

        list.addToFront(e1);
        list.print();
        list.addToFront(e2);
        list.print();

        //list.removeFromFront();
        //list.print();

        list.getList().add(1,e3);
        list.print();

        int index = list.getList().indexOf(e2);
        System.out.println(index);
        int index_1 = list.getList().indexOf(e1);
        System.out.println(index_1);

        /**
         * Create additional codes that will test the methods that you have created
         */

    }




}
