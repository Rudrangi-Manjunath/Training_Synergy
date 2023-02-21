package Collections;

import java.util.ArrayList;
import java.util.List;

public class vector {
    public static void main(String[] args) {
        List<Animal> car =new ArrayList<Animal>();
        List<Animal> her =new ArrayList<Animal>();

        List<Animal> zoo =new ArrayList<Animal>();


        Animal a1 = new Animal("Lion",'c');
        zoo.add(a1);
        Animal a2 = new Animal("cat",'h');
        zoo.add(a2);
        Animal a3 = new Animal("dog",'c');
        zoo.add(a3);
        Animal a4 = new Animal("horse",'c');
        zoo.add(a4);

        for(Animal e:zoo){
            boolean b=filter(e);
            if(b)
                car.add(e);
            else
                her.add(e);
        }
        System.out.println("Carnivores:");
        for (Animal s:car){
            System.out.println(s.getName()+" "+s.getType());
        }

        System.out.println("Herbivores:");
        for (Animal s:her){
            System.out.println(s.getName()+" "+s.getType());
        }


    }

    static boolean filter(Animal a){
        if(a.getType() == 'c')
            return true;
        else
            return false;
    }
}


