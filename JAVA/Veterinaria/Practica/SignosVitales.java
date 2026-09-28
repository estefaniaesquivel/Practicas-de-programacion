package JAVA.Veterinaria.Practica;

public class SignosVitales {
    private double peso;
    private double temperatura;
    private Animal animal; //aquí ya hay composicion

    public SignosVitales(Animal animal, double peso, double temperatura){
        this.animal=animal;
        this.peso=peso;
        this.temperatura=temperatura;
        
    }
    public SignosVitales(){

    }

    @Override 
    public String toString(){
        return "Signos de " +  animal + ": " + peso + "kg, " + temperatura + "°" + "\nRegistro de los signos de "+ animal.getNombre() + " finalizados.";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double temperatura(){
        return temperatura;
    }
    public void setTemperatura(double temperatura){
        this.temperatura=temperatura;
    }

    

}
