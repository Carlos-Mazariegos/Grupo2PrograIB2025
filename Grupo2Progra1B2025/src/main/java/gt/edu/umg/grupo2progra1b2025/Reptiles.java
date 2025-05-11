/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.grupo2progra1b2025;

/**
 *
 * @author Carlos
 */
public class Reptiles extends Animales{


    private boolean esVenenoso;
    public Reptiles(String Especie, String Alimentacion, int Edad, String Habitat, boolean esVenenoso) {
        super(Especie, Alimentacion, Edad, Habitat);
        this.esVenenoso = esVenenoso;
    }
        public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
    
    @Override
    public void Alimentar(){
        System.out.println("Este reptil es:" + getAlimentacion());
    }
}
