/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej11;
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
        int numBin;
        Scanner sc = new Scanner(System.in);
 
        
        System.out.println("Ingrese el numero binario");
        numBin = sc.nextInt();
        Binario bin = new Binario(numBin);
        
        if (numBin > 0) {
            System.out.println("El valor en decimal de " + numBin + " es: " + bin.calcularDecimal());
        }
    }
    
}
