
package semana02.company.main;

import semana02.company.hr.Employee;

public class Main {
 public static void main(String[] args) throws Exception {
    Employee employee1 = new Employee();
    employee1.setName("juan");
    employee1.setRole("admin");
    employee1.setSalary(5);
    employee1.increaseSalary(100);
    
    
    Employee employee2 = new Employee();
    employee2.setName("Javier");
    employee2.setRole("QA");
    employee2.setSalary(10);
    employee2.increaseSalary(50);


    System.out.println("Nombre: " + employee1.getName() + "\nSalario: " + employee1.getSalary() + " \nRol: " + employee1.getRole());
    System.out.println("Nombre: " + employee2.getName() + "\nSalario: " + employee2.getSalary() + " \nRol: " + employee2.getRole());
    
 }
}