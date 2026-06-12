

/*
Thread priorities

-> THREAD.MIN_PRIORITY = 1
-> THREAD.NORM_PRIORITY = 5
-> THREAD.MAX_PRIORITY = 10

we can set priority using setPriority() method.

*/

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (i<100) {
        System.out.println("Name: "+getName());
        i++;
    }
}
}
public class Lecture74 {
    public static void main(String[] args) {
        myThread t1 = new myThread("Eren");
        myThread t2 = new myThread("Mikasa");
        myThread t3 = new myThread("Armin");
        myThread t4 = new myThread("Levi");
        myThread t5 = new myThread("Reiner");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
