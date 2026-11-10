/*
 Escribe una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro de la circunferencia y el área del círculo mediante el uso del valor de punto flotante
3.14159 para PI. También puede utilizar la constante predefinida Math.PI para el valor. Esta
constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las
clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
Math mediante la instrucción import para usarla. Use las siguientes fórmulas (r es el radio):
diámetro = 2 r
circunferencia = 2 * PI * r
área = PI * r2
 */

package Ej9;
import java.util.Scanner;
/**
 *
 * @author rojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia");
        int radio = sc.nextInt();
        
        Calculador miCalculo = new Calculador(radio);
        
        int diametro = miCalculo.calcularDiametro();
        double area = miCalculo.calcularArea();
        
        
        System.out.println("El diametro es: " + diametro);
        System.out.println("El area de la circunferencia es: " + area + " m^2");
    }
    
}
