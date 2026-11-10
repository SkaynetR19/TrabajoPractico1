/*
Ejercicio 2
Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no. Recuerda
que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100 y no lo son de
400. Es decir el año 2000 si es bisiesto, pero no lo son el 1990 ni el 2100.
 */
package Ej2;

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
        
        System.out.println("Ingrese un año: ");
        int anio = sc.nextInt();
        
        Analizador miAnalisis = new Analizador(anio);
        
        System.out.println("El (" + anio + ") es bisiesto: " + miAnalisis.calcularBisiesto());
        
        sc.close();
    }
    
}
