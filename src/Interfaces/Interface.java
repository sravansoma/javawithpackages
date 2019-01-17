package Interfaces;

interface test3 {
    void show();
}

class MyImplement implements test3 {
    public void show() {
        System.out.println("I am in show");
    }
}

public class Interface {
    public static void main(String[] args) {
        test3 obj = new MyImplement();
        obj.show();
    }
}