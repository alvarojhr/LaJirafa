package Models.Products;

import Models.Estado;

public class Estufa extends Electrodomestico{
    private String tipoAloimentacion;
    private boolean tieneHorno;
    private int puestos;
    private String tipoEncendido;

    public Estufa(String nombre, Estado estado, double precio, String marca, int cantidad, float consumo, float tamanoH, float tamanoV, String tipoAloimentacion, boolean tieneHorno, int puestos, String tipoEncendido) {
        super(nombre, estado, precio, marca, cantidad, consumo, tamanoH, tamanoV);
        this.tipoAloimentacion = tipoAloimentacion;
        this.tieneHorno = tieneHorno;
        this.puestos = puestos;
        this.tipoEncendido = tipoEncendido;
    }

    public String getTipoAloimentacion() {
        return tipoAloimentacion;
    }

    public void setTipoAloimentacion(String tipoAloimentacion) {
        this.tipoAloimentacion = tipoAloimentacion;
    }

    public boolean isTieneHorno() {
        return tieneHorno;
    }

    public void setTieneHorno(boolean tieneHorno) {
        this.tieneHorno = tieneHorno;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public String getTipoEncendido() {
        return tipoEncendido;
    }

    public void setTipoEncendido(String tipoEncendido) {
        this.tipoEncendido = tipoEncendido;
    }
}
