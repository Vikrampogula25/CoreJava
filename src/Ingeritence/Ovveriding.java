package Ingeritence;


class Bank {
    int getRateOfIntrest() {

        return 0;
    }
}

class SBI extends Bank {
    int getRateOfIntrest() {
        return 10;
    }
}

class ICICI extends Bank {
    int getRateOfIntrest() {
        return 15;
    }
}

class Axis extends Bank {
    int getRateOfIntrest() {
        return 12;
    }
}

public class Ovveriding {
    public static void main(String[] args) {

        SBI sbiobj = new SBI();
        System.out.println(sbiobj.getRateOfIntrest());
        ICICI iciciobj = new ICICI();
        System.out.println(iciciobj.getRateOfIntrest());
        Axis axisobj = new Axis();
        System.out.println(axisobj.getRateOfIntrest());
    }
}