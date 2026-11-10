/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author rojas
 */
public class Tabla {
    private final int num;
    
    public Tabla(int numero){
        if (numero > 0 && numero < 11) {
            this.num = numero;
        }else{
            System.out.println("ERROR: Se necesita un numero entre 1 y 10. Se usara 1");
            this.num = 1;
        }
    }
    
    public void mostrarTabla(){
        System.out.println("Tabla del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
