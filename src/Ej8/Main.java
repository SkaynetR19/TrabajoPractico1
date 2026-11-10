/*
Escribe un programa que ingrese un número entero positivo N y luego N números enteros e
imprima la suma de los números que se encuentran entre el mayor de los N números leídos y el
menor de los N números leídos.
 */
package Ej8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do{
            System.out.println("Ingrese un numero entero positivo N: ");
            while(!sc.hasNextInt()){
                System.out.println("Ingrese un numero entero valido.");
                sc.next();
            }
            n = sc.nextInt();
        }while(n <= 0);
        
        List<Integer> lista = new ArrayList<>();
        System.out.println("Ingrese los " + n + " numeros enteros:");
        for (int i = 0; i < n; i++) {
            System.out.println("Numero [" + (i+1) + "]: ");
            while (!sc.hasNextInt()){
                System.out.println("Debe ser un entero.");
                sc.next();
            }
            lista.add(sc.nextInt());
        }
        
        AnalizadorNumeros analizador = new AnalizadorNumeros(lista);
        
        int min = analizador.obtenerMinimo();
        int max = analizador.obtenerMaximo();
        int suma = analizador.sumarElementosIntermedios();
        
        System.out.println("\n---Resultados ---\n");
        System.out.println("Valor minimo: " + min);
        System.out.println("Valor maximo: " + max);
        System.out.println("Suma de los numeros entre " + min + " y " + max + ": " + suma);
        
        sc.close();        
    }
    
}
