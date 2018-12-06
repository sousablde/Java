/*
the node class needs essentially two variables
one for the employee instance and one for the next node in the list
 */
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;//null is the default value fro object fields

    public EmployeeNode(Employee employee) {//constructor
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
