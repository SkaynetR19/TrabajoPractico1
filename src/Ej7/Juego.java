/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;
import java.util.Random;
/**
 *
 * @author rojas
 */
public class Juego {
    private final int numAleatorio;
    private boolean find;
    
    public Juego(int rango){
        Random generador = new Random();
        this.numAleatorio = generador.nextInt(rango) + 1;
        this.find = false;
    }
    
    public void mensajeMayor(){
        System.out.println("Nononono :p,  el numero introducido es MAYOR");
    }
    
    public void mensajeMenor(){
        System.out.println("Fallaste xD,  el numero introducido es MENOR");
    }
    
    public void mensajeGanador(){
        System.out.println("FELICIDADES: Encontraste el numero :D");
    }
    
    public void mensajeTryAgain(){
        System.out.println("Vamos, Intenta otra vez c:");
    }
    
    public void iniciarJuego(){
        System.out.println("Empezemos a jugar :D");
    }
    
    public void comprobarIntento(int intento){
        if(intento < numAleatorio){
            mensajeMenor();
            mensajeTryAgain();
        }
        if(intento > numAleatorio){
            mensajeMayor();
            mensajeTryAgain();
        }
        if (intento == numAleatorio) {
            mensajeGanador();
            this.find = true;
        }
    }
    
        public boolean isFind(){
            return find;
        }
}
