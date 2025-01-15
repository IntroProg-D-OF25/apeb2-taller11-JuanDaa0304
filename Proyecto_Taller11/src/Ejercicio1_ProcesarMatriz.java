/*
* Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional.
* El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal 
* (quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
*/
import java.util.Scanner;
public class Ejercicio1_ProcesarMatriz {
    public static void main(String[] args) {
        int limFil = 0, limCol = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite de filas y columnas: ");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int matriz[][]= new int[limFil][limCol];
        GenerarMatriz(matriz);
        PresentarMatriz(matriz);
        System.out.println("ELEMENTOS PARES DE LA MATRIZ");
        PresentarParesMatriz(matriz);
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ:");
        PresentarImparesMatriz(matriz);
        System.out.println("PROMEDIO DE LA MATRIZ:"+PresentarPromedioMatriz(matriz));
        
        
    }
    public static void GenerarMatriz (int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void PresentarMatriz (int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
    }

    public static void PresentarParesMatriz (int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] %2 == 0)
                    System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static void PresentarImparesMatriz (int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] %2 != 0)
                    System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static double PresentarPromedioMatriz (int matriz[][]){
        int sumaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            sumaMatriz += matriz[i][j];
            
            }
        }
        return(sumaMatriz / (matriz.length * matriz[0].length));
    }
}
/*
* Dame limite de filas y columnas: 4 4
* 4 9 4 0 
* 5 4 1 5 
* 1 4 5 3 
* 4 6 4 0 
* ELEMENTOS PARES DE LA MATRIZ
* 4 4 0 
* 4 
* 4 
* 4 6 4 0 
* ELEMENTOS IMPARES DE LA MATRIZ:
* 9 
* 5 1 5 
* 1 5 3 
* PROMEDIO DE LA MATRIZ:3.0
* BUILD SUCCESSFUL (total time: 4 seconds)

*/