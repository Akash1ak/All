public class mobile
{
    public void m1()
    {
        int s= 150000;
        String n= "apple";
        System.out.println("king of fruits "+n);

    }
    public String m2()
    {
        return "apple is also mobile";
    }
}
class oggy extends mobile
{
    public static void main(String[] args) {
        oggy y =new oggy();
        y.m1();
        y.m2();
        System.out.println( " "+y.m2());
    }
}