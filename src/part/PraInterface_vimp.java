package part;
interface b extends PraInterface_vimp,PraInterface1 //interface can extends more than one interface
{

}
class first{
    void show()
    {
        System.out.println("it is first class :");
    }
}
class second extends first //we can extend only one class with using extends keyword
{
    void dis()
    {
        System.out.println("it is second class:");
    }
}
class third
{
    void bk()
    {
        System.out.println("it is third class:");
    }
}
interface PraInterface_vimp
{
    static void ak()                  // we can create static method inside a interface
    {                                 // we can't create constructor and static block inside a interface
        // it means only abstract method and static method can create inside interface
        System.out.println("it is static method:");
    }
//    {
//        System.out.println("this is iib"); // in interface we can not create iib
//    }
    int a=10;
    void add();
    void sub();
}
interface PraInterface1 extends PraInterface_vimp
{
    int b=30;
    void mul();
}
abstract class PraInterface2 implements PraInterface1, PraInterface_vimp //we can impements more than one interface
{
    static{                                                       // we can create static block inside a abstarction
        System.out.println("it is static intilization block:");
    }
    static void ab()                       // we can create static method in abstarction
    {
        System.out.println("it is second static method:");
    }


    PraInterface2()                //we can create constructor in abstarction
    {
        System.out.println("it is constructor");
    }
    {
        System.out.println("this is iib ");
    }
    abstract void div();
}
class PraInterface13 extends PraInterface2 implements PraInterface1, PraInterface_vimp
{                                           // in normal class it must be  implement inside interface method
    // & abstraction method because we can't create object of abstract and interface
    @Override
    public void add() {
        System.out.println("enter add:"+(a+b));
    }

    @Override
    public void sub() {
        System.out.println("enter sub:"+(b-a));
    }

    @Override
    public void mul() {
        System.out.println("enter mul:"+(a*b));
    }

    @Override
    void div() {
        System.out.println("enter div:"+(b/a));
    }


    public static void main(String[] args) {
        PraInterface13 obj=new PraInterface13();// creating a normal class object we can call all abstract method
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        PraInterface_vimp.ak(); //with using interface name we can call static method (interface static method)
        PraInterface2.ab();     //with using class name we can call static method(abstraction static method)

    }
}