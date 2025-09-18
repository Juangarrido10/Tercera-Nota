package semana02.company.hr;

public class Employee {
    public String name;
    private double salary;
    protected  String role;


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0){
        this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que 0");
        }
    }  
        public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
 
    public void increaseSalary(double amount){
        if (amount>0) {
            salary+=amount;
            System.out.println("Su nuevo salario es de : " + salary);
            
        }else{
            salary=salary;
        }
    }

}
