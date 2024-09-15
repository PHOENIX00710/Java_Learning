abstract class Vehicle{
    public abstract void model();
    public abstract void wheels();
}

// As all abstract methods were not implemented even Car has to be an abstract class
abstract class Car extends Vehicle{
    public void wheels(){
        System.out.println("The vehicle has 4 wheels");
    }
}

// As Ford inherits Car and Car has already implemented wheels we have an compulsion to only define model
// as it in the only abstract method in its parent that is Vehicle.
class Ford extends Car{
    public void model(){
        System.out.println("Model is S8");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {

    }
}
