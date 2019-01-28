package InnerClasses;

public class NestedInner {
    public static void main(String[] args) {
        inner1.inner2 obj = new inner1.inner2();

        obj.show();
    }
}


class inner1 {
    int i;
    String name;

    static class inner2 {
        public void show() {
            System.out.println("I am in B");
        }
    }
}