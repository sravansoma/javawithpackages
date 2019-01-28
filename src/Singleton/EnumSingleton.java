package Singleton;

public class EnumSingleton {
    public static void main(String[] args) {
        enumSingnle obj = enumSingnle.INSTANCE;
        obj.i = 10;
        obj.show();

        enumSingnle obj1 = enumSingnle.INSTANCE;
        obj1.i = 12;
        obj.show();
    }
}

enum enumSingnle {
    // this will create a private constructor internally
    INSTANCE;

   int i;
   public void show() {
       System.out.println(i);
   }
}
