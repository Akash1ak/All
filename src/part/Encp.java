package part;

public class Encp
{
    private String a;
    private int b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Encp ok =new Encp();
        ok.setA("Akash");
        ok.setB(87);

        System.out.println(ok.getA());
        System.out.println(ok.getB());
    }
}
