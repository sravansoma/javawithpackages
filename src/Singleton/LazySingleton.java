package Singleton;


public class LazySingleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingle obj = LazySingle.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingle obj = LazySingle.getInstance();
            }
        });

//        LazySingle obj = LazySingle.getInstance();
//        LazySingle obj1 = LazySingle.getInstance();
        t1.start();
        t2.start();
    }
}

class LazySingle {
    public static LazySingle obj;
    private LazySingle() {
        System.out.println("Instance created");
    }

    public static LazySingle getInstance() {
        // this is to make sure to create only one instance
        if (obj == null) {
            // creating the object only when null is called lazy type
            // synchronized check is for Double checked locking
            synchronized (LazySingle.class) {
                if (obj == null) {
                    obj = new LazySingle();
                }
            }
        }

        return obj;
    }
}
