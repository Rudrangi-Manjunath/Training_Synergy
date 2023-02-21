package firstpackage;

public class C extends B{
    void mess(){
        B b1= new B();
        // b1.amount; // private cannot be accessed in child class also
    }

}
