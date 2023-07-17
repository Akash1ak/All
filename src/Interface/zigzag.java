package Interface;

interface wifi
{
    public void jail();
}
interface map
{
    public void bike();

}

class zigzag implements wifi,map
{
    void message()
    {
        System.out.println("draft message");
    }
    @Override
    public void jail()
    {
        System.out.println("its ok");
    }
    @Override
    public void bike()
    {
        System.out.println("i forgot my way");
    }
    public static void main(String[] args)
    {
        zigzag zig = new zigzag();
        zig.jail();
        zig.bike();
        zig.message();
    }

}