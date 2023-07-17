import javax.swing.*;

public class Indian {

    String firstName;
    String lastName;
    String middleName;
    String aadharCard;
    String panCard;
    String address;
    int age;

    void eat(String firstName, String middleName, String lastName) {
        System.out.println("I am taking my meal, my name is " + firstName + " " + middleName + " " + lastName);
    }

    int getMyAge(int age) {
        return age + 2;
    }

    public static void main(String[] args) {
        //Object creation
        //ClassName variableName = new ClassName();
        Indian Akee = new Indian();
        Akee.eat("Akash", "Umakant", "Biradar");
        Akee.getMyAge(23);

//        Indian suarabh = new Indian();
//        suarabh.eat("Saurabh");
//        suarabh.getMyAge(25);
        //method calling
        //variableName.methodname();

    }

}
