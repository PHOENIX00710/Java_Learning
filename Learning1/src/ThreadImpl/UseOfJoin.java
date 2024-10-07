package ThreadImpl;

class Critical{
    static int count=0;
}

public class UseOfJoin {
    public static void main(String[] args) throws InterruptedException{
        Runnable r1= () -> {
            Critical.count++;
        };
        Runnable r2= () -> {
            Critical.count++;
        };
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Count after threads,"+Critical.count);
    }
}
