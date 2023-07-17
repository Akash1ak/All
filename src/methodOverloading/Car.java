package methodOverloading;

public class Car
{
    String bmw(int a)
    {
        System.out.println("one bmw para");
        return "330d";
    }
    int bmw(String s,int e)
    {
        return 1200000;
    }
    long bmw(int u,String i,long d)
    {
        return 4445566;
    }
    double bmw()
    {
        return 12.7;
    }
    int mercedies(int a)
    {
     return 4;
    }
    String mercedies(String a,int d)
    {
        return "2.2 cr";
    }
    long mercedies(String y,long k)
    {
        return 787767;
    }

    public static void main(String[] args) {
        Car c =new Car();
        c.bmw(258);
        c.bmw();
        c.bmw(12,"akee",563);
        c.bmw("ok",67);
        c.mercedies(12390);
        c.mercedies("suv",2309999);
        c.mercedies("s-class",8);
        c.mercedies("g-class",5577554);

    }
}

