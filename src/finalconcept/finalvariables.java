package finalconcept;

public class finalvariables {
    final int a; // Instance final variable

    /*{
        a=20;                             // Instance block
        System.out.println("hello");
    }*/
    /* public finalvariables() {
        a = 54;                // final intialising inside constructor
    }*/

    public static void main(String[] args) {
        final int x=20;
        System.out.println("x value: "+x);
         // x=30; // reinitializing is not allowed by final
        finalvariables f1 = new finalvariables();
        finalvariables f2 = new finalvariables();
        finalvariables f3 = new finalvariables();
        finalvariables f4 = new finalvariables();

        //f1.a=45; // Instance final variable cannot be reassigned
        System.out.println("a value: "+f1.a);

    }
}
