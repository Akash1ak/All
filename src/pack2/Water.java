package pack2;
import pack1.*;
class Water extends A1  {

    void method3()
    {
        System.out.println("parent method 2");
    }
    public static void main(String[] args) {
        Water water= new Water();
        water.method3();
    }



//class h2o extends Water
//{
//    void method4()
//    {
//        System.out.println("this is child method2");
//    }
//
//    public static void main(String[] args) {
//        Tree obj1 =new Tree();
//        obj1.method1();

    }


