/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author rojas
 */
public class AnalizadorNumeros {
    private final List<Integer> numeros;
    
    public AnalizadorNumeros(List<Integer> numeros){
        if(numeros == null || numeros.isEmpty()){
            throw new IllegalArgumentException("La lista de numeros no puede estar vacia.");
        }
        this.numeros = new ArrayList<>(numeros);
    }
    
    public int obtenerMinimo(){
        return Collections.min(numeros);
    }
    
    public int obtenerMaximo(){
        return Collections.max(numeros);
    }
    
    public int sumarElementosIntermedios(){
        int min = obtenerMinimo();
        int max = obtenerMaximo();
        int suma = 0;
        
        for (int num : numeros){
            if (num > min && num < max) {
                suma += num;
            }
        }
        
        return suma;
    }
}
