package multithreading;

public class MultiThread {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();

        // this is using a runnable interface
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("I am in B");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e);
//                    }
//
//                }
//            }
//        };
        // below is lambda expression
        new Thread(() -> new MultiThread().show("I am in B")).start();
        new Thread(() -> new MultiThread().show("I am in C")).start();

    }

    public void show(String s) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

class A extends Thread {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am in A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    @Override
    public void run() {
        show();
    }
}


class B implements Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am in B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

