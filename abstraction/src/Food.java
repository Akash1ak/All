abstract class Food
{
    public abstract void foodmela();

    public void eat()
    {
        System.out.println("pani-puri is my fev dish");
    }
    public void nonveg()
    {
     System.out.println("Sorry pani puri i love chiken");
    }

}
class Checken extends Food
{
    public void foodmela()
    {
        System.out.println("making panipuri is easy as compaired to chiken");
    }
}
class ok
{
    public static void main(String[] args) {
        Checken obj =new Checken();
        obj.foodmela();
        obj.nonveg();

    }
}
