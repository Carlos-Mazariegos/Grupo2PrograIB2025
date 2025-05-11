/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.primerentregablegrupo22025;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Arreglos {
    public static Animales[] Animales = new Animales[10];
    public static int contadorAnimales = 0;
    
    public static void agregarMamifero(Animales[] animales) {
    Scanner scanner = new Scanner(System.in);
    int idAnimal;
    boolean idRepetido;

   
    do {
        idRepetido = false;
        System.out.print("Ingrese el ID del animal: ");
        idAnimal = scanner.nextInt();
        scanner.nextLine(); 

        for (Animales a : animales) {
            if (a != null && a.getidAnimal()== idAnimal) {
                System.out.println("El identificador es único para cada animal.");
                idRepetido = true;
                break;
            }
        }
    } while (idRepetido);

    
    System.out.print("Ingrese la especie: ");
    String especie = scanner.nextLine();

    System.out.print("Ingrese el tipo de alimentación: ");
    String alimentacion = scanner.nextLine();

    System.out.print("Ingrese la edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Ingrese el hábitat: ");
    String habitat = scanner.nextLine();

    System.out.print("¿Es vivíparo? (true/false): ");
    boolean viviparo = scanner.nextBoolean();
    scanner.nextLine();

    
    for (int i = 0; i < animales.length; i++) {
        if (animales[i] == null) {
            animales[i] = new Mamiferos(idAnimal, especie, alimentacion, edad, habitat, viviparo);
            System.out.println(" Mamífero agregado correctamente.");
            break;
        }
    }
}

     public static void agregarAve(Animales[] animales) {
    Scanner scanner = new Scanner(System.in);
    int idAnimal;
    boolean idRepetido;

   
    do {
        idRepetido = false;
        System.out.print("Ingrese el ID del animal: ");
        idAnimal = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        for (Animales a : animales) {
            if (a != null && a.getidAnimal()== idAnimal) {
                System.out.println("El identificador es único para cada animal.");
                idRepetido = true;
                break;
            }
        }
    } while (idRepetido);

    // Resto de datos
    System.out.print("Ingrese la especie: ");
    String especie = scanner.nextLine();

    System.out.print("Ingrese el tipo de alimentación: ");
    String alimentacion = scanner.nextLine();

    System.out.print("Ingrese la edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); // limpiar buffer

    System.out.print("Ingrese el hábitat: ");
    String habitat = scanner.nextLine();

    System.out.print("¿Puede volar? (true/false): ");
    boolean puedeVolar = scanner.nextBoolean();
    scanner.nextLine();

    
    for (int i = 0; i < animales.length; i++) {
        if (animales[i] == null) {
            animales[i] = new Aves(idAnimal, especie, alimentacion, edad, habitat, puedeVolar);
            System.out.println(" Ave agregado correctamente.");
            break;
        }
    }
}
    
     public static void agregarReptil(Animales[] animales) {
    Scanner scanner = new Scanner(System.in);
    int idAnimal;
    boolean idRepetido;

   
    do {
        idRepetido = false;
        System.out.print("Ingrese el ID del animal: ");
        idAnimal = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        for (Animales a : animales) {
            if (a != null && a.getidAnimal()== idAnimal) {
                System.out.println("El identificador es único para cada animal.");
                idRepetido = true;
                break;
            }
        }
    } while (idRepetido);

    
    System.out.print("Ingrese la especie: ");
    String especie = scanner.nextLine();

    System.out.print("Ingrese el tipo de alimentación: ");
    String alimentacion = scanner.nextLine();

    System.out.print("Ingrese la edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Ingrese el hábitat: ");
    String habitat = scanner.nextLine();

    System.out.print("¿Es venenoso? (true/false): ");
    boolean venenoso = scanner.nextBoolean();
    scanner.nextLine();

    // Agregar al arreglo
    for (int i = 0; i < animales.length; i++) {
        if (animales[i] == null) {
            animales[i] = new Reptiles(idAnimal, especie, alimentacion, edad, habitat, venenoso);
            System.out.println(" Mamífero agregado correctamente.");
            break;
        }
    }
}
    
public static void ordenarAnimalesPorId(Animales[] animales) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("¿Desea ordenar por idAnimal en forma ascendente o descendente? (asc/desc): ");
    String orden = scanner.nextLine().toLowerCase();

    // Contar cuántos animales hay (no nulos)
    int cantidad = 0;
    for (Animales a : animales) {
        if (a != null) cantidad++;
    }
    
      if (cantidad == 0) {
        System.out.println("El arreglo está vacío. No hay animales para ordenar.");
        return;
    }

    // Burbuja directa sobre el mismo arreglo para no eliminar animales
    for (int i = 0; i < cantidad - 1; i++) {
        for (int j = 0; j < cantidad - i - 1; j++) {
            if (orden.equals("asc")) {
                if (animales[j].getidAnimal()> animales[j + 1].getidAnimal()) {
                    Animales temp = animales[j];
                    animales[j] = animales[j + 1];
                    animales[j + 1] = temp;
                }
            } else if (orden.equals("desc")) {
                if (animales[j].getidAnimal() < animales[j + 1].getidAnimal()) {
                    Animales temp = animales[j];
                    animales[j] = animales[j + 1];
                    animales[j + 1] = temp;
                }
            } else {
                System.out.println("Orden no válido. Use 'asc' o 'desc'.");
                return;
            }
        }
    }

    System.out.println("Animales ordenados correctamente por idAnimal en orden " + 
        (orden.equals("asc") ? "ascendente." : "descendente."));
}

public static void mostrarAnimales(Animales[] animales) {
    boolean hayAnimales = false;
    System.out.println("\n--- LISTADO DE ANIMALES REGISTRADOS ---");

    for (Animales a : animales) {
        if (a != null) {
            hayAnimales = true;
            String tipo = "Desconocido";
            if (a instanceof Mamiferos) {
                tipo = "Mamífero";
            } else if (a instanceof Aves) {
                tipo = "Ave";
            } else if (a instanceof Reptiles) {
                tipo = "Reptil";
            }

            System.out.println("ID: " + a.getidAnimal());
            System.out.println("Tipo: " + tipo);
            System.out.println("Especie: " + a.getEspecie());
            System.out.println("Alimentación: " + a.getAlimentacion());
            System.out.println("Edad: " + a.getEdad());
            System.out.println("Hábitat: " + a.getHabitat());
            System.out.println("----------------------------------");
        }
    }

    if (!hayAnimales) {
        System.out.println("No hay animales registrados.");
    }
}

     
     
     
    
}
