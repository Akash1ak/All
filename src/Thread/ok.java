package Thread;

public class ok
{
    public static void main(String[] args) {
        final String resource1 = "java";
        final String resource2 = "class";
        Thread t1 = new Thread()
        {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : lock resource 1 ");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("thread 1 : lock resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized (resource2){
                    System.out.println("Thread 2: lock resource 2");

                    try{
                        Thread.sleep(100);
                    }catch (Exception e){}
                }
                synchronized (resource1){
                    System.out.println("thread 2 : lock resource 1");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
