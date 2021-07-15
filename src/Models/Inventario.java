package Models;

import Models.Products.*;

import java.util.ArrayList;

public class Inventario {

    private static ArrayList<Producto> productos;

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static String getInventario(){
        String result = "";

        int cont = 1;
        for (Producto producto: productos) {
            result += cont+". "+producto.infoBasica() + "\n";
            cont++;
        }

        return result;
    }

    public static void setProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        Estado estadoActivo = new Estado("Activo");
        productos.add(new Celular("Iphone",estadoActivo,4000000,"Apple",10,"12 PRO MAX",128,"GB",6,"GB"));
        productos.add(new Electrodomestico("Lavadora",estadoActivo,2000000,"LG",1,500, 1.2f,1));
        productos.add(new Juguete("Ajedrez",estadoActivo,3400,"Ruibal", 20, "6+", " Juego de Mesa", 32 ));
        productos.add(new Videojuego("F1 2021",estadoActivo,1500000,"Apple",8,"Deportes",true,"E",true,"Windows OS/Android"));
        productos.add(new Juguete("Robot de baterias",estadoActivo,500000,"FisherPrice",5,"3 - 8","Robot",8));
        productos.add (new Juguete("Parqués",estadoActivo,8000, "Ronda", 30, "8+", "Juego de Mesa", 19));
        productos.add (new Juguete("Tio Rico", estadoActivo, 30000, "Ronda", 25, "10+", "Juego de Mesa", 50));
        productos.add (new ArticuloAseo("Clorox", estadoActivo, 12000, "Ajax", 20, 1, "Litro"));
        productos.add (new ArticuloAseo("Ariel Liquido", estadoActivo, 25000.0, "Ariel", 25, 2.5f, "Litro"));

        Inventario.productos = productos;
    }

    public static String getDetalleProducto(int option) {
        return productos.get(option-1).toString();
    }
}
