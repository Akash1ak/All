package inheritance;

import java.sql.SQLOutput;

public class intro {
    void show() {
        System.out.println("this is parent class ");
    }
}

class Chield extends intro {
    void test() {
        System.out.println("this is a chield class");
    }
}

class okaxis extends Chield {
    public static void main(String[] args) {
        okaxis okaxis = new okaxis();
        okaxis.show();
        okaxis.test();
    }
}
