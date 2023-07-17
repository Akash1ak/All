package inheritance;

class carrrr{
    static int a;
    public void m1(int a,String b)

    {
        System.out.println("ok ");
    }
    public void m2()
    {
        String colour = "golden";
        System.out.println(" "+colour +" colour is very beautiful");
    }
}
class bmw extends carrrr {
    public static void main(String[] args) {

        bmw bm = new bmw();
//        bm.m1(10,"pink");
//        bm.m2();
        System.out.println(" value of "+a);
    }
}