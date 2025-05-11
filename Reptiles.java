/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.primerentregablegrupo22025;

/**
 *
 * @author Carlos
 */
public class Reptiles extends Animales{


    private boolean esVenenoso;
    public Reptiles(int idAnimal,String Especie, String Alimentacion, int Edad, String Habitat, boolean esVenenoso) {
        super(idAnimal,Especie, Alimentacion, Edad, Habitat);
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
        System.out.println("El/La " + getEspecie() + " es: "+ getAlimentacion());
    }
}
