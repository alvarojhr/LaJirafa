import Models.Factura;
import Models.Inventario;
import Models.Products.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public abstract class Menu {
    public static void verMenu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        String texto = "";
        Factura factura = new Factura();
        do{
            System.out.println("\n    /)/)\n" +
                    "   ( ..\\     \n" +
                    "   /'-._)   \n" +
                    "  /#/       \n" +
                    " /#/  La Jirafa Shop");
            System.out.println("\n1. Ver productos.");
            System.out.println("2. Acceder a la administracion.");
            System.out.println("3. Cancelar compra.");
            System.out.println("\n0. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    verProductos(sc,factura);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Por favor ingresa una opción válida.");
                    break;
            }
        }while (opcion != 0);
    }


    private static void verProductos(Scanner sc, Factura factura){
        System.out.println("\n---- Productos ----");
        System.out.println(Inventario.getInventario());

        System.out.print("Digite el número de uno de los productos, o digite cero para volver: ");
        int option = sc.nextInt();

        if (option != 0){
            System.out.println(Inventario.getDetalleProducto(option));
            int cant = agregarProducto(sc);
            if(cant > 0){
                Producto productoAgregar = Inventario.getDetalleProducto(option);
                Producto productoAgregarClone = new Producto(productoAgregar.getNombre(),productoAgregar.getEstado(), productoAgregar.getPrecio(),productoAgregar.getMarca(),cant);
                factura.agregarProductoCarrito(productoAgregarClone);
                Inventario.descontarProducto(option,cant);
            }
        }
    }

    private static int agregarProducto(Scanner sc){
        int cantProductos = 0;
        String opcion;
        do{
            System.out.print("¿Desea agregar este producto al carrito? (S/N): ");
            opcion= sc.next().toLowerCase(Locale.ROOT);
            switch (opcion){
                case "s":
                    System.out.print("¿Cuantas unidades desea? ");
                    cantProductos = sc.nextInt();
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Por favor digite una opción válida.");
            }
        }while (!opcion.equals("s") && !opcion.equals("n"));

        return cantProductos;
    }
}
