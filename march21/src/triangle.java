import java.util.*;
public class triangle
{
    int b;
    int h;
    float area=0;
    Scanner sc =new Scanner(System.in);
    public void tri()
    {
        System.out.println("enter a base and hight");
        int b=sc.nextInt();
        int h=sc.nextInt();
        double area=0.5*b*h;
        System.out.println("area of triangle="+area);
    }
    public static void main(String [] args)
    {
        triangle ok = new triangle();
        ok.tri();
    }
}
