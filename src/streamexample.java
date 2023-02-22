import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class streamexample {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,3,4,5,6);
        //long c= l.stream().count();
        // System.out.println(c);
        //l.stream().forEach(n -> System.out.println(n));
        Stream<Integer> integerStream = l.stream().map(n -> 2 * n);
        //integerStream.forEach(n -> System.out.println(n));
       // integerStream.forEach(n -> System.out.println(n)); // it will give error only one stream can be
                                                 // used only once
        l.stream().filter(n-> n%2==1).map(n->n*2).forEach(n-> System.out.println(n));
        int val = integerStream.reduce(0,(c, e) -> c+e);
        System.out.println(val);
    }
}
