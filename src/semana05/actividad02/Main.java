package semana05.actividad02;

import java.util.ArrayList;

import semana05.actividad02.clase.Producto;

public class Main {
    public static void main(String[] args) {
        // Crear ArrayList de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Agregar 5 productos al ArrayList
        productos.add(new Producto("Laptop", 1200.50));
        productos.add(new Producto("Mouse", 25.99));
        productos.add(new Producto("Teclado", 45.75));
        productos.add(new Producto("Monitor", 300.00));
        productos.add(new Producto("Auriculares", 8550.25));

        System.out.println("=== LISTA DE PRODUCTOS ===");
        System.out.println("Total de productos: " + productos.size());
        System.out.println();

        // Usar foreach para recorrer el ArrayList e imprimir cada producto
        for (Producto producto : productos) {
            producto.showInfo();
        }

    }
}
