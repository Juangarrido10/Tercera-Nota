package company;

public class Employed {
    public String name;
    private double salary;
    protected  String role;


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0){
        this.salary = salary;
        }
    }  
    
}
