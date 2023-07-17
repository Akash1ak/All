package pack1;

public class ok
{
    void method3()
    {
        System.out.println("this method same package diff class ");
    }
    public static void main(String[] args) {
        Tree obj =new Tree();
        obj.method1();
    }
}
class done extends ok{
//    public static void main(String[] args) {
//        Tree obj =new Tree();
//        obj.method1();
//   }

}
