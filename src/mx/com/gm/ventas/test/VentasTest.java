package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.0);
        Producto producto2 = new Producto("Pantalon", 33);

        Orden orden1 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Producto producto3 = new Producto("Gorra", 11.34);

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }


}
