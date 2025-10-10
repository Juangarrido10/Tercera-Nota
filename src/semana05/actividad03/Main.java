package semana05.actividad03;

public class Main {
    public static void main(String[] args) {
        // Crear empleados con diferentes roles
        Employee emp1 = new Employee("Manager");
        Employee emp2 = new Employee("Developer");
        Employee emp3 = new Employee("Designer");
        Employee emp4 = new Employee("Analyst");
        
        System.out.println("=== RESPONSABILIDADES DE EMPLEADOS ===");
        
        System.out.println("\nEmpleado 1:");
        emp1.ShowResponsibilities();
        
        System.out.println("\nEmpleado 2:");
        emp2.ShowResponsibilities();
        
        System.out.println("\nEmpleado 3:");
        emp3.ShowResponsibilities();
        
        System.out.println("\nEmpleado 4:");
        emp4.ShowResponsibilities();
    }
}
