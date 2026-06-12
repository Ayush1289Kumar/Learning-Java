/*
Thread methods...
->  join() => this method is used when we want to execute the next thread
    after the previous thread is completed first.
    this method must be wrapped in a try-catch block.

-> Thread.sleep() => this method takes time in milisecon
    and  is used to make a thread sleep for some while.
*/

class MyThread1 extends Thread{
    public void run(){
        int i =1;
        while (i<=100){
            System.out.println("Eren!!!");
            i++;
        }
    }
}

class MyThread2 extends Thread{

    public void run(){
        int i = 1;
        while (i<=100){
            System.out.println("Tatakae!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}


public class Lecture75{
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();

        MyThread2 mt2 = new MyThread2();

        mt1.start();
        
        try {
            mt1.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        mt2.start();
    }
}