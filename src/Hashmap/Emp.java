package Hashmap;




//public class Emp implements Comparable<Emp>
//{
//    private int Emp_no;
//    private String name;
//    private String email;
//    private int salary;
//
//    public int getEmp_no() {
//        return Emp_no;
//    }
//
//    public void setEmp_no(int emp_no) {
//        Emp_no = emp_no;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Emp{" +
//                "Emp_no=" + Emp_no +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
////    public String toString()
////    {
////        return Emp_no + name + email +salary ;
////    }
//
//    public Emp(int emp_no, String name, String email, int salary) {
//       this. Emp_no = emp_no;
//        this.name = name;
//        this.email = email;
//        this.salary = salary;
//    }
//
//    public static void main(String[] args) {
//        Map<Emp, String> map = new HashMap<>();
//        map.put(new Emp(01, "akash", "abiradar@gmail", 45800), "ok");
//        map.put(new Emp(04, "Shubham", "sbhum@gmail", 54900), "done");
//        map.put(new Emp(03, "saurabh", "saurabh@gmail", 47800), "keep");
//        map.put(new Emp(02, "Omkar", "omkar@gmail", 85800), "it");
//
//
//      //  Comparator<Emp> e = (o1,o2)->o1.getName().compareTo(o2.getName()); //lambda function java 8
//
//
////        List ref = new ArrayList(map.keySet());
////        Collections.sort(ref,e);
////        System.out.println(ref);
//
//        List ref = new ArrayList(map.keySet());
//        Collections.sort(ref);
//        System.out.println(ref);
//    }
//
//
//    @Override
//    public int compareTo(Emp o) {
//       // return this.getEmp_no() - o.getEmp_no();
//         return this.getName().compareTo(o.getName());
//    }
//}
//

import java.util.*;

public class Emp implements Comparable<Emp>
{
    private String name;
    private int id;
    private double salary;
    private String email;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name =name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id =id;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary =salary;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email =email;
    }
    public Emp(String name,int id,double salary,String email)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.email =email;
    }

    public String toString()
    {
        return "Emp {" +
                "Emp {" + " ,Name= " + name +
                " ,Id = " + id + " ,Salary =" + salary +
                " ,Email = " + email +
                '}';
    }

    public static void main(String [] args)
    {
        Map<Emp,String> map = new HashMap<>();
        map.put(new Emp("Akash",45,88000,"akash@gmail.com"),"ok");
        map.put(new Emp("shubham",46,75000,"shubham@gmail.com"),"done");

        map.put(new Emp("saurabh",47,78000,"saurabh@gmail.com"),"kk");

        map.put(new Emp("omkar",10,80000,"onkar@gmail.com"),"ll");

        List ref = new LinkedList(map.keySet());
        Collections.sort(ref);
        System.out.println(ref);

    }



    public int compareTo(Emp o){
        return this.getName().compareTo(o.getName());
    }
}