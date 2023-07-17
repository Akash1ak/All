package Forloop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class basepower
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int base;
        int power;
        int result =1 ;

        System.out.println("enter a base");
        base =sc.nextInt();
        System.out.println("enter a power");
        power =sc.nextInt();

        for(int i =1;i<=power ;i++);
        {
            result *=base;
        }
        System.out.println("Result :" +result);
    }
}
