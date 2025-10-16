package semana04.overloading;

import semana04.overloading.clase.Calculator;

public class Main {
     public static void main(String[] args) throws Exception {

          Calculator cal = new Calculator();
          // Overloading para sumar. Misma clase diferentes parametros
          System.out.println(cal.sumar(2, 3));
          System.out.println(cal.sumar(2, 3, 5));

          System.out.println(cal.resta(2, 3));
          System.out.println(cal.multiplicacion(2, 3));
          System.out.println(cal.division(2, 0));

     }
}
