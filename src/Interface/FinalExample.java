package Interface;


class Test {
    final int a = 10;

   final void m1() {
        //  a=20;// not valid bcoz a is final variable
        System.out.println(a);
    }
}


class Test1 extends Test {
    //void m1() { // not valid bcoz m1 is final method
        //  a=20;// not valid bcoz a is final variable
       // System.out.println("mi is overriden");
    }


public class FinalExample {
}
