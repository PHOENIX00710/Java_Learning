package ThreadImpl;

class CPU1 extends Thread{
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

class CPU2 extends Thread{
    @Override
    public void run(){
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

public class Threads {
    public static void main(String[] args) {
        CPU1 t1= new CPU1();
        CPU2 t2= new CPU2();
        t1.start();
        t2.start();
    }
}
