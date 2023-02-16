package Secondpackage;

//import firstpackage.FirstClass;  // importing FirstClass
// import firstpackage.ThirdClass;

import firstpackage.*; // it only imports classes under first class not from its subpackage
import firstpackage.firstsubpackage.firstsubclass;

public class secondclass {

    // firstpackage.FirstClass  f = new FirstClass();  // fully qualified class name
    FirstClass f1 = new FirstClass();
    ThirdClass t1 = new ThirdClass();
    firstsubclass fs = new firstsubclass();

}
