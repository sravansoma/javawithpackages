package InnerClasses;

public class LambdaInner {
    public static void main(String[] args) {
        // lambda expression
        lambda1 obj = () -> System.out.println("Hello");;

        obj.show();
    }
}


interface lambda1 {
    public void show();
}
