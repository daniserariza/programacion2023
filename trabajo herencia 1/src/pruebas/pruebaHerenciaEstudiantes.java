package pruebas;

import HerenciaEstudiantes.Empleado;
import HerenciaEstudiantes.Estudiante;

import java.util.Scanner;

public class pruebaHerenciaEstudiantes {

    public static void main(String[] args) {
        //en este metodo lo que hacemos es poner manualmente la informacion
        Estudiante estudiante = new Estudiante("carlos", "17/06/2005", 123456);
        Empleado empleado = new Empleado("juan", "12/05/2002", 10000000.00);

        System.out.println(estudiante);
        System.out.println(empleado);
        System.out.println();
        System.out.println("dar la informacon de manera dinamica");
        //aca el usuario proporcionara la informaciond de manera dinamica

        Scanner scanner = new Scanner(System.in);

        //estudiante
        System.out.println("dime el nombre del usuario");
        String nombre = scanner.nextLine();
        System.out.println("dime la fecha de nacimiento del usuario:");
        System.out.println("DIA: ");
        String dia = scanner.nextLine();
        System.out.println("MES: ");
        String mes = scanner.nextLine();
        System.out.println("AÑO: ");
        String año = scanner.nextLine();
        System.out.println("dime el codigo del usuario: ");
        long codigo = scanner.nextLong();
        String fecha = dia+"/"+mes+"/"+año;
        scanner.nextLine(); // Consumir la nueva línea pendiente

        Estudiante estudianteDinamico = new Estudiante(nombre, fecha,codigo);
        System.out.println("informacion estudiante = " + estudianteDinamico);
        //empleado

        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("dime la fecha de nacimiento del usuario:");
        System.out.println("DIA: ");
        String diaE = scanner.nextLine();
        System.out.println("MES: ");
        String mesE = scanner.nextLine();
        System.out.println("AÑO: ");
        String añoE = scanner.nextLine();

        String fechaNacimientoEmpleado = diaE+"/"+mesE+"/"+añoE;
        System.out.print("Ingrese el salario del empleado: ");
        double salarioEmpleado = scanner.nextDouble();

        Empleado empleado2 = new Empleado(nombreEmpleado, fechaNacimientoEmpleado, salarioEmpleado);

        System.out.println("Información del Empleado:");
        System.out.println(empleado2);
        scanner.close();
    }
}