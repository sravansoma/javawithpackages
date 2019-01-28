package InnerClasses;

public class MemberClassTest {
    public static void main(String[] args){
        A obj = new A();
        A.B obj1 = obj.new B();

        obj1.show();
    }
}

class A {
    int rollno;
    String name;

    class B {
        public void show() {
            System.out.println("I am in class B");
        }
    }
}
