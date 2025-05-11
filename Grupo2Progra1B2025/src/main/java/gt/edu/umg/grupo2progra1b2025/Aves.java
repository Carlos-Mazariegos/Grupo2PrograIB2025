/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.grupo2progra1b2025;

/**
 *
 * @author Carlos
 */
public class Aves extends Animales{
    private boolean puedeVolar;

    public Aves(String Especie, String Alimentacion, int Edad, String Habitat, boolean puedeVolar) {
        super(Especie, Alimentacion, Edad, Habitat);
        this.puedeVolar = puedeVolar;
    }
    
        public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    
    @Override
    public void Alimentar(){
        System.out.println("El ave es: "+ getAlimentacion());
    }
    
}


