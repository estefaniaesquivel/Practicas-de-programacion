package JAVA.Receta.PolloALaCrema;

import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<Ingrediente> listaCompras = new ArrayList<>();

    public void registrarIngrediente(Ingrediente ingrediente){
        listaCompras.add(ingrediente);
        System.out.println("Ingrediente añadido a la lista de compras");
    }
     public void mostrarIngredientes(){
        for (Ingrediente ingrediente : listaCompras) {
            System.out.println(ingrediente);
        }
    }

}
