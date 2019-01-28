package InnerClasses;

public class AnonymousInner {
    public static void main(String[] args) {
        anony1 obj = new anony1() {
            @Override
            public void show() {
                System.out.println("I am in anony");
            }
        };

        obj.show();
    }
}



class anony1 {
    public void show() {
        System.out.println("I am in anony");
    };
}