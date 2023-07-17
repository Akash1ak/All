package inheritance;

public class Farmer {
    void soil() {
        System.out.println("soil is imp for farming");
    }
}

class hardwork extends Farmer {
    void work() {
        System.out.println("world hardest work is farming");
    }
}

class Farmimg extends hardwork {
    void newmethod() {
        System.out.println("in farming also latest tech available means way");
    }

    public static void main(String[] args) {
        Farmimg farm = new Farmimg();
        farm.soil();
        farm.work();
        farm.newmethod();
    }
}
