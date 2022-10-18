
package clasescanner;

import java.util.Scanner;


public class ClaseScanner {


    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        var nombre = lectura.nextLine();
        System.out.println("Tu nombre: " +nombre);
        
        System.out.println("Escribe tus apellidos: ");
        var apellidos = lectura.nextLine();
        System.out.println("Tu nombre y apellidos son: " +nombre+" "+apellidos);
        
        
        //EJERCICIO AFICION+NIVEL
        
        System.out.print("Introduce el nombre de tu afició: ");
        var aficion = lectura.nextLine();
        System.out.print("Introduce tu nivel(principiante, amateur, profesional): ");
        var nivel = lectura.nextLine();
        System.out.println("Tu afición es: "+aficion+", y tu nivel es: "+nivel);
        
    }
    
}
