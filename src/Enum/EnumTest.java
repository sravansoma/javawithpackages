package Enum;

public class EnumTest {
    enum Mobile {
        APPLE(100),SAMSUNG(90),FLEXPAI(80);

        int price;

        // constructor in enums
        Mobile() {
            System.out.println("constructor");
            price = 80;
        }
        // constructor in enums
        Mobile(int p) {
            price = p;
        }
        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Mobile m = Mobile.FLEXPAI;

        switch (m)
        {
            case APPLE:
                System.out.println("This is apple");
                System.out.println(m.getPrice());
                break;
            case FLEXPAI:
                System.out.println("This is flexpai");
                System.out.println(m.getPrice());
                break;
        }

        Mobile m1[] = Mobile.values();

        for (Mobile i : m1) {
            System.out.println(i);
            System.out.println(i.getPrice());
        }
    }
}
