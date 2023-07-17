package StringPartice;

public class two
{
    public static void main(String[] args) {
        String su = new String("ok");
        String si = new String("ok done");
        String so = "ok done";
        String sl = "ok done";
        String g = "ok";
        System.out.println(si.equals(su));//false
        System.out.println(so == sl); //true
        System.out.println(so.equals(sl));//true
        System.out.println(g == su);//false
        System.out.println(g.equals(su));//true
    }
}
