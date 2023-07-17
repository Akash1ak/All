package part;

public class Tree
{
    void m1()
    {
        System.out.println("this ia parent class");
    }
}
class plant extends Tree
{
    void m2()
    {
        System.out.println("this is child class one");
    }
}
class Soil extends Tree{
    void m3()
    {
        System.out.println("this is child class two");
    }
}
class Water extends Tree{
    void m4()
    {
        System.out.println("this is child class three");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.m1();
        Water water =new Water();
        water.m4();

    }
}
