package reflection;

class A {

}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.A");
        // this will tell you what is the super class
        System.out.println(c.getSuperclass());
    }
}


