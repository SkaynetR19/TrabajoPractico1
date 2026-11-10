/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej10;

/**
 *
 * @author rojas
 */
public class Empleado {
    private final double horasTrabajadas;
    private final double tarifaBase;
    
    public Empleado (double horasTrabajadas, double tarifa){
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaBase = tarifa;
    }
    
    public double CalcularSueldo(){
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaBase;
        }else{
            return horasTrabajadas * (tarifaBase * 1.5);
        }
    }
}
