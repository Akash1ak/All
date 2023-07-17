public class Inheritance {

    public void add()
    {
        System.out.println("added sucessefully");
    }


}
class Inheritance1 extends Inheritance {
    public void sub()
    {
        System.out.println("substracted sucessfully");

    }
}
class Inheritance2 extends Inheritance{
    public void div()
    {
        System.out.println("divided sucessfully");
    }


    public static void main(String args[])
    {
        Inheritance2 div= new Inheritance2();
        Inheritance1 syso=  new Inheritance1();
        div.add();
        syso.sub();
        div.div();
    }

}