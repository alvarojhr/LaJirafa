package Models.Products;

import Models.Estado;

public class ArticuloAseo extends Producto {
    private float medida;
    private String unidadMedida;

    public ArticuloAseo(String nombre, Estado estado, double precio, String marca, int cantidad, float medida, String unidadMedida) {
        super(nombre, estado, precio, marca, cantidad);
        this.medida = medida;
        this.unidadMedida = unidadMedida;
    }

    //getter and Setter

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    //


    @Override
    public String toString() {
        return "ArticuloAseo{" +
                "medida=" + medida +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
