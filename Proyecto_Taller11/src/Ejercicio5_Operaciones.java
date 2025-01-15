/*
* Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado;
* mismo que se lo recibe como parámetro.
*/
import java.util.Scanner;
public class Ejercicio5_Operaciones {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = tcl.nextInt();
        int[][] matriz = new int[n][n];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("Suma de los elementos de la matriz: " + sumaMatriz(matriz));
        System.out.println("Resta de los elementos de la matriz: " + restaMatriz(matriz));
        System.out.println("Multiplicación de los elementos de la matriz: " + multiplicacionMatriz(matriz));
    }
    public static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10); 
            }
        }
    }
    public static void presentarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public static int restaMatriz(int[][] matriz) {
        int resta = matriz[0][0]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(i == 0 && j == 0)) {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }
    public static int multiplicacionMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}
/*
* Ingrese el tama�o de la matriz cuadrada: 
* 2
* 1 8 
* 1 1 
* Suma de los elementos de la matriz: 11
* Resta de los elementos de la matriz: -9
* Multiplicaci�n de los elementos de la matriz: 8
* BUILD SUCCESSFUL (total time: 1 second)
*/