/*
* Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo.
* Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente.
* Se debe invocar a los procedimientos desde un método principal;
* Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo;
* 3 se llama al procedimiento obtenerAreaCuadrado.
* El área del cuadrado es igual a lado x lado x lado x lado
* El área del triángulo es igual a (base x altura)/2
* El área del rectángulo es igual a base x altura
*/
import java.util.Scanner;
public class Ejercicio2_AreaFiguras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
                System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        System.out.print("Ingrese su opción (1, 2 o 3): ");
        int opcion = tcl.nextInt();
        
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado(tcl);
                break;
            case 2:
                obtenerAreaTriangulo(tcl);
                break;
            case 3:
                obtenerAreaRectangulo(tcl);
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija 1, 2 o 3.");
        }
        
    }

    public static void obtenerAreaCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado; 
        System.out.println("El área del cuadrado es: " + area);
    }
    public static void obtenerAreaTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2; 
        System.out.println("El área del triángulo es: " + area);
    }
    public static void obtenerAreaRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura; 
        System.out.println("El área del rectángulo es: " + area);
    }
}
/*
* Seleccione la figura para calcular el �rea:
* 1. Cuadrado
* 2. Tri�ngulo
* 3. Rect�ngulo
* Ingrese su opci�n (1, 2 o 3): 2
* Ingrese la base del tri�ngulo: 3
* Ingrese la altura del tri�ngulo: 5
* El �rea del tri�ngulo es: 7.5
* BUILD SUCCESSFUL (total time: 12 seconds)
*/        

