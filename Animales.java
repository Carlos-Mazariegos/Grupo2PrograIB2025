/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.primerentregablegrupo22025;

/**
 *
 * @author Carlos
 */
public class Animales {
    private int idAnimal;
    private String Especie;
    private String Alimentacion;
    private int Edad;
    private String Habitat;

    public Animales(int idAnimal,String Especie, String Alimentacion, int Edad, String Habitat) {
        this.idAnimal = idAnimal;
        this.Especie = Especie;
        this.Alimentacion = Alimentacion;
        this.Edad = Edad;
        this.Habitat = Habitat;
    }

    public int getidAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }


    
    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
    
    public void Alimentar(){
        System.out.println("El animal se esta alimentando");
        
    }    
}
