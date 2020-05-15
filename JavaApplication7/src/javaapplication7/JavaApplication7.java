
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double a,b,p;
        System.out.print("Introduzca longitud del primer lado: ");
        a = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo lado: ");
        b = sc.nextDouble();
        p = (a*b)/2;
    System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)));
    
        
    }
    
}
