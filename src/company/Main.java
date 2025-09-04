
package company;

public class Main {
 public static void main(String[] args) throws Exception {
    Employed employed1 = new Employed();
    employed1.name= "Juan";
    employed1.role= "admin";
    employed1.setSalary(100000);
    
    
    Employed employed2 = new Employed();
    employed2.name= "Javier";
    employed2.role= "empleado";
    employed2.setSalary(10);
    }
}