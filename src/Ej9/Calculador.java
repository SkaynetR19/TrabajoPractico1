/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej9;

/**
 *
 * @author rojas
 */
public class Calculador {
    private final int r;
    
    public Calculador (int radio){
        this.r = radio;
    }
    
    public int calcularDiametro(){
        return 2 * r;
    }
    
    public double calcularArea(){
        return Math.PI * (r*r);
    }
    
    public double calcularCircunferencia(){
        return 2 * Math.PI * r;
    }
}
