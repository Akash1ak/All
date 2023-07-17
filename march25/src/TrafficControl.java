public class TrafficControl
{
    String light;
    int time;
    String avg;
    int police;
    public void watting(String light,int time )
    {
     System.out.println("plz wait sign for "+light +" waiting time is "+time +" sec");
    }
    void letsgo(String light ,int time)
    {
        System.out.println("lets go now because light is "+light +" watting time is end now ");
    }

    public static void main(String[] args) {
        TrafficControl traffic = new TrafficControl();
        traffic.watting("Red",30);
        traffic.letsgo("green",1);
        System.out.println("===================================================================");
        TrafficControl tc =new TrafficControl();
        tc.watting("red",90);
        tc.letsgo("green",0);
        System.out.println("===================================================================");
        TrafficControl tcontrol = new TrafficControl();
        tcontrol.watting("red",120);
        tcontrol.letsgo("green",0);


    }
}
