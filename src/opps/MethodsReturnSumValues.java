package opps;

public class MethodsReturnSumValues {


    int x;
    int y;

   int  sum(){
        return(x+y);
}
public static void main(String[] args){
       MethodsReturnSumValues cal = new MethodsReturnSumValues();
       cal.x=200;
       cal.y=3500;
       int r = cal.sum();
       System.out.println(r);

    }
}
