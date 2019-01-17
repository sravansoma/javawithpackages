package Interfaces;

interface test1 {
    void show();
}

public class InterfaceOne {
    public static void main(String[] args) {
        test1 obj = new test1(){
            public void show() {
                System.out.println("I am in show");
            }
        };
        obj.show();
    }
}
