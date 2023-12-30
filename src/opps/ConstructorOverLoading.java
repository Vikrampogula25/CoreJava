package opps;

public class ConstructorOverLoading {

    int a = 0;
    int b = 0;
    double c = 0;


    ConstructorOverLoading() {
        a = 100;
        b = 200;
        c = 300.5;
    }

    ConstructorOverLoading(int x, int y) {
        a = x;
        b = y;
    }

    ConstructorOverLoading(int x, double y) {
        a = x;
        c = y;
    }

    ConstructorOverLoading(int a, int b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        ConstructorOverLoading C11 = new ConstructorOverLoading(10, 25, 25.3);
        C11.display();
    }
}
