import java.util.LinkedList;

public class EmployeeLinkedList {
    private LinkedList<Employee> list;

    public LinkedList<Employee> getList() {
        return list;
    }

    public EmployeeLinkedList() {
        list = new LinkedList<Employee>();
    }

    public void print( ) {
        for ( Employee e : list ) {
            System.out.print(e);
            System.out.print(" --> ");
        }
        System.out.println("NULL");
    }

    public void addToFront(Employee employee) {
        list.addFirst(employee);
    }

    public void removeFromFront() {
        list.remove();
    }

    /**
     * Adds newEmployee before the currentEmployee ; if the currentEmployee is not in the list, nothing happens
     *
     * @param currentEmployee - current employee in the list
     * @param newEmployee - new employee to be added in the list
     */
    //A --> B -- > C
    //addBefore(A,E)
    //E -- > A --> B --> C
    public void addBefore(Employee currentEmployee, Employee newEmployee){

    }

    /**
     * Adds newEmployee after the currentEmployee ; if the currentEmployee is not in the list, nothing happens
     *
     * @param currentEmployee - currently employee in the list
     * @param newEmployee - new employee to be added
     */

    //A --> B -- > C
    //addBefore(A,E)
    //A --> E --> B --> C
    public void addAfter(Employee currentEmployee, Employee newEmployee){
        if(list.contains(currentEmployee)) {
            list.add((list.indexOf(currentEmployee)+1), newEmployee);
        }


    }

    /**
     * Returns true if the list is empty, otherwise false
     * @return
     */

    public boolean isEmpty() {
        int size = list.size();
        if (size != 0) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }
        return true;
    }
}
