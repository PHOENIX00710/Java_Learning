package ThreadImpl;

class Processor1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=100;i+=2){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Processor2 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=100;i+=2){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableImpl {
    public static void main(String[] args) {

        Processor1 p1= new Processor1();
        Processor2 p2= new Processor2();

        Thread t1= new Thread(p1);
        Thread t2= new Thread(p2);

        t1.start();
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        t2.start();
    }
}
