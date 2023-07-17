package loops;
//Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle
// is greater than its perimeter. For example, the area of the rectangle
// with length = 5 and breadth = 4 is greater than its perimeter

import java.util.Scanner;

public class parameter
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a width");
        int width = sc.nextInt();
        System.out.println("enter a breadrh");
        int breadth = sc.nextInt();

        int parameter = 2*(width+breadth);
        int area = width*breadth;

        if (parameter<area)
            System.out.println("parameter is greater");
        else
            System.out.println("Area is greater");
    }
}
