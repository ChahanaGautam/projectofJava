public class MyThread extends Thread{
        public void run() {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        }


    public static class ThreadExample1 {
        public static void main(String[] args) {
            MyThread thread1 = new MyThread();
            thread1.start();
        }
    }
}
