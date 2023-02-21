public strictfp class strictfpdemo {
    strictfp void method1(){
        System.out.println(200/3);  // Its value is different in different machines
        // In order to make all values same, we use strictfp
    }
}

strictfp interface test1{

}

// strictfp uses IEEE 754 format