package hasrelation;

public class Demo
{
    public static void main(String[] args) {
        Test test =new Test();
        test.m1();   // this is a Has-A relationship
        test.m2();
    }
}
class Test
{
    int a =12;
    int b= 12;
    void m1()
    {
        int c =a+b;
        System.out.println("Addition = "+c);
    }
    void m2()
    {
        int d = a-b;
        System.out.println("Substraction = "+d);
    }
}
