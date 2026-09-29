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


}
