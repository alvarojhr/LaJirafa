package Models;

public class Estado {
    private int id;

    public Estado(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //
}
