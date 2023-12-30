package opps;

public class MethodsMayNotReturnValues {

    int a;
    int b;

    void sum() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodsMayNotReturnValues cal = new MethodsMayNotReturnValues();

        cal.a = 100;
        cal.b = 250;
        cal.sum();
    }
}