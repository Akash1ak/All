package loops;

import java.util.Scanner;

//25. The marks obtained by a student in 5 different subjects are input through the keyboard. The student gets a division as per the following rules: Write a program to calculate the division obtained by the student
//
//        Percentage above or equal to 60 - First division
//        Percentage between 50 and 59 - Second division
//        Percentage between 40 and 49 - Third division
//        Percentage less than 40 – Fail
public class marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no of subject");
        int noOfSub =sc.nextInt();
        System.out.println("enter a mark of marathi");
        int marathi = sc.nextInt();
        System.out.println("enter a marks of ENglish");
        int English =sc.nextInt();
        System.out.println("enter a marks of hindi");
        int hindi =sc.nextInt();
        System.out.println("enter a mark of bio");
        int bio = sc.nextInt();
        System.out.println("enter a mark of history");
        int history = sc.nextInt();

        int result = marathi+English+hindi+bio+history;
        int per = result*100/500;
        if(per > 60)
            System.out.println("first division");
        else if(per >=50)
            System.out.println("Secound division");
        else if(per >= 40)
            System.out.println("third division");
        else
            System.out.println("fail");

    }
}
