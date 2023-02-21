public class staticmethod {
    public static void display(){
        System.out.println("Hello Java in static method");
        make();
    }
    public static void make(){
        System.out.println("Hello world!");
    }

}

class hello {
    public static void main(String[] args) {
        staticmethod.display();
        child.display();
    }

}

class child extends  staticmethod{

    public static void display(){
        System.out.println("Java");
    }
}
