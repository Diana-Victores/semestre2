/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float libras;
         double toneladas;         
         System.out.println("CONVIERTE DE LIBRAS A TONELADAS");
         System.out.print("Ingresar libras (lb): ");
         Scanner scanner = new Scanner(System.in);
         libras = scanner.nextFloat();
         toneladas = 0.00045359237*libras;   
         
         System.out.println("=> " + toneladas + " toneladas"); 
    }
    
}
