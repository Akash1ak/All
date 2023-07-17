package Array;

import java.util.ArrayList;

public class CustomArraylist  {
    int n = 5;
    class Employee {
        int empno;
        String name;
        Employee(int empno, String name) {
            this.empno = empno;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empno=" + empno +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String args[])
    {
        int eno[] = {101, 102, 103, 104, 105};
        String name[] = {"Akash", "shubham", "Angad", "saurabh", "akshay"};
        CustomArraylist cusList = new CustomArraylist();
        cusList.add(eno, name);
    }
    public void add(int eno[], String name[])
    {
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Employee(eno[i], name[i]));
        }
        print(list);
    }
    public void print(ArrayList<Employee> aList)
    {
        for (int i = 0; i < n; i++) {
            Employee e = aList.get(i);
            System.out.println(" Employee Number: " + e.empno);
            System.out.println("Employee Name: " + e.name);
        }
    }

}
