package JAVA.Receta.PolloALaCrema;

import java.util.ArrayList;

public class Materiales {
    private ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
    private ArrayList<Utensilio> listaUtensilios = new ArrayList<>();


    public void registrarIngrediente(Ingrediente ingrediente){
        listaIngredientes.add(ingrediente);
    }
    public void registrarUtensilio(Utensilio utensilio){
        listaUtensilios.add(utensilio);
    }
    public void mostrarMateriales(){
        for (Ingrediente ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
        for (Utensilio utensilio : listaUtensilios) {
            System.out.println(utensilio);
        }
    }


    //getter necesario para quela clase ListaCompras consulte los ingredientes
    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }
    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }


    public void comprarIngredientes() {
        for (Ingrediente ingrediente : listaIngredientes) {
            if (!ingrediente.isDisponible()) {
                ingrediente.setDisponible(true); 
            }
        }
    }
    
}
    

    

