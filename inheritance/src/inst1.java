public class inst1
{
    void m1()
    {
        System.out.println("this is method");
    }
}
class inst2 extends inst1
{
    public static void main(String[] args) {
        inst1 a =  null; //new inst1();
        inst1 b = new inst2();
        System.out.println(b instanceof inst1);
    }
}
