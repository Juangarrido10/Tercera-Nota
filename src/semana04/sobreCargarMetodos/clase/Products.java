package semana04.sobrecargarMetodos.clase;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products() {
        this.name = "Mouse";
        this.price = 80000;
        this.quantity = 3;
    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 2;
    }

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void update(String name) {
        this.name = name;
    }

    public void update(double price) {
        this.price = price;
    }

}