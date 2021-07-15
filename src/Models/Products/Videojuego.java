package Models.Products;

import Models.Estado;

public class Videojuego extends Producto{

    private String genero;
    private boolean isOnline;
    private String clasificacion;
    private boolean isMultijugador;
    private String plataforma;

    public Videojuego(String nombre, Estado estado, double precio, String marca, int cantidad, String genero, boolean isOnline, String clasificacion, boolean isMultijugador, String plataforma) {
        super(nombre, estado, precio, marca, cantidad);
        this.genero = genero;
        this.isOnline = isOnline;
        this.clasificacion = clasificacion;
        this.isMultijugador = isMultijugador;
        this.plataforma = plataforma;
    }

    //setters and getters

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isMultijugador() {
        return isMultijugador;
    }

    public void setMultijugador(boolean multijugador) {
        isMultijugador = multijugador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    //


    @Override
    public String toString() {
        return "Videojuego{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                ", genero='" + genero + '\'' +
                ", isOnline=" + isOnline +
                ", clasificacion='" + clasificacion + '\'' +
                ", isMultijugador=" + isMultijugador +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }


}
