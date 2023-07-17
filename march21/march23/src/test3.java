public class test3
{
    static byte b= 8;
    static short s =9;

    public static byte getB() {
        return b;
    }

    public static void setB(byte b) {
        test3.b = b;
    }

    public static short getS() {
        return s;
    }

    public static void setS(short s) {
        test3.s = s;
    }

    public void m1()
    {
        byte b= 8;
        short s =9;
        System.out.println("values"+b + " "+ s);
    }
    public static void main(String [] args)
    {
        test3 ok =new test3();
        ok.m1();
        ok.setB((byte)8);
        ok.setS((short)6);
        System.out.println("values"+getS()+" "+getB());
    }
}
