/*
* Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
* Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
*/
import java.util.Scanner;
public class Ejercicio4_CalculoServicios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Seleccione la opción:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio");
        System.out.print("Ingrese su opción (1 o 2): ");
        int opcion = tcl.nextInt();
        tcl.nextLine(); 
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = tcl.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedulaCliente = tcl.nextLine();
        
        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente, tcl);
                break;
            case 2:
                calcularValorPredio(nombreCliente, cedulaCliente, tcl);
                break;
            default:
                System.out.println(" Opción no válida ");
        }
    }
    public static void calcularValorLuz(String nombre, String cedula, Scanner tcl) {
        System.out.print("Ingrese el valor del kilovatio: ");
        double valorKilovatio = tcl.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        double kilovatiosConsumidos = tcl.nextDouble();
        double totalAPagar = valorKilovatio * kilovatiosConsumidos; 
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f%n", nombre, cedula, totalAPagar);
    }
    public static void calcularValorPredio(String nombre, String cedula, Scanner tcl) {
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = tcl.nextDouble();
        double valorPredio = valorInmueble * 0.02; 
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", 
                          nombre, cedula, valorInmueble, valorPredio);
    }
}
/*
* Seleccione la opci�n:
* 1. Calcular valor de la planilla de luz
* 2. Calcular valor del predio
* Ingrese su opci�n (1 o 2): 1
* Ingrese el nombre del cliente: Juan Pedro
* Ingrese la c�dula del cliente: 1106021815
* Ingrese el valor del kilovatio: 4,7
* Ingrese el n�mero de kilovatios consumidos en el mes: 6
* Cliente Juan Pedro con c�dula 1106021815 debe cancelar el valor de $28,20
* BUILD SUCCESSFUL (total time: 43 seconds)
*/