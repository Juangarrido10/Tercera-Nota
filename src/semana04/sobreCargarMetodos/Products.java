package semana04.sobreCargarMetodos;

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

}