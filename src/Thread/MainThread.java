package Thread;

public class MainThread
{
    public static void main(String[] args) {
        Thread obj =new Thread();

        System.out.println("Current thread is :"+obj);
        System.out.println("name of the current Thread is :"+obj.getName());

        obj.setName("new Thread");

        System.out.println("name of the current thread after changing :"+obj);
    }
}
