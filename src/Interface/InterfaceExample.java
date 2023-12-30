package Interface;


interface Testinter {
    int a = 10; // bydefault varaible is static and final

    void dispaly(); // abstract method
}

public abstract class InterfaceExample implements Testinter {

     void display(){
     System.out.println(a);
    }

    public static void main(String[] args) {

    }


}

