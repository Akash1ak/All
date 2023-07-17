package Array;

public class custArray
{
    private int rollno;
    private String name;


    public custArray(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void sub(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }


    @Override
    public String toString() {
        return "custArray{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        custArray obj = new custArray(12,"gfh");
    }
}
