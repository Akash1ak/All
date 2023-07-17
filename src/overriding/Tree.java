package overriding;

public class Tree
{
    public void geo()
    {
        System.out.println("this is a parent class");
    }
}
class methodoverriding extends Tree
{
    public void geo()
    {
        System.out.println("this is a chield class");
    }
    public static void main(String[] args) {
        methodoverriding obj =new methodoverriding();
        obj.geo();
        Tree obj1 =new Tree();
        obj1.geo();
    }
}
//If superclass and subclass have methods with same name including parameters.
// JVM calls the respective method based on the object used to call the method.i.e.
// if the object used to call the method is of superclass type the method of the superclass is executed.
//Or, if the object is of the type subclass then the method of the superclass is executed.