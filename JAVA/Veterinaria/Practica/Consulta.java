package JAVA.Veterinaria.Practica;

public class Consulta {
    private Animal animal;
    private SignosVitales signosVitales; //composicion
    private String diagnostico;
    private Cita cita;

    public Consulta(Animal animal, Cita cita, SignosVitales signosVitales, String diagnostico){
        this.animal=animal; //composicion
        this.cita = cita; //composicion
        this.signosVitales= signosVitales; //composicion
        this.diagnostico=diagnostico;
    }

    @Override 
    public String toString(){
        return "\nConsulta de: " + animal + "\nRealizada en la " + cita + "\n" + signosVitales + "\nDiagnostico: " + diagnostico + "\nFin de la consulta";
    }

    public Consulta(){

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }


    public SignosVitales getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    






}
