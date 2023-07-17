package ConstructorToString;

public class Employee
{
        private int empId;
        private String firstName;
        private String midName;

    @Override
    public String toString() {
        return "Employee" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary ;

    }

    private String lastName;

    public Employee(int empId, String firstName, String midName, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.salary = salary;
    }

    private double salary;

    public static void main(String[] args) {
        Employee ep =new Employee(100,"akee","Umakant","Biradar",80000);
        System.out.println("values of object "+ep.toString());
        Employee obj =new Employee(102,"shubham","ramesh","barude",80000);
        System.out.println("values of object "+obj.toString());
    }
}
