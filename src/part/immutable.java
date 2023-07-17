package part;

final class immutable
{
    private final int a=10;
    private final String d="Akee";

    public int getA() {
        System.out.println("this is a value = "+a);
        return a;
    }

    public String getD() {
        System.out.println("this is the value of d = "+d);
        return d;
    }
    immutable(int a,String d)
    {
        System.out.println("this is constructor ");
    }

    public static void main(String[] args) {
        immutable is = new immutable(10,"akash");
        is.getA();
        is.getD();
    }
}
