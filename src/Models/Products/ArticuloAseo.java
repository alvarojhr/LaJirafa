package Models.Products;

import Models.Estado;

public class ArticuloAseo extends Producto {
    private float peso;
    private String unidadMedida;

    public ArticuloAseo(String nombre, Estado estado, double precio, String marca, int cantidad, float peso, String unidadMedida) {
        super(nombre, estado, precio, marca, cantidad);
        this.peso = peso;
        this.unidadMedida = unidadMedida;
    }

    //getter and Setter

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    //
}
