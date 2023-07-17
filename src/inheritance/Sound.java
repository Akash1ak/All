package inheritance;

public class Sound
{
    void bass()
    {
        System.out.println("bass is so high");
    }
}
class system extends Sound
{
    void  light()
    {
      System.out.println("in new sound System addition of lights and Screen added ");
    }
}
class DjSystem extends system
{
    public static void main(String[] args) {
        DjSystem dj =new DjSystem();
        dj.bass();
        dj.light();
    }
}