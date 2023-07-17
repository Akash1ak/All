public class mobile
{
    public void call()
    {
        String call = "calling feacher";
        int dig = 10;
        System.out.println(call+" is most used in mobile "+dig +" digites used in number");
    }
}
class smartwatch extends mobile
{
    public String heartbeat()
    {
        String m ="heartbeats";
        String step = "Step counting";
        int time = 60;
        return "smartwatch measure "+m +" and "+step +" in only "+time +" sec";
    }
}
class earphone extends mobile
{
    String type ="two types od earphone one is wired and secound is wireless";
    int cost = 300;
    int price = 3000;

    String d =type+" wired cost is "+ cost +" wireless is "+price;
    public String boat()
    {
       String d =type+" wired cost is "+ cost +" wireless is "+price;
       System.out.println(" "+d);
        return "d" ;
    }

    public static void main(String[] args)
    {
        smartwatch sm =new smartwatch();
        sm.heartbeat();
        earphone er =new earphone();
        er.boat();
        er.call();

    }
}

