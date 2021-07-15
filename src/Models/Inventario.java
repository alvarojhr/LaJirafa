package Models;

import Models.Products.*;

import java.util.ArrayList;

public class Inventario {

    private static ArrayList<Producto> productos;

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void getInventario(){

        for (Producto producto: productos) {
            System.out.println("Nombre: "+producto.getNombre()+", Cantidad: "+producto.getCantidad()+", Marca: "+producto.getMarca()+", Precio: "+producto.getPrecio());
        }
        
//        for (int i =0; i<Inventario.getProductos().size(); i++) {
//            System.out.println(Inventario.getProductos().get(i).getNombre());
//            System.out.println(Inventario.getProductos().get(i).getCantidad());
//            System.out.println(Inventario.getProductos().get(i).getMarca());
//            System.out.println(Inventario.getProductos().get(i).getPrecio());
//        }
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

        Inventario.productos = productos;
    }
}
