package semana04.sobrecargarMetodos;

import semana04.sobrecargarMetodos.clase.Products;

public class Main {

    public static void main(String[] args) {

        Products producto1 = new Products();
        Products producto2 = new Products("Teclado", 120000);
        Products producto3 = new Products("Monitor", 400000, 5);

        System.out.println("Producto 1");
        System.out.println("Nombre: " + producto1.name);
        System.out.println("Precio: " + producto1.price);
        System.out.println("Cantidad: " + producto1.quantity);
        System.out.println();

        System.out.println("Producto 2");
        System.out.println("Nombre: " + producto2.name);
        System.out.println("Precio: " + producto2.price);
        System.out.println("Cantidad: " + producto2.quantity);
        System.out.println();

        System.out.println("Producto 3");
        System.out.println("Nombre: " + producto3.name);
        System.out.println("Precio: " + producto3.price);
        System.out.println("Cantidad: " + producto3.quantity);
        System.out.println();

        System.out.println("Actualizando producto 1");
        producto1.update(200000);
        producto1.update("Teclado Gamer");
    }

}
