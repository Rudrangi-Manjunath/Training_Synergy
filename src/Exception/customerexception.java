package Exception;

import java.util.Scanner;

public class customerexception {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18)
            throw new RuntimeException("You are too young");
        else if(age>60)
            throw new RuntimeException("You are too old");
        else
            System.out.println("Your details will be processed");
    }
}

class TooYoung extends RuntimeException{
    TooYoung(String message){
        super(message);
    }
}

class TooOld extends RuntimeException{
    TooOld(String message){
        super(message);
    }
}
