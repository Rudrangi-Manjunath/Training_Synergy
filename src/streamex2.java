import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

interface car{
    void  drive();
    void start();
    default void stop(){
        System.out.println("car is stopped");
    }
}
public class streamex2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);

        // External Iterations
        /*  for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        for(Integer i:l){
            System.out.println(i);
        }
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/

        // Internal Iterations

       // l.stream().forEach( (Integer i) -> System.out.println(i));
       // l.stream().forEach(i -> System.out.println(i));

    }
}
