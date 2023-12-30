package opps;

public class MethodOverLoading {

    int a;
    int b;
    int c;

    void sum() {
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a + b);
    }

    void sum(int x, int y) {
        int a = x;
        int b = y;
        System.out.println(a + b);

    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        mo.sum();
        mo.sum(10, 20);
        mo.sum(10, 30.5);
        mo.sum(30, 20, 30);
    }
}