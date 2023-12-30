package Ingeritence;


class A {
    int a;
    int b;

    void dispaly() {
        System.out.println(a + b);
    }
}

class B extends A {
    int x;
    int y;

    void show() {
        System.out.println(x + y);
    }
}

    class C extends B{
        int a1;
        int b1;
        void addition(){
            System.out.println(a1+b1);
        }
    }


public class Test1 {
    public static void main(String[] args) {
        A cd = new A();
        cd.b = 100;
        cd.a = 200;
        cd.dispaly();

        B FG = new B();
        FG.x = 100;
        FG.y = 3500;
        FG.a=200;
        FG.b=300;
        FG.dispaly();

        FG.show();
        C MJ = new C();

    }
}
