package Models.Products;

import Models.Estado;

public class Electrodomestico extends Producto {
    private float consumo;
    private float tamanoH;
    private float tamanoV;

    public Electrodomestico(String nombre, Estado estado, double precio, String marca, int cantidad, float consumo, float tamanoH, float tamanoV) {
        super(nombre, estado, precio, marca, cantidad);
        this.consumo = consumo;
        this.tamanoH = tamanoH;
        this.tamanoV = tamanoV;
    }

    //getter and setter

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getTamanoH() {
        return tamanoH;
    }

    public void setTamanoH(float tamanoH) {
        this.tamanoH = tamanoH;
    }

    public float getTamanoV() {
        return tamanoV;
    }

    public void setTamanoV(float tamanoV) {
        tamanoV = tamanoV;
    }

    //


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "consumo=" + consumo +
                ", tamanoH=" + tamanoH +
                ", tamanoV=" + tamanoV +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
