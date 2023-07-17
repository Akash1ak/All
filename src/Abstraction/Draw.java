package Abstraction;
 abstract class Draw
{
    abstract void draw();
    Draw()
    {

    }
    void n1()
    {
        System.out.println("akee");
    }

}
abstract class Rectangel extends Draw
{
    abstract void Paint();
    void draw()
    {
        System.out.println("this is rectangle");
    }
}
class Circle extends Rectangel
{
    void Paint()
     {
         System.out.println("this is circle");
     }
}
 class Abcd
{
    public static void main(String[] args)
    {
        Circle ab = new Circle();
//        Draw d = new Draw() {
//            @Override
//            void draw() {
//
//            }
       // }
        ab.draw();
        ab.Paint();
    }
}
