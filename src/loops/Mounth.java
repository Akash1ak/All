package loops;

import java.util.Scanner;

public class Mounth
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // int mounth = sc.nextInt();
        System.out.println("plz enter a mounth no ");
        int mounth = sc.nextInt();
        if(mounth == 1)
            System.out.println("January");
        else if(mounth == 2)
            System.out.println("February");
        else if (mounth ==3)
            System.out.println("March");
        else if(mounth == 4)
            System.out.println("April");
        else if (mounth == 5)
            System.out.println("May");
        else if (mounth == 6)
            System.out.println("June");
        else if (mounth == 7)
            System.out.println("july");
        else if (mounth == 8)
            System.out.println("August");
        else if(mounth == 9)
            System.out.println("September");
        else if(mounth == 10)
            System.out.println("October");
        else if (mounth == 11)
            System.out.println("November");
        else if (mounth == 12)
            System.out.println("December");
        else
            System.out.println("plz enter a valid key between 1-12");

    }
}
