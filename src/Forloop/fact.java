package Forloop;

import java.util.Scanner;

public class fact
{
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int i;
//        int num;
//        int fact =1;
//        System.out.println("enter a number");
//        num = sc.nextInt();
//
//        for( int i=1 ; i <=num; i++);
//        {
//            fact *= i;
//        }
//        System.out.println("factorial ="+fact);
        Scanner sc = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
    }
}
