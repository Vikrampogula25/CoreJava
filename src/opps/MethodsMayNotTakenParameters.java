package opps;


//Calculations
public class MethodsMayNotTakenParameters {
     int a;
     int b;

     void sum(){
         System.out.println(a+b);
     }
     public static void main(String[] args){
         MethodsMayNotTakenParameters Caluculations = new MethodsMayNotTakenParameters();
         Caluculations.a =100;
         Caluculations.b =200;
         Caluculations.sum();
     }

}
