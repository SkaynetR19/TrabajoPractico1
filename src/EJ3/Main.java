/*
Ejercicio 3
Escribe un programa que calcule el factorial de n donde n es un número entero mayor o igual que
cero dado por el usuario.
 */
package EJ3;
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
        int numero = sc.nextInt();
        
        Ejecutor miEjecucion = new Ejecutor(numero);
        
        System.out.println("El factorial de ("+ numero +") es: " + miEjecucion.factorial());
    }
    
}
