
/*
1. Write a program to print "good morning" and "welcome"
continously on the screen in java using Threads.

2. Add  a sleep method in welcome thread to delay its execution
for 200ms.

3. Demonstrate getPriority() and setPriority() methods in java.

4. How to get state of a thread.
    -> using getState() method
5. How to get reference of a thread.
    -> using Thread.currentThread() method.
*/
class Thr1 extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++) { 
            System.out.println("good morning");
        }
    }
}

class Thr2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++) { 
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class PS_13 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();

        Thr2 t2 = new Thr2();

        System.out.println("T1 priority: "+t1.getPriority()); // Get priority of a thread.
        System.out.println("T2 priority: "+t2.getPriority());
        t2.setPriority(10); // Set priority of a thread.
        t1.setPriority(1);
        t1.start();
        t2.start();
        System.out.println(t1.getState()); // State of a thread.
        
        System.out.println("Thread reference:"+Thread.currentThread()); // Reference of a thread.
        System.out.println("T1 priority: "+t1.getPriority());
        System.out.println("T2 priority: "+t2.getPriority());

        System.out.println(t2.getState());
    }
}
