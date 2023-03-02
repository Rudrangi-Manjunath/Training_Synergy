import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problem1 {
    public static void main(String[] args) {
        String s = "big black bug bit a big black dog on his big black nose";
        List<String> l1 = Arrays.asList(s.split(" "));
        HashMap<String,Integer> mp = new HashMap<>();
        for(String t:l1){
            if(mp.containsKey(t)){
                int value= mp.get(t);
                value+=1;
                mp.replace(t,value);
            }
            else{
                mp.put(t,1);
            }
        }
        System.out.println(mp);

        Map<String,Long> mp1 = l1.stream().collect(Collectors.groupingBy(k->k,Collectors.counting())); // input parameters(function,classifier)
        System.out.println(mp1);
    }
}
