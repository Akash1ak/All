package ExceptionHandling;

public class Arth
{
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
        try
        {
            Arth obj =new Arth();
            int sum =a/b;
            System.out.println(sum);
        }catch(ArithmeticException r)
        {
            System.out.println("can not divided by zero");
            r.printStackTrace();
        }
    }
}
