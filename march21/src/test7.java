import java.util.Scanner;

public class test7
{
    public void add()
    {
       Scanner x=new Scanner(System.in);
       System.out.println("enter the value");
        int num1=x.nextInt();
        int num2 =x.nextInt();
        int sum=num1+num2;
        System.out.println("addition ="+sum);
    }
    public static void main(String [] args)
    {
        test7 ok =new test7();
        ok.add();

    }
}
