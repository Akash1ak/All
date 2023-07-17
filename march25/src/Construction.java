public class Construction
{
//    String material;
//    int cost ;
//    String name;
//    boolean ok;
    public void site(String name,String cost,boolean ok)
    {
        System.out.println("Building name is "+name +"cost is "+cost + "price of matrtial is increases "+ok);
    }
    public void plot(int area, String add,int price ,boolean no)
    {
        System.out.println("plot size is "+area +" cost is "+price + " near to hospitalarea" +no);
    }

    public static void main(String[] args)
    {
        Construction construction = new Construction();
        construction.site("matoshree","89 cr",true);
        construction.plot(1200,"near busStand",1200000,false);
        System.out.println("===================================================================");
        Construction con =new Construction();
        con.site("manat","560 cr",true);
        con.plot(890000,"near sealink ",90000000,false);
        System.out.println("===================================================================");
        Construction c =new Construction();
        c.plot(3400000,"near airport",780000,false);

    }
}
