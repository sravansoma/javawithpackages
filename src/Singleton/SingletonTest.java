package Singleton;


public class SingletonTest {
    public static void main(String[] args) {
        Single1 a = Single1.getInstance();
    }
}

// three steps to create a singleton class in java
class Single1 {
    // first create a static object of same class
    static Single1 obj = new Single1();

    // second create a private constructor
    private Single1() {

    }

    // create a public method which will return the static object
    public static Single1 getInstance() {
        return obj;
    }
}
