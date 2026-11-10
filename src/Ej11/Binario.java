/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author rojas
 */
public class Binario {
    private int numero;
    
    public Binario(int num){
        this.numero = num;
    }
    
    public int calcularDecimal(){
        int digito;
        int decimal = 0;
        int poscicion = 1;       
        boolean entradaValida = true;
         
        while(numero > 0){
            digito = numero % 10;
            if (digito != 0 && digito != 1) {
               entradaValida = false;
               break;
            }
            decimal += digito * poscicion;
         
            poscicion *= 2;
        
            numero /= 10;
        }
        
        if (!entradaValida) {
            System.out.println("Entrada invalida!");
        }
        
        return decimal;
    }
}
