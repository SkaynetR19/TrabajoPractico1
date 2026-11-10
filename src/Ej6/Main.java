/*
Ejercicio 6
Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos entre
dos enteros positivos leídos por teclado
 */
package Ej6;
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
        
        System.out.println("Ingrese 2 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
                
        Multiplos miMultiplo = new Multiplos(a,b);
        
        miMultiplo.mostrarSuma();
        
        sc.close();
    }
    
}
