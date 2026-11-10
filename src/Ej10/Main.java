/*
Escribe una aplicación que determine el sueldo bruto para cada uno de cinco empleados. La
empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de
la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada
empleado. Su programa debe recibir como entrada esta información para cada empleado, debe
determinar y mostrar el sueldo bruto de cada trabajador.
 */
package Ej10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de empleados a cargar: ");
        n = sc.nextInt();
        
        List<Empleado> empleados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double hT,t;
            
            System.out.println("Ingrese las horas trabajadas del empleado " + (i+1) + ": ");
            hT = sc.nextDouble();
            
            System.out.println("Ingrese la tarifa del empleado " + (i+1) + ": ");
            t = sc.nextDouble();
                 
            empleados.add(new Empleado(hT,t));
        }
        
        System.out.println("Sueldo en bruto de cada empleado: ");
        
        int i = 0;
        for(Empleado emp : empleados){
            System.out.println("Empleado: " + (i+1) + " Sueldo: " + emp.CalcularSueldo());
            i++;
        }
    }
    
}
