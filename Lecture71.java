
/*
Creating a thread using Runnable interface.

step1: implement Runnable interface.
step2: override the run method.
step3: creating a new thread and providing the runnable object as argument.
step4: Run the thread using start method.
*/

class myRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println((i+1)+" Tatakae!");
            i++;
        }
    }
}

class myRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println((i+1)+" Eren!!!");
            i++;
        }
    }
}
public class Lecture71 {
    public static void main(String[] args) {
        myRunnable1 m1 = new myRunnable1();
        Thread t1 = new Thread(m1);
        myRunnable2 m2 = new myRunnable2();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
        
    }
}
