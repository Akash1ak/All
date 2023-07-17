package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gun
{
    private int id;
    private String name;
    private double recall;
    private int ammocount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRecall() {
        return recall;
    }

    public void setRecall(double recall) {
        this.recall = recall;
    }

    public int getAmmocount() {
        return ammocount;
    }

    public void setAmmocount(int ammocount) {
        this.ammocount = ammocount;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", recall=" + recall +
                ", ammocount=" + ammocount +
                '}';
    }

    public Gun(int id, String name, double recall, int ammocount) {
        this.id = id;
        this.name = name;
        this.recall = recall;
        this.ammocount = ammocount;
    }

    public static void main(String[] args) {
        Gun gun = new Gun(9,"Ak47",2.8,40);
        Gun gun1 = new Gun(5,"M416",2,30);
        Gun gun2 = new Gun(9,"Kar98",1,5);
        Gun gun3 = new Gun(10,"Ump9",8,35);

        List<Gun> good = new ArrayList<>();
        good.add(gun);
        good.add(gun1);
        good.add(gun2);
        good.add(gun3);


        Namee comparator = new Namee();
        Collections.sort(good,comparator);
        System.out.println(good);

        Ammow comparator1 = new Ammow();
        Collections.sort(good,comparator1);
        System.out.println(good);

    }
}

class Namee implements Comparator<Gun>
{
    @Override
    public int compare(Gun o1, Gun o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Ammow implements Comparator<Gun>
{

    @Override
    public int compare(Gun o1, Gun o2) {
        return o1.getAmmocount()-o2.getAmmocount();
    }
}
