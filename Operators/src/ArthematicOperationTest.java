public class ArthematicOperationTest
{
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    int addsub(int a,int b,int c,int d)
    {
       // a=b;
        return a+b+c-d;
    }

    public static void main(String[] args) {
        ArthematicOperationTest ao =new ArthematicOperationTest();
       // ao.add(10,70,40)
        int res1 = ao.addsub(10,20,30,10);
        System.out.println("Addition of 3 number is "+(res1 *5));
        System.out.println("Addition of 3 number is "+(res1 - 20));
        System.out.println("Addition of 3 number is "+(res1 + 20));

        int res =ao.add(40,60,30);
        System.out.println("addition od all "+res);
        int test1 =0;
        System.out.println("Addition of 3 number is "+(++test1));
        System.out.println("Addition of 3 number is "+(test1++));
        System.out.println("Addition of 3 number is "+(test1));
    }
}
