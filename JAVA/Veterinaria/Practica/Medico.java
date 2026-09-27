package JAVA.Veterinaria.Practica;

public class Medico {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String especializacion;

    public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, String especializacion){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.especializacion=especializacion;
    }
    
    public Medico(){

    }

    @Override 
    public String toString(){
        return "Medico: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + ", especializacion: " + especializacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

}
