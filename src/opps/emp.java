package opps;

public class emp {
    String EmpName;
    int Salary;
    int DeptNo;
    int EmployeCode;

    emp(String name, int Sal, int dno, int EmpId) {
        Salary = Sal;
        EmpName = name;
        DeptNo = dno;
        EmployeCode = EmpId;
    }

    void display() {
        System.out.println(Salary);
        System.out.println(EmpName);
        System.out.println(DeptNo);
        System.out.println(EmployeCode);
    }

    public static void main(String[] args) {
        emp emp1 = new emp("Vikram", 25, 25, 25);
        emp1.display();
    }
}