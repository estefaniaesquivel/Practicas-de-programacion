package JAVA.Veterinaria.Practica;
import java.util.Scanner;

public class MenuClinica {
   
    public static void main(String[] args){

        Clinica clinica = new Clinica(); //se instancia la clase con los ArrayList

        //medico hardcodeado:
        System.out.println("MEDICOS: ");
        Medico medico1 = new Medico("Diana", "Esquivel", "Bacelis", "Perros y gatos");
        //System.out.println(medico1); //el toString solo se puede aplicar en la clase principal
        clinica.registrarMedico(medico1);

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
        clinica.registrarMedico(medico2);


        //animal hardcodeo
        System.out.println("\nANIMALES: ");
        Animal animal1 = new Animal("Doki", "Perro", "mestizo", 16);
        //System.out.println(animal1);
        clinica.registrarAnimal(animal1);

        //cita hardcodeo
        Cita cita1= new Cita(animal1, medico1, "27-09-26", "revision general");//tiene que seguir el orden de las referencias en el constructor
        //System.out.println(cita1);
        clinica.registrarCita(cita1);

        //signos hardcodeo
        SignosVitales signosVitales1 = new SignosVitales(animal1, 4.50, 28.2);
        
        //consulta hardcodeo
        Consulta consulta1 = new Consulta(animal1, cita1, signosVitales1, "Infeccion");
        System.out.println(consulta1);

        
        System.out.println("\nMENU (escriba el numero de la accion que quiera solicitar)");
        System.out.println("\n1. Mostrar Lista de Medicos");
        System.out.println("\n2. Mostrar Lista de Animales");
        System.out.println("\n3. Mostrar Lista de Citas");
        System.out.println("\n4. Salir");
        int numeroDecision;
        numeroDecision = scanner.nextInt();
        switch(numeroDecision){
            case 1:
                clinica.mostrarMedicos();
                break;
            case 2:
                clinica.mostrarAnimales();
                break;
            case 3:
                clinica.mostrarCitas();
                break;
            case 4:
                System.out.println("Saliste del sistema");
                break;
            default:
                System.out.println("Entrada invalida");
                break;

        }
       
        scanner.close();

    }


}
