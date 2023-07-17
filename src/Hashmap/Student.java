package Hashmap;

import java.util.*;

public class Student implements Comparable<Student> {
    private int Roll_no;
    private String name;
    private String email;
    private int mob_no;

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMob_no() {
        return mob_no;
    }

    public void setMob_no(int mob_no) {
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_no=" + Roll_no +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mob_no=" + mob_no +
                '}';
    }


    public Student(int roll_no, String name, String email, int mob_no) {
        Roll_no = roll_no;
        this.name = name;
        this.email = email;
        this.mob_no = mob_no;
    }

    public static void main(String[] args) {


        Map<Student, String> map = new HashMap<Student, String>();
        map.put(new Student(01,"Akash","abiradar@gmail.com",45785555),"Biradar");
        map.put(new Student(02,"Saurabh","patil@gmail.com",895623),"patil");
        map.put(new Student(8,"Ganesh","ganesh@gmail.com",457863221),"kotalwar");
        map.put(new Student(6,"Prasad","prsad@gmail.com",70201405),"Rudrawar");


        List ref = new ArrayList(map.keySet());
        Collections.sort(ref);
        System.out.println("sorting with name :"+ref);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(getName());
    }



}
