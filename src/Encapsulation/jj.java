package Encapsulation;

public class jj
{
    private String name;
    private int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public static void main(String[] args) {
        jj jj = new jj();
        jj.setName("Akee");
        jj.setRoll(10);

        System.out.println("my name is "+jj.getName());
        System.out.println("roll no "+jj.getRoll());
    }
}

