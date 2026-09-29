package JAVA.Receta.PolloALaCrema;

public class RecetaPolloALaCrema {
    public static void main(String[] args){
        Materiales materiales = new Materiales();
        Ingrediente pollo = new Ingrediente("Pechuga de pollo", 2, "piezas", false);
        Ingrediente cebolla = new Ingrediente("Cebolla", 1, "pieza", true);
        Ingrediente crema = new Ingrediente("Crema", 200, "ml", false);
        Ingrediente aceite = new Ingrediente("Aceite de oliva", 1, "chorrito", true);
        Ingrediente sal = new Ingrediente("Sal", 1, "pizca", true);
        Ingrediente pimienta = new Ingrediente("Pimienta", 1, "pizca", true);

        materiales.registrarIngrediente(pollo);
        materiales.registrarIngrediente(cebolla);
        materiales.registrarIngrediente(crema);
        materiales.registrarIngrediente(aceite);
        materiales.registrarIngrediente(sal);
        materiales.registrarIngrediente(pimienta);

        Utensilio sarten = new Utensilio("Sartén");
        Utensilio tabla = new Utensilio("Tabla de picar");
        Utensilio cuchillo = new Utensilio("Cuchillo");

        materiales.registrarUtensilio(sarten);
        materiales.registrarUtensilio(tabla);
        materiales.registrarUtensilio(cuchillo);

        ListaCompras listaDeCompras = new ListaCompras(materiales);
        listaDeCompras.mostrarIngredientes();

        materiales.comprarIngredientes();

        Cocina cocina = new Cocina();
        cocina.prepararMateriales();
        cocina.descongelarYLavar(pollo);
        cocina.cortar(cebolla);
        cocina.cocinar(5);
        cocina.echarEn(aceite, sarten);
        cocina.echarEn(cebolla, sarten);
        cocina.salpimentar(pollo);
        cocina.echarEn(pollo, sarten);
        cocina.echarEn(crema, sarten);
        cocina.ajustarDeSal();
        cocina.cocinar(5);
        cocina.servir();



    }
    



}
