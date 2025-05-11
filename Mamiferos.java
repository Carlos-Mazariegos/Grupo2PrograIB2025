/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.primerentregablegrupo22025;

/**
 *
 * @author Carlos
 */
public class Mamiferos extends Animales{
    private boolean tipoReproduccion;

   
    
    public Mamiferos(int idAnimal, String Especie, String Alimentacion, int Edad, String Habitat, Boolean tipoReproduccion) {
    super(idAnimal, Especie, Alimentacion, Edad, Habitat);
        this.tipoReproduccion = this.tipoReproduccion;
    }
    
     public boolean isTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(boolean tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }
    
  @Override
    public void Alimentar() {
        System.out.println("El/La " + getEspecie() + " es: "+ getAlimentacion());
    }
}

