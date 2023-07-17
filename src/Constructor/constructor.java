package Constructor;


class pconstructor {
    pconstructor() {
        System.out.println("this is default Constructor");
    }

    pconstructor(int a) {
        this();
        System.out.println("this is one parameterised");
    }

    pconstructor(String s, int r) {
        this(23);
        System.out.println("this is 2 parameterised method");
    }

    pconstructor(String j, boolean n, long h) {
        this("uhj", 67);
        System.out.println("this is 3 parameterised method ");
    }
}

class popconstructor extends pconstructor {
    popconstructor()
    {
        super("fgfh",true,878l);
        System.out.println("this is a 2 nd class default constructor");
    }

    popconstructor(int q) {
        this();
        System.out.println("this ia 2 nd class one parameter");
    }

    popconstructor(int w, String e) {
        this(12);
        System.out.println("this 2 nd class two parameter");
    }

    popconstructor(int r, boolean t, short y) {
        this(76, "ok");
        System.out.println("this is 2nd class three parameter");
    }
}

class poorconstructor extends popconstructor {
    poorconstructor()
    {
        super(56,true,(short)7);
        System.out.println("this 3 rd class default constructor");
    }

    poorconstructor(int q) {
        this();
        System.out.println("this ia 2 nd class one parameter");
    }

    poorconstructor(int w, String e) {
        this(12);
        System.out.println("this 2 nd class two parameter");
    }

    poorconstructor(int m, boolean n, short v) {
        this(76, "ok done");
        System.out.println("this is 2nd class three parameter");
    }
}

class constructor extends poorconstructor
{   constructor() {
        super(30,true,(short)8);
        System.out.println("this is  first constructor");
    }

    void constructor() {
        System.out.println("this is method");
    }

    public static void main(String[] args) {
        constructor ce = new constructor();
        ce.constructor();

    }
}

