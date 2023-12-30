package opps;

public class Employee {

//METHODS USING 3 DEIFFERNT TYPES

    String IteamName;
    int Price;
    int Quntity;
    String PlaceofDelivery;
    int DateofDeLivery;

    void setdata(String Item, int Pri, int Qun, String PlaceDel, int DateDel) {
        IteamName = Item;
        Price = Pri;
        Quntity = Qun;
        PlaceofDelivery = PlaceDel;
        DateofDeLivery = DateDel;
    }

    void Display() {
        System.out.println(IteamName);
        System.out.println(Price);
        System.out.println(Quntity);
        System.out.println(PlaceofDelivery);
        System.out.println(DateofDeLivery);
    }

    public static void main(String[] args) {
        Employee Emm = new Employee();
        Emm.setdata("PHONE", 25000, 1, "HYDERBADA", 20071522);
        Emm.Display();
    }


}











/*
    int AGE;
    String PersonName;
    int DateofBirth;
    String PlaceOfBirth;

    void display() {
        System.out.println(PersonName);
        System.out.println(AGE);
        System.out.println(DateofBirth);
        System.out.println(PlaceOfBirth);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.PersonName = "Vikram";
        emp1.AGE = 28;
        emp1.DateofBirth = 20071995;
        emp1.PlaceOfBirth = "Hyderabad";
        emp1.display();
    }


}

    String EmpName;
    int DepId;
    int Salary;
    int EmpID;

    Employee(String Name, int DId, int Sal, int Eid ) {
         DepId= DId;
         EmpName=Name;
         Salary=Sal;
         EmpID=Eid;
    }
    void dispaly1(){
        System.out.println(EmpName);
        System.out.println(DepId);
        System.out.println(Salary);
        System.out.println(EmpID);
    }

    public static void main(String[] args){
        Employee EMP1= new Employee("vikram", 20,25000,035);
        EMP1.dispaly1();
    }
   */

