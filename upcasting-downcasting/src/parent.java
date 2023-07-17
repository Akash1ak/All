import java.net.SocketOption;

public class parent
{
    parent()
    {
        System.out.println("this is a parent class constructor");
    }
}
class chield extends parent
{
    chield()
    {
        System.out.println("this is a chield class constructor");
    }
}
class abcd
{
    public static void main(String[] args) {
        parent pe = new chield(); //upcasting // implicate
        // chield ce = new parent(); //downcasting java gives error
    }
}