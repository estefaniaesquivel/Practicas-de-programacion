package JAVA.Veterinaria.Practica;

public class Perro{

    private String nombre;
    private String tipoAnimal;
    private String raza;
    private int edad;

    public Perro(String nombre, String tipoAnimal, String raza, int edad){
        this.nombre=nombre;
        this.tipoAnimal=tipoAnimal;
        this.raza=raza;
        this.edad=edad;
    }

    @Override //se pone override porque toString cumple polimorfismo
    public String toString(){
        return tipoAnimal + ": " + nombre + ", " + raza + ", edad: " + edad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipoAnimString(){
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal=tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }   

}