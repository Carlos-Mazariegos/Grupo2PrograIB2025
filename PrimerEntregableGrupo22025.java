/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.umg.primerentregablegrupo22025;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class PrimerEntregableGrupo22025 {
static Animales[] animales = new Animales[50];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int opcion=-1;
        do {
        try{
            System.out.println("\n***MENU PRINCIPAL***");
                System.out.println("1. ZOO");
                System.out.println("2. ARREGLOS");
                System.out.println("3. FASE III");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        submenu1(); 
                        break;
                    case 2:
                        submenu2();
                        break;
                    case 3:
                        System.out.println("FASE III no está disponible aún.");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Por favor ingrese una opción válida (1, 2, 3 o 4).");
                scanner.nextLine(); 
            }
        } while (opcion != 4);

        scanner.close();
    }
    public static void submenu1(){ 
    Scanner scanner = new Scanner (System.in);
    int opcion;
    try{
    do{
    System.out.println("***ZOO***");
            System.out.println("1. Registrar animal ");
            System.out.println("2. Listar animales");
            System.out.println("3. Alimentar animales");
            System.out.println("4. Calcular alimento");
            System.out.println("5. Guardar registros ");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    Zoologico.registrar_Animal();
                    break;
                case 2:
                    Zoologico.listar_Animal();
                    break;
                case 3:
                    Zoologico.alimentar_Animal();
                    break;
                case 4:
                    Zoologico.calcular_Alimento();
                    break;
                case 5:
                    Zoologico.importar_Animal();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            } 
            
    } while (opcion != 6);            
    }catch(Exception e){
     System.out.println("Por favor ingrese una opción valida (1, 2, 3, 4 o 5)"); }
         
   }
    
public static void submenu2() {
    Scanner scanner = new Scanner(System.in);
    String opcion;

    try {
        do {
            System.out.println("***Arreglos***");
            System.out.println("a. Agregar Mamífero");
            System.out.println("b. Agregar Ave");
            System.out.println("c. Agregar Reptil");
            System.out.println("d. Ordenar Arreglo");
            System.out.println("e. Mostrar Arreglos");
            System.out.println("f. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine().toLowerCase(); // Convertimos a minúscula por seguridad

            switch (opcion) {
                case "a":
                    Arreglos.agregarMamifero(animales);
                    break;
                case "b":
                    Arreglos.agregarAve(animales);
                    break;
                case "c":
                    Arreglos.agregarReptil(animales);
                    break;
                case "d":
                    Arreglos.ordenarAnimalesPorId(animales);
                    break;
                case "e":
                    Arreglos.mostrarAnimales(animales);
                    break;
                case "f":
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (!opcion.equals("f")); 
    } catch (Exception e) {
        System.out.println("Por favor ingrese una opción válida (a, b, c, d, e o f)");
    }
}
 }              
