package chapter6.ch20;

/*class MyThread extends Thread{

    public void run(){
        int i;
        for(i = 1; i <= 200; i++){
            System.out.print(i + "\t");
        }
    }

}*/

class MyThread implements Runnable{

    @Override
    public void run() {
        int i;
        for(i = 1; i <= 200; i++){
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");

        //Thread를 사용 하는 경우
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();

        //runnable을 사용 하는 경우
        MyThread runnable = new MyThread();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };

        run.run();
    }
}
