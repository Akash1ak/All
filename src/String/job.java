package String;

public class job
{
    int s=10;
    int g=56;
    void m1()
    {
        System.out.println("this is method");
    }
}
class jobless extends job{
    public static void main(String[] args) {
        jobless jobless =new jobless();
        int d =jobless.g;
        System.out.println(d);
    }
}
