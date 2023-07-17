package Constructor;

public class Bike
{
    Bike()
    {
        System.out.println("this is default constructor");
    }
    Bike(int a)
    {
        this();
        System.out.println("this onr parameterised constructor");
    }
    Bike(int b ,String c)
    {
        this (12);
        System.out.println("this is a 2 parameterised constructor");
    }
    Bike(String d,double e,int f)
    {
        this(23,"akee");
        System.out.println("this is a 3 parameterised constructor");
    }
}
class honda extends Bike {
    honda() {
        super("akee", 56.09, 78);
        System.out.println("this is 2 class default constructor");
    }

    honda(int g) {
        this();
        System.out.println("this ia 2 classs one parameter constructor");
    }
    honda(int h,String j)
    {
        this (89);
        System.out.println("this is a 2 class 2 parameterised constructor");
    }
    honda(String l,boolean m,double n)
    {
        this(87,"shubham");
        System.out.println("this is a 2 class 3 parameterised construction");
    }
}
class tvs extends honda
{
    tvs()
    {
        super("jupiter",true,65.8);
        System.out.println("this is a default constructor of class 3");
    }
    tvs(int z)
    {
        this ();
        System.out.println("this is a one parameterised constructor of 3 class");
    }
    tvs(String x,long v)
    {
        this (746);
        System.out.println("this a 2 parameterised constructor of class third");
    }
    tvs(int q,boolean w,short o)
    {
        this ("rocky",375878);
        System.out.println("this is a 3 parameterised construction of class third");
    }
}
class bmw extends tvs
{
    bmw()
    {
        super(23,true,(short)8);
        System.out.println("this is default constructor of bmw");
    }

    public static void main(String[] args) {
        bmw bmw =new bmw();
    }
}
