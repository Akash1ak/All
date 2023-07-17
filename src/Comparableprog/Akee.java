package Comparableprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Akee implements Comparable<Akee>
{
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Akee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Akee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String  [] args) {
        Akee ok = new Akee(01,"akash",95000);
        Akee ok2 = new Akee(03,"saurabh",60000);
        Akee ok1 = new Akee(02,"shubham",88000);


        List<Akee> so = new ArrayList<>();
        so.add(ok);
        so.add(ok1);
        so.add(ok2);

        Collections.sort(so);
        System.out.println(so);

    }

    @Override
    public int compareTo(Akee o) {
        return this.name.compareTo(o.getName());
    }

}
