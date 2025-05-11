/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.grupo2progra1b2025;

/**
 *
 * @author Carlos
 */
public class Mamiferos extends Animales{
    private String tipoReproduccion;
    
    public Mamiferos(String Especie, String Alimentacion, int Edad, String Habitat, String tipoReproduccion) {
        super(Especie, Alimentacion, Edad, Habitat);
        this.tipoReproduccion = tipoReproduccion;
    }
     public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }
    
    
  @Override
    public void Alimentar() {
        System.out.println("Este mamífero es: " + getAlimentacion());
    }
}

