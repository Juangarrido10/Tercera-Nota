package semana05.actividad02.clase;

public class Producto {
    public String name;
    public double price;

    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Producto: " + name + " - Precio: $" + price);
    }
}
