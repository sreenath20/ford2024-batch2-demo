package thread;

public class Driver {
    public static void main(String[] args) {

        System.out.println("who is runnig :"+
                Thread.currentThread().getName());
        Task1 task1 = new Task1();
        // new thread
        Thread thread = new Thread(task1,"T1");
        //
        thread.start(); // running state
        try {
            thread.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(task1,"T2");
        thread2.start();
    }
}
