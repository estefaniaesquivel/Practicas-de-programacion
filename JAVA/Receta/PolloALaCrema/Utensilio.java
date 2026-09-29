package JAVA.Receta.PolloALaCrema;

public class Utensilio {
    private String nombre;

    public Utensilio(String nombre){
        this.nombre=nombre;

    }
    public Utensilio(){

    }

    @Override 
    public String toString(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}    
    

