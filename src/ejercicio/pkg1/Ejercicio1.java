package ejercicio.pkg1;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
       
        int a1, b2 , c3;
        
        a1 = 5;
        b2 = 8;
        c3 = 2;
        
        System.out.println("El resulta de la suma de los tres numeros son:" + Suma(a1, b2, c3));
    }
   
    public static int Suma (int a1, int b2, int c3)
    {
     int resultado;
     
     resultado = a1 + b2 + c3;
    
     return resultado;
     
    }
}


   