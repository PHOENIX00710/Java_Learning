class Parent{
    int a=99;
    public void run(){
        System.out.println("Running in parent");
    }
    class Inner3{
        public void stop(){
            System.out.println("Stopping in inner");
        }
    }
    static class Inner2{
        public void start(){
            System.out.println("Starting in Inner 2");
        }
    }
}

abstract class A2{
    public abstract void run();
}


public class Inner_Anonymous_Classes {
    public static void main(String[] args) {

        // To access inner methods we need to make an object of Inner class
        Parent obj = new Parent(); // Add semicolon
        Parent.Inner3 obj2 = obj.new Inner3(); // Cannot be Parent.Inner as we need object to access
        Parent.Inner2 obj3= new Parent.Inner2(); // Here we don't need an object as the inner class is static.
        obj3.start();
        obj2.stop();

        //Anonymous abstract class
        //A2 obj4= new A2(); // Will show error normally

        // Will work if we use anonymous classes
        A2 obj4= new A2() {
            public void run() {
                System.out.println("Running");
            }
        };
        obj4.run();
    }
}
