package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  Comparator_prog
{
    private int rollNo;

    private String firstName;
    private double salary;
    private char characters;

    @Override
    public String toString() {
        return "Comparator_prog{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", characters=" + characters +
                '}';
    }

    public char getCharacters() {
        return characters;
    }

    public void setCharacters(char characters) {
        this.characters = characters;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Comparator_prog(int rollNo, String firstName, double salary,char characters) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.salary = salary;
        this.characters = characters;
    }

    public static void main(String[] args) {
        Comparator_prog employee = new Comparator_prog(01,"akash",70000,'s');
        Comparator_prog employee1 = new Comparator_prog(02,"saurabh",90000,'u');
        Comparator_prog employee2 = new Comparator_prog(03,"shubham",80000.2,'l');
        Comparator_prog employee3 = new Comparator_prog(04,"vijay",100000,'g');

        List<Comparator_prog> emp = new ArrayList<>();
        emp.add(employee);
        emp.add(employee1);
        emp.add(employee2);
        emp.add(employee3);

        FirstName comparator = new FirstName();
        Collections.sort(emp,comparator);
        System.out.println("first name sort comparator :"+emp);

        Rollno comprator1 =new Rollno();
        Collections.sort(emp,comprator1);
        System.out.println("roll no sort comparator :"+emp);

        Salary comparator2 = new Salary();
        Collections.sort(emp,comparator2);
        System.out.println("salary sort comparator :"+emp);

        characters comparator3 = new characters();
        Collections.sort(emp,comparator3);
        System.out.println("Charactor sort :"+emp);
    }

}
class FirstName implements Comparator<Comparator_prog>
{

    @Override
    public int compare(Comparator_prog o1, Comparator_prog o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
class Rollno implements Comparator<Comparator_prog>
{

    @Override
    public int compare(Comparator_prog o1, Comparator_prog o2) {
        return o1.getRollNo()-o2.getRollNo();
    }
}
class characters implements Comparator<Comparator_prog>
{

    @Override
    public int compare(Comparator_prog o1, Comparator_prog o2) {
        return o1.getCharacters()-o2.getCharacters();
    }
}
class Salary implements Comparator<Comparator_prog>
{

    @Override
    public int compare(Comparator_prog o1, Comparator_prog o2) {
        if(o1.getSalary()>o2.getSalary())
        {
            return 1;
        }
        if(o1.getSalary()< o2.getSalary())
        {
            return -1;
        }
        return 0;
    }
}
