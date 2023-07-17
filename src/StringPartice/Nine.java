package StringPartice;

public class Nine
{
    public static void main(String[] args) {
        String sw = new String("English");
        String sd = "English";
        String Sp = new String("English");
        System.out.println(Sp == sw); //false
        System.out.println(Sp.equals("English"));//true
        System.out.println(sd.equals(sw));//true
        System.out.println();
    }
}
