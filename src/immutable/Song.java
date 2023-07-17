package immutable;

final class Song
{
    private final String d = "Ramta jogi";//="RAmta jogi";

    public String getD() {
        return d;
    }

    Song(String s)
    {
        System.out.println("this is constructor");
    }

    public static void main(String[] args)
    {
        Song ok = new Song("of a song");
        System.out.println(ok.getD());

    }
}
