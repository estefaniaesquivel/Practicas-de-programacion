package JAVA.Veterinaria.Practica;

public class Cita {
    private Animal animal;
    private Medico medico;
    private String fecha;
    private String motivo;

    public Cita(Animal animal,  Medico medico, String fecha, String motivo){
        this.animal=animal;
        this.medico=medico;
        this.fecha=fecha;
        this.motivo=motivo;
    }

    public Cita(){

    }

    @Override     
    public String toString(){
        return "Cita: " + fecha + ", " + medico + ", Animal: " + animal + ", Motivo: " + motivo;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public Medico getMedico(){
        return medico;
    }
    public void setMedico(Medico medico){
        this.medico=medico;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
