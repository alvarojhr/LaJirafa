import Models.Base;
import Models.Estado;
import Models.Inventario;
import Models.Products.Producto;

public abstract class Main {
    public static void main(String[] args) {
        Inventario.setProductos();
        Menu.verMenu();
    }
}
