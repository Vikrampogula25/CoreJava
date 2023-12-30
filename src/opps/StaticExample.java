package opps;

public class StaticExample {

    int a;// non static
    static int b;// static variable



    static void m1(){
        System.out.println("this is M1 static Method");
    }
    void m2(){
        System.out.println("this is M2 non static Method");
    }

    void m3(){
        a=500;
        b =200;
        m1();
        m2();
    }
    public static void main(String[] args){

        // static methods can access static stuff only
        b=200;
        System.out.println(b);
        m1();

        //m2();// not accissible bcoz it is non static methos
        //a=200; not accissible bcoz it is non static variable

    }
}
