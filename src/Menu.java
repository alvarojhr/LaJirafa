import Models.Inventario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void verMenu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
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
                    // TODO: Implementar la lógica para mostrar los productos definidos en el inventario
                    verProductos();
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

    // TODO: Completar método
    private static void verProductos(){
        Inventario.getInventario();
    }
}
