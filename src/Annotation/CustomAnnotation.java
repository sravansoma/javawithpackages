package Annotation;


import java.lang.annotation.*;

public class CustomAnnotation {
    public static void main(String[] args) {
        NokiaSeries obj = new NokiaSeries("Fire", 10);

        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.OS());
    }
}

//marker annotation if it does not have any values
// if it has one values it is single value annotation
// if it has multi values it is multiple value annotation
@Target(ElementType.TYPE) // Meta annotation
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Iphone";
    int version() default 1;
}

@SmartPhone(OS="Android",version=8)
class NokiaSeries{
    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
