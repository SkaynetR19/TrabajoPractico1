/*
Ejercicio 4
Escribe un programa que escriba todos los divisores de un número n entero positivo introducido por
el usuario.
 */
package EJ4;
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
        
        Analizador miAnalisis = new Analizador(a);
        
        miAnalisis.mostrarDivisores();
        
        sc.close();
     
    }
    
}
