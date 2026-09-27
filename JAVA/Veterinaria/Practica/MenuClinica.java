package JAVA.Veterinaria.Practica;
import java.util.Scanner;

public class MenuClinica {
   
    public static void main(String[] args){
        //medico hardcodeado:
        System.out.println("Medicos: ");
        Medico medico1 = new Medico("Diana", "Esquivel", "Bacelis", "Perros y gatos");
        System.out.println(medico1); //el toString solo se puede aplicar en la clase principal
        Scanner scanner = new Scanner(System.in);
        Medico medico2 = new Medico();
        System.out.println("nombre: ");
        medico2.setNombre(scanner.nextLine());
        System.out.println("apellido paterno: ");
        medico2.setApellidoPaterno(scanner.nextLine());
        System.out.println("apellido materno: ");
        medico2.setApellidoMaterno(scanner.nextLine());
        System.out.println("especializacion: ");
        medico2.setEspecializacion(scanner.nextLine());

        System.out.println("Animales: ");
        Animal animal1 = new Animal("Doki", "Perro", "mesizo", 16);
        System.out.println(animal1);

        

        scanner.close();


    }

    


}
