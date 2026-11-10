/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;
/**
 *
 * @author Alumno
 */
public class Analizador {
    private final int num;
    
    public Analizador(int anio){
        this.num = anio;
    }
    
    public boolean calcularBisiesto(){
            if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
                return true;
        }
        return false;
    }
}


