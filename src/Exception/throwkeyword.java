package Exception;

class Test extends Throwable {

}
public class throwkeyword{
    public static void main(String[] args) throws Test {
        /*ArithmeticException ex = new ArithmeticException("You tried to divide by zero");
        throw ex;    // 1st way*/
        // throw new ArithmeticException("You tried to divide by zero");  // 2nd way
        Test t1= new Test();
        throw t1;
    }
}
