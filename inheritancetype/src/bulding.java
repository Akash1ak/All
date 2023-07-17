public class bulding
{
    public void base()
    {
        int a =1600;
        String b ="area";
        System.out.println("my total builtup is "+a + " "+b);
    }
}
class groundfloor extends bulding
{
    public void floor() {
        int a = 5;
        String y = "room";
        System.out.println("tatal "+y+ " are "+a);
    }
}
class firstfloor extends groundfloor {
    public void owner() {
        String d = "luxiries";
        String cost = "1 cr";
        System.out.println("it making cost is " + cost + " fully " + d);
    }
}
class multipalstories extends firstfloor
{
    public  void total()
    {
        int o =23;
        System.out.println("tatal stories are "+0);

    }
    public static void main(String[] args) {


        multipalstories m = new multipalstories();
        m.base();
        m.floor();
        m.owner();
        m.total();
    }
}
