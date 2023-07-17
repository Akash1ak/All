package Abstraction;

abstract class Earth
{
 abstract void tree();
 void plant()
 {
     System.out.println("thid is a plant");
 }
}
class water extends Earth
{
    @Override
    void tree()
    {
        System.out.println("Tree needs a Water");
    }

    public static void main(String[] args)
    {
      water water = new water();
      water.plant();
      water.tree();
    }
}
