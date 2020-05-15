/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n1, n2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: "); 
        n1 = sc.nextInt();     
        
        System.out.println("Introduce otro número entero: "); 
        n2 = sc.nextInt();     
        
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);

    }
    
}
