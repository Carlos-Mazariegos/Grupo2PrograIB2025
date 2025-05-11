/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.primerentregablegrupo22025;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carlos
 */
public class Zoologico {
    private static Animales[] Animales = new Animales[10];
    private static int contadorAnimales = 0;

    public static void registrar_Animal() {
        if (contadorAnimales >= Animales.length) {
            System.out.println("No se pueden registrar más animales.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la especie del animal");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Ingrese la especie: ");
        String especie = scanner.nextLine();
        System.out.println("Ingrese el tipo de alimentación (carnívoro, herbívoro o omnívoro): ");
        String alimentacion = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        int idAnimal=0;
        scanner.nextLine(); 
        System.out.println("Ingrese el hábitat: ");
        String habitat = scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Es vivíparo? (true/false): ");
                boolean viviparo = scanner.nextBoolean();
                scanner.nextLine();
                Animales[contadorAnimales++] = new Mamiferos(idAnimal, especie, alimentacion, edad, habitat, viviparo);
                break;
            case 2:
                System.out.println("Puede volar? (true/false): ");
                boolean puedeVolar = scanner.nextBoolean();
                scanner.nextLine();
                Animales[contadorAnimales++] = new Aves(idAnimal, especie, alimentacion, edad, habitat, puedeVolar);
                break;
            case 3:
                System.out.println("Es venenoso? (true/false): ");
                boolean esVenenoso = scanner.nextBoolean();
                scanner.nextLine();
                Animales[contadorAnimales++] = new Reptiles(idAnimal, especie, alimentacion, edad, habitat, esVenenoso);
                break;
            default:
                System.out.println("Opción no válida. Elija una opción válida.");
                return;
        }
        System.out.println("Animal registrado correctamente!");
    }

    public static void listar_Animal() {
        if (contadorAnimales == 0) {
            System.out.println("No hay animales registrados.");
            return;
        }
        System.out.println("Lista de animales en el zoológico:");
        System.out.println("-------------------");
        for (int i = 0; i < contadorAnimales; i++) {
            Animales animal = Animales[i];
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("Alimentación: " + animal.getAlimentacion());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Hábitat: " + animal.getHabitat());

            if (animal instanceof Mamiferos) {
                System.out.println("Vivíparo: " + ((Mamiferos) animal).isTipoReproduccion());
            } else if (animal instanceof Aves) {
                System.out.println("Puede volar: " + ((Aves) animal).isPuedeVolar());
            } else if (animal instanceof Reptiles) {
                System.out.println("Es venenoso: " + ((Reptiles) animal).isEsVenenoso());
            }
            System.out.println("-------------------");
        }
    }

    public static void alimentar_Animal() {
        if (contadorAnimales == 0) {
            System.out.println("No hay animales para alimentar.");
            return;
        }

        System.out.println("Alimentando a los animales...");
        for (int i = 0; i < contadorAnimales; i++) {
            Animales[i].Alimentar(); 
        }
    }

    public static void calcular_Alimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la especie del animal: ");
        String especie = scanner.nextLine();

        Animales animal = null;
        for (int i = 0; i < contadorAnimales; i++) {
            if (Animales[i].getEspecie().equalsIgnoreCase(especie)) {
                animal = Animales[i];
                break;
            }
        }

        if (animal == null) {
            System.out.println("Animal no encontrado.");
            return;
        }

        System.out.println("Ingrese la cantidad de días: ");
        int dias = scanner.nextInt();
        if (dias < 0) {
            System.out.println("Por favor ingrese un dato válido.");
            return;
        }

        int consumoDiario = 0;
        switch (animal.getAlimentacion().toLowerCase()) {
            case "carnívoro":
                consumoDiario = 7;
                break;
            case "herbívoro":
                consumoDiario = 2;
                break;
            case "omnívoro":
                consumoDiario = 5;
                break;
            default:
                System.out.println("Tipo de alimentación no reconocido.");
                return;
        }

        int consumoTotal = calcularConsumoRecursivo(consumoDiario, dias);
        System.out.println("El animal " + animal.getEspecie() + " consumirá " + consumoTotal + " kg de alimento en " + dias + " días.");
    }

    // Función recursiva para calcular el alimento total
    private static int calcularConsumoRecursivo(int consumoDiario, int dias) {
        if (dias == 0) {
            return 0;
        }
        return consumoDiario + calcularConsumoRecursivo(consumoDiario, dias - 1);
    }

    public static void importar_Animal() {
        if (contadorAnimales == 0) {
            System.out.println("No hay datos para guardar.");
            return;
        }

        String rutaArchivo = "C:\\Users\\sergi\\Downloads.csv";

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write("Especie,Edad,Alimentación,Hábitat\n");

            for (int i = 0; i < contadorAnimales; i++) {
                Animales animal = Animales[i];
                writer.write(String.format("%s,%d,%s,%s\n",
                        animal.getEspecie(),
                        animal.getEdad(),
                        animal.getAlimentacion(),
                        animal.getHabitat()));
            }

            System.out.println("Datos guardados correctamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}


    
     


    
   
    

