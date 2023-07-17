package ExceptionHandling;

public class MAth {
    void math1()
    {
        int a =5;
        int b=10;
        int c=15;
        boolean result =++a > b-- || ++c > a++;
        System.out.println(a+" "+b+" "+c+" "+result);
    }

    public static void main(String[] args) {
        new MAth().math1();
    }
}

