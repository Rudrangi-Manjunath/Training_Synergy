package firstpackage;

public class B {
   void print(){
      A a = new A();
      a.valid=100;
      System.out.println("amount: "+a.valid);
  }
  private int amount;
  void message(){
      System.out.println("Hi");
  }

    public static void main(String[] args) {
        B b1 =new B();
        b1.print();
    }
}
