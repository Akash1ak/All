package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sad
{
    public static void main(String[] args) {
        Rada rada = new Rada("akash",45);
        Rada rada1 = new Rada("shubham",88);
        Rada rada2 = new Rada("omkar",77);
        Rada rada3 = new Rada("kanchan",22);
        Rada rada4 = new Rada("janni",31);

        List<Rada> ss = new ArrayList<>();

//        String ss1 = new String("java");
//        System.out.println(ss1.hashCode());
//        String ss2 = "java";
//        System.out.println(ss2.hashCode());

        ss.add(rada);
        ss.add(rada2);
        ss.add(rada3);
        ss.add(rada4);

        System.out.println("original list "+ss);

        nameo comparator = new nameo();
        Collections.sort(ss,comparator);
        System.out.println(""+ss);

        ido comparator1 = new ido();
        Collections.sort(ss,comparator1);
        System.out.println("Sorted with roll no "+ss);

    }
}

class nameo implements Comparator<Rada>
{

    @Override
    public int compare(Rada o1, Rada o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class ido implements Comparator<Rada>
{
    @Override
    public int compare(Rada o1, Rada o2) {
        return o1.getRollno()-o2.getRollno();
    }
}
class Rada
{
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Rada(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Rada{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

}
