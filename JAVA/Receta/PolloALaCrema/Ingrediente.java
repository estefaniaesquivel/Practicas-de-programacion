package JAVA.Receta.PolloALaCrema;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String  unidadMedida;

    public Ingrediente(String nombre, double Cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida=unidadMedida;
    }
    public Ingrediente(){

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
    
}
