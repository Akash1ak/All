public class signal
{
    public void time()
    {
        String s =" 5 min";
        String c =" waiting period";
        System.out.println("every signal takes "+s +" "+c);
    }
    public boolean mc() {
        return true;
    }
}
class red extends signal
{
    public static void main(String[] args)
    {
        String d="red means Stop";
        red t =new red();
        System.out.println( " "+d);
        signal n =new signal();
        n.time();
        n.mc();
        System.out.println(n.mc());

    }
}