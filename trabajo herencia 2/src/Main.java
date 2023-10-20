import persona.empleado;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        empleado persona1 = new empleado();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nMenú: ");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero ");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double cantidadDeposito = scanner.nextDouble();
                    persona1.ingresar(cantidadDeposito);
                    break;
                case 2:
                    System.out.println("Recuerda que solo puedes retirar la mitad o menos que tu saldo actual");
                    System.out.println("cuanto deseas retirar: $");
                    double retiro = scanner.nextDouble();
                    persona1.retirar(retiro);
                    break;
                case 3:
                    persona1.cuenta();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
