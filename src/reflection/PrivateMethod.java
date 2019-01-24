package reflection;

import java.lang.reflect.Method;

public class PrivateMethod {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("reflection.Test");
        Test t = (Test)c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);
    }
}
