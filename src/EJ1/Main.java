/*
Ejercicio 1
Escribe un programa que tome 3 números enteros introducidos por el usuario mediante el teclado y
determine cuántos de dichos números son diferentes, el promedio, la suma de todos, el producto del
mayor por el menor y si el número restante es divisible por 3.
 */
package EJ1;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Analizador miAnalisis = new Analizador(a,b,c);
        
        System.out.println("Diferentes: " + miAnalisis.contarDiferentes());
        System.out.println("Suma: " + miAnalisis.calcularSuma());
        System.out.println("Promedio: " + miAnalisis.calcularPromedio());
        
        System.out.println("Producto Mayor x Menor: " + (miAnalisis.obtenerMayor()* miAnalisis.obtenerMenor()));
        System.out.println("El restante (" + miAnalisis.obtenerRestante() + ") es divisible por 3: " + (miAnalisis.obtenerRestante() % 3 == 0));
        
        sc.close();
    }
    
}
