package JAVA.Veterinaria.Practica;
import java.util.Scanner;

public class MenuClinica {
   
    public static void main(String[] args){
        //medico hardcodeado:
        System.out.println("Medicos: ");
        Medico medico1 = new Medico("Diana", "Esquivel", "Bacelis", "Perros y gatos");
        System.out.println(medico1); //el toString solo se puede aplicar en la clase principal
        //medico con scan
        Scanner scanner = new Scanner(System.in);
        Medico medico2 = new Medico();
        System.out.println("nombre medico: ");
        medico2.setNombre(scanner.nextLine());
        System.out.println("apellido paterno: ");
        medico2.setApellidoPaterno(scanner.nextLine());
        System.out.println("apellido materno: ");
        medico2.setApellidoMaterno(scanner.nextLine());
        System.out.println("especializacion: ");
        medico2.setEspecializacion(scanner.nextLine());

        //animal hardcodeo
        System.out.println("Animales: ");
        Animal animal1 = new Animal("Doki", "Perro", "mestizo", 16);
        System.out.println(animal1);

        //cita hardcodeo
        Cita cita1= new Cita(animal1, medico1, "27-09-26", "revision general");//tiene que seguir el orden de las referencias en el constructor
        System.out.println(cita1);
        SignosVitales signosVitales1 = new SignosVitales(animal1, 4.50, 28.2);
        
        Consulta consulta1 = new Consulta(animal1, cita1, signosVitales1, "Infeccion");
        System.out.println(consulta1);
       

        scanner.close();


    }

    


}
