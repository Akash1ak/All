package Encapsulation;

public class EncapsulationTest {
    private int emp_id;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    private String Mid_name;

    public String getMid_name() {
        return Mid_name;
    }

    public void setMid_name(String mid_name) {
        Mid_name = mid_name;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class test {
    public static void main(String[] args) {
        EncapsulationTest et = new EncapsulationTest();
        et.setEmp_id(101);
        et.setFirst_name("akash");
        et.setMid_name("umakant");
        et.setLastName("Biradar");
        et.setSalary(70000);

        System.out.println("employee id :" + et.getEmp_id());
        System.out.println("first name :" + et.getFirst_name());
        System.out.println("middel name :" + et.getMid_name());
        System.out.println("last name :" + et.getLastName());
        System.out.println("salary is :" + et.getSalary());

        System.out.println("===========================================");
        et.setEmp_id(102);
        et.setFirst_name("shubham");
        et.setMid_name("ramesh");
        et.setLastName("barude");
        et.setSalary(70000);
        System.out.println("employee id :" + et.getEmp_id());
        System.out.println("first name :" + et.getFirst_name());
        System.out.println("middel name :" + et.getMid_name());
        System.out.println("last name :" + et.getLastName());
        System.out.println("salary is :" + et.getSalary());

    }
}