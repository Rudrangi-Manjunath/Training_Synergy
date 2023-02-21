package Exception;

public class exception1 {
    public static void main(String[] args) {

        try{
            String s=null;
            System.out.println(s.length());
            //System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e);   // 1st method
            //  e.printStackTrace();       2nd method
            //  System.out.println(e.toString()); 3rd method
            //   System.out.println(e.getMessage());   4th method
        }/*catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        finally {
            System.out.println("Hello");
        }
        System.out.println("Hi");

    }
}
