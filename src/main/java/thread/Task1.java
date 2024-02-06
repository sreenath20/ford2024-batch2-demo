package thread;

public class Task1 implements Runnable{

    @Override
    public void run() {
        display();
    }// Dead state

    //synchronized
    void display(){
        System.out.println("Am here:"+Thread.currentThread().getName());
   // synchronized (this){ // critical data
//        try {
//          //  Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for(int i=0;i<25;i++)
            System.out.println("Hello :"+i+":"+
                    Thread.currentThread().getName());
    }
    }

//}
