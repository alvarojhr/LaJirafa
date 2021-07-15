package Models.Products;

import Models.Estado;

public class Nevera extends Electrodomestico {
    private float capacidadLts;
    private boolean noFrost;
    private int puertas;
    private String tipoNevera;

    public Nevera(String nombre, Estado estado, double precio, String marca, int cantidad, float consumo, float tamanoH, float tamanoV, float capacidadLts, boolean noFrost, int puertas, String tipoNevera) {
        super(nombre, estado, precio, marca, cantidad, consumo, tamanoH, tamanoV);
        this.capacidadLts = capacidadLts;
        this.noFrost = noFrost;
        this.puertas = puertas;
        this.tipoNevera = tipoNevera;
    }

    public float getCapacidadLts() {
        return capacidadLts;
    }

    public void setCapacidadLts(float capacidadLts) {
        this.capacidadLts = capacidadLts;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipoNevera() {
        return tipoNevera;
    }

    public void setTipoNevera(String tipoNevera) {
        this.tipoNevera = tipoNevera;
    }

    public int operacion1(){

        return 0;
    }

    public void  operacion2(){


    }

    public void  operacion3(){


    }
}
