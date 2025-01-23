class MyThread  extends Thread{
    public void run(){
        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
}

public class Threadwork {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("My thread 1 is Running");
        t2.setName("My thread 2 is running");

        t1.start();
        t2.start();
    }
}
