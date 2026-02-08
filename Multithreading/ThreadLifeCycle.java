
public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread();

    }
    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println("Implements runnable");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

