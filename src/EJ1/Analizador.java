/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author Alumno
 */
public class Analizador {
    private final int n1, n2, n3;
    
    public Analizador(int num1, int num2, int num3){
            this.n1 = num1;
            this.n2 = num2;
            this.n3 = num3;
    }
    
    public int calcularSuma(){
        return n1 + n2 + n3;
    }
    
    public double calcularPromedio(){
        return calcularSuma()/3.0;
    }
    
    public int contarDiferentes(){
        if (n1 != n2 && n1 != n3 && n2 != n3){
            return 3;
        }else if(n1 == n2 && n2 == n3){
            return 0;
        }else{
            return 2;}
    }
    
    public int obtenerMayor(){
        int m = n1;
        if(n2 > m) m = n2;
        if(n3 > m) m = n3;
        return m;
    }
    
    public int obtenerMenor(){
        int m = n1;
        if(n2 < m) m = n2;
        if(n3 < m) m = n3;
        return m;
    }
    
    public int obtenerRestante(){
        return (n1 + n2 + n3) - obtenerMayor() - obtenerMenor();
    }
}
