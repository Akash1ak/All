package inheritance;

public class farm
{
    void grandpaa()
    {
        System.out.println("in my farm wheet is their");
    }
}
class farm01 extends farm{
    void parent()
    {
        System.out.println("wheet +soyabeen");
    }
}
class farm02 extends farm01
{
    void chield ()
    {
        System.out.println("total sweetcorn");
    }
}
class farmimgok extends farm02 {
    public static void main(String[] args) {
        farmimgok fm = new farmimgok();
        fm.grandpaa();
        fm.parent();
        fm.chield();
    }
}
