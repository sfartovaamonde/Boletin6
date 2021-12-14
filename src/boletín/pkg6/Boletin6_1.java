
package boletín.pkg6;

import java.util.Scanner;

public class Boletin6_1 {



    public static void main(String[] args) {
        int masVelocidad;
        int menosVelocidad;
        
        
        
        Scanner sc = new Scanner(System.in);
        
        Coche obx1Coche = new Coche ();
        
        System.out.println("La velocidad actual del coche es : " +obx1Coche.getVelocidade()+"km/h");
        System.out.println("Introduce la velocida a acelar en km/h: ");
        
        masVelocidad = sc.nextInt();
        obx1Coche.acelerar(masVelocidad); 
        System.out.println("La velocidad actual del coche es: "+obx1Coche.getVelocidade()+"km/h");
        
        System.out.println("Introduce la velocidad al frenar en km/h");
        menosVelocidad = sc.nextInt();
        obx1Coche.frenar(menosVelocidad);
        System.out.println("La velocidad actual del coche es de: "+obx1Coche.getVelocidade()+"km/h");
        

    }
    
}
