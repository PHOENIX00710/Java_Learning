class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

class C extends B{
    public void show(){
        System.out.println("In C");
    }
    public void test3(){
        System.out.println("Testing in C");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Dynamic Method Dispatch and DownCasting
        A obj= new A();
        obj=new C();
        obj.show();
        A obj2= new C();
        ((C)obj2).test3();

        // Autoboxing and Unboxing
        int a=5;
        //Integer b= new Integer(a); //Boxing
        Integer b=a;
        Integer c=34;
        c+=32;
        int x=c.intValue(); //Unboxing
//        int x=c;
        System.out.println(b+" "+x);
    }
}
