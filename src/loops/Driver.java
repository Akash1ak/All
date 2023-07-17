package loops;


//
//26. A company insures its drivers in the following cases:
//
//        If the driver is married
//        If the driver is unmarried, male & above 30 years of age
//        If the driver is unmarried, female & above 25 years of age

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter married Status");
       String marriedStatus = sc.next();//"married") ;
        System.out.println("entre gender");
        String gender= sc.next();//"male";
        System.out.println("enter age");
        int age= sc.nextInt();

        if(marriedStatus.equals("married"))
        {
            System.out.println("get insured");
        } else if (marriedStatus.equals("married") && gender.equals("male") && age>30) {
            System.out.println("get insured");
        } else if (marriedStatus.equals("unmarried") && gender.equals("Female")&& age>25) {
            System.out.println("get insured");
        }else
            System.out.println("not insured");
    }
}
