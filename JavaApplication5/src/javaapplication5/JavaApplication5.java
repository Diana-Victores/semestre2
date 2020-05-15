
package javaapplication5;
import java.util.Scanner
/**
 *
 * @author Diana
 */
public class JavaApplication5 {

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero);
    }
    
}
