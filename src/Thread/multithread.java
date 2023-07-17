package Thread;


public class multithread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("print index:" + i + " thread name" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        multithread ref = new multithread();
        Thread obj = new Thread(ref);
        Thread obj1 = new Thread(ref);
        obj.setName("java");
        obj1.setName("vision");
        obj.start();
        obj1.start();
        System.out.println("it is second method:");
    }
}

