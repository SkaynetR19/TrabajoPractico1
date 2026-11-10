/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

/**
 *
 * @author rojas
 */
public class Multiplos {
    private final int n1,n2;
    
    public Multiplos(int numero1, int numero2){
        this.n1 = numero1;
        this.n2 = numero2;
    }
    
    public int sumarMultiplos(){
        int suma = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 5 == 0) suma = suma + i; 
        }
        return suma;
    }
    
    public void mostrarSuma(){
        System.out.println("La suma de los multiplos de 5 entre " + n1 + " y " + " es: " + sumarMultiplos());
    }
}
