package Models.Products;

import Models.Estado;

public class Celular extends Producto {
    private String modelo;
    private float rom;
    private String unidadRom;
    private float ram;
    private String unidadRam;

    public Celular(String nombre, Estado estado, double precio, String marca, int cantidad, String modelo, float rom, String unidadRom, float ram, String unidadRam) {
        super(nombre, estado, precio, marca, cantidad);
        this.modelo = modelo;
        this.rom = rom;
        this.unidadRom = unidadRom;
        this.ram = ram;
        this.unidadRam = unidadRam;
    }

    //setters and getters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getRom() {
        return rom;
    }

    public void setRom(float rom) {
        this.rom = rom;
    }

    public String getUnidadRom() {
        return unidadRom;
    }

    public void setUnidadRom(String unidadRom) {
        this.unidadRom = unidadRom;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public String getUnidadRam() {
        return unidadRam;
    }

    public void setUnidadRam(String unidadRam) {
        this.unidadRam = unidadRam;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", rom=" + rom +
                ", unidadRom='" + unidadRom + '\'' +
                ", ram=" + ram +
                ", unidadRam='" + unidadRam + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
