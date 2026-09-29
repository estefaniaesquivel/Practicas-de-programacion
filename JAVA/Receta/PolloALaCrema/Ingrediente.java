package JAVA.Receta.PolloALaCrema;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String  unidadMedida;
    private boolean disponible;

    public Ingrediente(String nombre, double cantidad, String unidadMedida, boolean disponible){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida=unidadMedida;
        this.disponible = disponible;
        
    }
    public Ingrediente(){

    }

    @Override
    public String toString() {
        return cantidad + " " + unidadMedida + " de " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double  cantidad){
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
