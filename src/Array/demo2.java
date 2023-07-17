package Array;
class A {
    public int x;
    void m1(){

        System.out.println("parent");
    }
    //  private int y;
}
class B extends A {
    void m1(){
        System.out.println("child");
    }
}
public class demo2 extends B{
    public static void main(String[] args) {

        A ob = new B();
        ob.m1();



    }
}
