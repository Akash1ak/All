package loops;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();


        while (num != 0)
        {
            int rev=0;
            int mode = num % 10;
             rev = (rev * 10) + mode;
             num = num/10;
            System.out.print(rev);
        }
    }
}
