package semana04.overloading;

public class Calculator {

    public  int sumar( int numA, int numB){
       return numA + numB;
   }
public  int sumar( int numA, int numB, int numC){
       return numA + numB + numC;
   }
    public  int resta( int numA, int numB){
       return numA - numB;
   }

    public  int multiplicacion( int numA, int numB){
       return numA * numB;
   }
   
    public int division(int numA, int numB) {
   try {
    return numA / numB;
   } catch (ArithmeticException e) {
    System.out.println(" No se puede dividir entre CERO");
return 0;
   }
}
   
}
