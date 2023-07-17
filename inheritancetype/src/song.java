public class song
{
    public void music() {
        String device = "gitar";
        String device1 = "drum";
        System.out.println("song is created with " + device1 + " " + device + "like other devices");
    }
}
class  lyrices extends song
{
  public void words()
  {
      String f =" fellings ";
      String j =" heart ";
      System.out.println("lyrices mades obvisely words and "+f +"and "+ j);
  }
}
class voice extends lyrices{
    public void throat()
    {
        String r = "practices";
        String d = "revision ";
        System.out.println("voice is gift of god but "+r +" "+ d+ "  makes its good");
    }
}
class musicians extends voice{
    public void team()
    {
        String a = "expert";
        System.out.println("background musician is also want"+a);
    }

    public static void main(String[] args) {
        musicians m = new musicians();
        m.music();
        m.words();
        m.throat();
        m.team();
    }
}
