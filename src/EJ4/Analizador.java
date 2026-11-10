/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author rojas
 */
public class Analizador {
    private final int num;
    
    public Analizador(int numero){
        if (numero <= 0) {
            this.num = 1;
            System.out.println("ERROR: Se requiere un numero positivo. Se usará 1");
        }else{
            this.num = numero;
        }
    }
    
    public void mostrarDivisores(){
        System.out.println("Los divisores de " + num + " son:");
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
