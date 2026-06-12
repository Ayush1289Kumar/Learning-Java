

/*
Thread class constructors...
-> Thread(String name) : to give name to the thread. & 
    we can get that name from the getName method.

-> Thread (Runnable r, String name) : to give a runnable also.

*/

class myThread1 extends Thread{
    public myThread1(String name){
        super(name);
    }

    public myThread1(Runnable r,String name){
        super(r,name);

    }

    @Override
    public void run(){
        int i = 1;
        while (i<=100){
            System.out.println(i+" Eren!!!");
            i++;
        }
    }
}

class myRunnable implements Runnable{
    public void run(){
        System.out.println("dummy...");
    }
}
public class Lecture73 {
    public static void main(String[] args) {
        myThread1 mt1= new myThread1("Mikasa");

        myRunnable r = new myRunnable();

        myThread1 mt2= new myThread1(r,"Eren");

        mt1.start();
        mt2.start();

        // System.out.println("Id Thread1 : "+mt1.threadId());
        // System.out.println("Name Thread1: "+mt1.getName());
        // System.out.println("Id Thread2 : "+mt2.threadId());
        // System.out.println("Name Thread2: "+mt2.getName());

        



    }
}
