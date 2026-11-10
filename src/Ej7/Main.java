/*
Ejercicio 7
Escribe el programa para un juego que consista en averiguar un número. El programa nos indicará
cada vez si el número introducido es mayor o menor que la constante almacenada que tendremos
que averiguar. Cuando se descubre el numero mostrara un mensaje de felicitación.
 */
package Ej7;
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
        
        Juego partida = new Juego(100);
        
        partida.iniciarJuego();
        System.out.println("El numero esta entre 1 y 100. SUERTE!!! ");
        
        while(!partida.isFind()){
            System.out.println("Ingrese un numero: ");
            int a = sc.nextInt();
            
            partida.comprobarIntento(a);
        }
        
        sc.close();
    }
    
}
