package opps;

public class MethodsMayTakenParameters {

    int x;
    int y;

    void sum1(int a, int b) {
        x = a;
        y = b;
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        MethodsMayTakenParameters Cal = new MethodsMayTakenParameters();
        Cal.sum1(200, 300);
    }
}