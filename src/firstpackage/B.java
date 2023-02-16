package firstpackage;

public class B {
  static void print(){
      A a = new A();
      a.valid=100;
      System.out.println("amount: "+a.valid);
  }
  int amount;
  void message(){
      System.out.println("Hi");
  }

    public static void main(String[] args) {
        print();
    }
}
