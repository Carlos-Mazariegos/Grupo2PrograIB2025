/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.umg.grupo2progra1b2025;

/**
 *
 * @author Carlos
 */
public class Grupo2Progra1B2025 {
 public static void main(String[] args) {
        Animales Animales = new Animales("León","Carnívoro",4,"Savana");
        System.out.println("Especie: "+Animales.getEspecie());
        System.out.println("Dieta: "+Animales.getAlimentacion());
        System.out.println("Edad: "+Animales.getEdad());
        System.out.println("Hábitat: "+Animales.getHabitat());
        
        Animales.Alimentar();
                
    }
}
