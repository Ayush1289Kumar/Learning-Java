
/*
Creating a thread using thread class.

step1: Extending thread class.
step2: overriding a run method.
step3: Run the thread using start method.
*/

class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
        System.out.println((i+1)+" Eren!!!");
        i++;
    }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println((i+1)+" Tatakae!");
            i++;
        }
    }
}
public class Lecture70 {
    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();
        myThread2 mt2 = new myThread2();
        mt1.start();
        mt2.start();
    }
}
