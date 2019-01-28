package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Test {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4);

        values.forEach(i -> System.out.println(i));

        // pass by method
        System.out.println("Stream start here");
        values.forEach(System.out::println);
        System.out.println("Double It method starts here");
        values.forEach(Java8Test::doubleInt);


    }

    public static void doubleInt(int i) {
        System.out.println(i*2);
    }
}

