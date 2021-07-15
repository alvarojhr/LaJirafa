package Models.Products;

import Models.Base;
import Models.Estado;

public class Producto extends Base {
    protected double precio;
    protected String marca;
    protected int cantidad;

    public Producto(String nombre, Estado estado, double precio, String marca, int cantidad) {
        super(nombre, estado);
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void vender(){}

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public String infoBasica(){
        return getNombre()+" - "+marca+" - "+"$"+precio;
    }
}
