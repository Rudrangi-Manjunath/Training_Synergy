interface A{
    void show();
}


public class lambda {
    public static void main(String[] args) {
       /* A obj = new A(){
            @Override
            public void show() {
                System.out.println("Hello World!");
            }
        };
        obj.show();
    }*/
        A obj = () -> System.out.println("hello world!");
        obj.show();
    }
}

