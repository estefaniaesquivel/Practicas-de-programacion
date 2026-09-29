package JAVA.Receta.PolloALaCrema;

public class Cocina {

    public void prepararMateriales() {
        System.out.println("Todos los ingredientes y utensilios han sido puestos en la mesa de la cocina");
    }

    public void descongelarYLavar(Ingrediente ingrediente) {
        System.out.println("Se descogeló y lavó el " + ingrediente.getNombre());
    }

    public void cortar(Ingrediente ingrediente) {
        System.out.println("Se cortó el/la " + ingrediente.getNombre());
    }

    public void salpimentar(Ingrediente ingrediente) {
        System.out.println("se salpimentó el/la " + ingrediente.getNombre());
    }
    
    public void ajustarDeSal() {
        System.out.println("Se ajustó de sal");
    }

    public void echarEn(Ingrediente ingrediente, Utensilio utensilio) {
        System.out.println("Se agregó " + ingrediente.getNombre() + " dentro de " + utensilio.getNombre());
    }

    
    public void cocinar(int minutos) {
        System.out.println("Se puso a cocinar durante " + minutos + " minutos");
    }
    public void servir(){
        System.out.println("Se sirvió el pollo a la crema");

    }

}
