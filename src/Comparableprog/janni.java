package Comparableprog;

import java.util.*;
class jaani
{
    private String name;
    private int id;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name =name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id =id;
    }

    public jaani(String name,int id)
    {
        this.name =name;
        this.id= id;
    }

    public String toString()
    {
        return "jaani {" +
                "name = " + name +
                "id = " + id +
                '}';
    }

    public static void main(String [] args)
    {
        jaani ok = new jaani ("param",55);
        jaani ok1 = new jaani ("onkar",88);
        jaani ok2 = new jaani ("nikhil",07);

        List<jaani> oo = new ArrayList<>();
        oo.add(ok);
        oo.add(ok1);
        oo.add(ok2);

        namee comparator = new namee();
        Collections.sort(oo,comparator);
        System.out.println("name sort="+oo);

        Iid comparator1 = new Iid();
        Collections.sort(oo,comparator1);
        System.out.println("id sort = "+oo);
    }
}

class namee implements Comparator<jaani>
{
    public int compare(jaani o1, jaani o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}

class Iid implements Comparator<jaani>
{
    public int compare(jaani o1,jaani o2)
    {
        return o1.getId() -o2.getId();
    }
}
