package privateConstructor;

public class Singleton {

    static Singleton instance = null;

    public int x=10;

    private Singleton(){
        // Never instantiated
    }

    static public Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
       // Singleton singleton = new Singleton(); // In this we can't create objects
        Singleton singleton1  = Singleton.getInstance();
        Singleton singleton2  = Singleton.getInstance();

        singleton1.x += 10;

        System.out.println("Singleton1 value: "+singleton1.x);
        System.out.println("Singleton2 value: "+singleton2.x);

        // both singleton1 and singleton2 are pointing to same address i.e, two objects are not created
    }
}
