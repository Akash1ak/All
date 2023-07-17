package ExceptionHandling;

import java.util.Scanner;

public class AppaNotFoundException extends RuntimeException
{
    AppaNotFoundException(String msg)
    {
       super(msg);
    }
}
class  Voting {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("ebter your age");
        age = sc.nextInt();
        try {
            if (age <= 18) {
             throw new AppaNotFoundException ("your not eligible for voting");
            } else {
                System.out.println("eligible for voting");
            }
        } catch (AppaNotFoundException e) {
            System.out.println("use voting card");
            e.printStackTrace();
        }
        System.out.println("haaaaaaaaaa");
    }
}