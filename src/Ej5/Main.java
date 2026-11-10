/*
Ejercicio 5
Escribe un programa que escriba la tabla de multiplicar de cualquier número entero dado por el
usuario, entre 1 y 10.
 */
package Ej5;
import java.util.Scanner;
/**
 *
 * @author rojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int a = sc.nextInt();
        
        while(a < 1 || a > 10){
            System.out.println("ERROR: Se necesita un numero entre 1 y 10");
            System.out.println("Ingrese un numero: ");
            a = sc.nextInt();
        }
        
        Tabla miTabla = new Tabla(a);
        
        miTabla.mostrarTabla();
        
        sc.close();
    }
    
}
