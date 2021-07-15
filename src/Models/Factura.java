package Models;

import Models.Products.Producto;

import java.util.ArrayList;
import java.util.Date;

public class Factura extends Base{
    private Cliente cliente;
    private Date fecha;
    private ArrayList<Producto> productos;

    public Factura(String nombre, Estado estado, Cliente cliente, Date fecha, ArrayList<Producto> productos) {
        super(nombre, estado);
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = productos;
    }

    //setter and getter

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //

}
