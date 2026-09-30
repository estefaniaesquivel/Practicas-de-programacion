package JAVA.Receta.PolloALaCrema;

import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<Ingrediente> listaCompras = new ArrayList<>();

    //constructor que recibe la clase materiales y hace la lista de compras automáticamente
    public ListaCompras(Materiales materiales) {
        for (Ingrediente ingrediente : materiales.getListaIngredientes()) {
            if (!ingrediente.isDisponible()) { 
                listaCompras.add(ingrediente);  
            }
        }
    }

     public void mostrarIngredientes(){
        if(listaCompras.isEmpty()){
            System.out.println("No falta nada");
        }else{
            System.out.println("\nLISTA DE COMPRAS:");
            for (Ingrediente ingrediente : listaCompras) {
                System.out.println(ingrediente);
            }
        }    
    }


}
