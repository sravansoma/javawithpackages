package Annotation;


import java.util.ArrayList;

public class AnnotationTest {
    public static void main(String[] args) {
        B obj = new B();

        obj.showSravan();
        obj.show();
    }
}

class A {
    public void showSravan() {
        System.out.println("I am in A");
    }
}

class B extends A {
    @Override
    @SuppressWarnings("unchecked")
    public void showSravan() {
        ArrayList test = new ArrayList();
        System.out.println("I am in B");
    }

    @Deprecated
    public void show() {

    }
}

@FunctionalInterface
interface C {
    public void show();
}