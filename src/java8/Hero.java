package java8;

public class Hero implements Actor{
    @Override
    public void act() {
        System.out.println("I can act");
    }

    @Override
    public void speak() {
        System.out.println("I can speak");
    }

}
