/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author rojas
 */
public class Ejecutor {
    private final int num;
    
    public Ejecutor(int numero){
        this.num = numero;
    }
    
    public int factorial() {
        if (num < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
        }
    
        int resultado = 1;
        for (int i = 0; i < num; i++) {
            resultado = resultado * (i + 1);
        }
        
        return resultado;
    }
    
}
