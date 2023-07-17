package Forloop;

import java.util.Scanner;

public class multiplication
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num ;
        System.out.println("enter a positive number");
         num = sc.nextInt();
        System.out.println("enter a number "+num);
        for(int i=1; i<=10;i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
