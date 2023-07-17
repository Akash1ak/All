package ComparatorvsComparable;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String firstName;
    private String lastName;
    private String middelName;
    private String mail;
    private String city;
    private int pinCode;
    private String state;




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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

    }

    public Student(int rollNo, String firstName, String middelName, String lastName, String mail, String city, int pinCode, String state) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middelName = middelName;
        this.mail = mail;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middelName='" + middelName + '\'' +
                ", mail='" + mail + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", state='" + state + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student obj = new Student(01,"akash","umakant","Biradar","abiradar@gmail.com","Udgir",413517,"Maharashtra");
        Student obj1 = new Student(02,"saurabh","shankarrao","Patil","spatil@gmail.com","Latur",413512,"Karnatka");
        Student obj2 = new Student(03,"shubham","ramesh","Barude","srbarude@gmail.com","kvanaka",413587,"Mp");
        Student obj3 = new Student(04,"vijay","thalapati","Ramanaa","vijaytr@gmail.com","nanded",413507,"UP");
        Student obj4 = new Student(05,"angad","ram","Karbhari","abiradar@gmail.com","kesarwadi",400156,"Kerala");
        Student obj5 = new Student(06,"omkar","ganesh","Ingle","abiradar@gmail.com","hrrigav",400237,"hariyana");

        List<Student> stulist = new ArrayList<>();
        stulist.add(obj);
        stulist.add(obj1);
        stulist.add(obj2);
        stulist.add(obj3);
        stulist.add(obj4);
        stulist.add(obj5);

        Collections.sort(stulist);
       // System.out.println("first name sort :"+stulist);
        System.out.println("pin code sort :"+stulist);
    }

    @Override
    public int compareTo(Student o) {
       //return this.getFirstName().compareTo(o.getFirstName());
        return this.pinCode-o.pinCode;
    }
}
