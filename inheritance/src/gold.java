public class gold {
    public void price() {
        String pri = "very high";
        int p =60500;
        System.out.println("gold price is "+ pri+" "+p);
    }
    String gems(String d)
    {
        //String d ="kohinoor";
        return "priceless";
    }
}
class dimand extends gold
{
    public static void main(String[] args) {
        dimand dd =new dimand();
       String result = dd.gems("kohinoor");
       System.out.println("this is "+result);
        dd.price();


    }

}
