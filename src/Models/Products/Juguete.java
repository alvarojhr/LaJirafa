package Models.Products;

import Models.Estado;

public class Juguete extends Producto {
    private String rangoEdad; // Why is it string?
    private String tipo;
    private int numeroPiezas;

    public Juguete(String nombre, Estado estado, double precio, String marca, int cantidad, String rangoEdad, String tipo, int numeroPiezas) {
        super(nombre, estado, precio, marca, cantidad);
        this.rangoEdad = rangoEdad;
        this.tipo = tipo;
        this.numeroPiezas = numeroPiezas;
    }

    //getter and setter

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }


    //
}
