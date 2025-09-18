package semana04.objetos;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand; // this se utiliza para acceder a los parametros
        this.year = year;
    }

    public void showInfo() {
        System.out.println("La marca es: " + brand);
        System.out.println("El año es: " + year);
    }
    
}
