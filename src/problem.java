import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.*;

class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

public class problem {
    public static void main(String[] args) {
        /*String text = "Java is a popular programming language";
        text+=" ";
        Integer i=0,n=text.length();
        List<String> a = new ArrayList<>();
        while(i<n){
            int j=i;
            String temp="";
            while((j < n) && (text.charAt(j) != ' ')){
                temp+=text.charAt(j);
                j++;
            }
            a.add(temp);
            i=j+1;
        }
        System.out.println(a);*/

        String text1 = "big black bug bit a big black dog on his big black nose";
        text1+=" ";
        Integer i=0,n=text1.length();
        HashMap<String,Integer> mp = new HashMap<>();
        while(i<n){
            int j=i;
            String temp="";
            while((j < n) && (text1.charAt(j) != ' ')){
                temp+=text1.charAt(j);
                j++;
            }
            if(mp.containsKey(temp)){
                int value=mp.get(temp);
                value+=1;
                mp.replace(temp,value);
            }
            else{
                mp.put(temp,1);
            }
            i=j+1;
        };
        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }


        // ArrayList<String> al = new ArrayList<>();
       // System.out.println("Using stream:");
        //String s1="Java is a popular programming language";

        // al.add(s1);
       // al.add(s2);

        /* List<Integer> l = Arrays.asList(2,3,4,5,6);
        l.stream().filter(n -> n % 2 == 0).forEach(System.out::println);*/

        String s="Java is a popular programming language";
        List<String>l1 = Arrays.asList(s.split(" "));

        System.out.println(l1);

        /*Map<String,Integer> m1 = l1.stream().collect(Collectors.toMap(a -> a ,String::length));
        System.out.println(m1);*/

        String s1= "bin ban bin box ban ban bte bim";
        List<String> l = Arrays.asList(s1.split(" "));

        // System.out.println(l);

        /*Map<String,Integer> mp = l.stream().collect(Collectors.toMap(a->a,t->1,Integer::sum));
        System.out.println(mp);*/


        //System.out.println(l1);
        // The Function.identity() method is often used as function,
        // which simply returns the element itself as the value.


        /* List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        Map<String, String> m = bookList.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
        System.out.println(m);

        Map<Integer,Book> mb = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear, Function.identity(),
                (existing, replacement) -> existing));
        System.out.println(mb);*/

    }
}
