package multipalInheritance;

public class Bike
{
    void horn()
    {
        System.out.println("this is a first bike and his horn is so sclient");
    }
}
class hero extends Bike
{
    void ok()
    {
        System.out.println("hero is also one of the best bike");
    }
}
class car extends hero{
    void rada()
    {
        System.out.println("car is looking like a killer");
    }
}
class jet extends car
{
    void run()
    {
        System.out.println("car is run on the road and jet in air");
    }
}
class sheep extends jet{
    public static void main(String[] args) {
        sheep sheep =new sheep();
        sheep.horn();
        sheep.ok();
        sheep.rada();
        sheep.run();
    }
}