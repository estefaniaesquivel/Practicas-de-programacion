package JAVA.Veterinaria.Practica;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Animal> listaAnimales = new ArrayList<>();
    private ArrayList<Medico> listaMedicos = new  ArrayList<>();
    private ArrayList<Cita> listaCitas = new ArrayList<>();

    public void registrarAnimal(Animal animal){
        listaAnimales.add(animal);
        System.out.println("Animal registrado");

    }
    public void registrarMedico(Medico medico){
        listaMedicos.add(medico);
        System.out.println("Medico registrado");

    }
    public void registrarCita(Cita cita){
        listaCitas.add(cita);
        System.out.println("Cita registrada");
    }
    public void mostrarAnimales(){
        for (int contadorRegistro = 0; contadorRegistro < listaAnimales.size(); contadorRegistro++){
            Animal animal = listaAnimales.get(contadorRegistro);
            System.out.println(animal);
        }
    }
    public void mostrarMedicos(){
        for (int contadorRegistro=0; contadorRegistro < listaMedicos.size(); contadorRegistro++) {
            Medico medico = listaMedicos.get(contadorRegistro);
            System.out.println(medico);
        }
    }
    //tambien está la forma for-each para mostrar los elementos de la lista
    public void mostrarCitas(){
        for (Cita cita : listaCitas) {
            System.out.println(cita);
        }
    }




}
