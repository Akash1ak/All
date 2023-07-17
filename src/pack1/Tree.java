package pack1;
import java.util.*;
public class Tree
{
    protected void method1()
    {
        System.out.println("this is method of parent method1");
    }

}
class plant extends Tree{
    void method2()
    {
        System.out.println("this is child class method1 ");
    }

    public static void main(String[] args) {
        Tree ok = new Tree();
        ok.method1();
    }
}
