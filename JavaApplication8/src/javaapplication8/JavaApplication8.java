
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class JavaApplication8 {

    
    public static void main(String[] args) {
         int n;
       Scanner leer=new Scanner (System.in);
       System.out.println("Escriba un numero del 1 al 5");
       n=leer.nextInt();
       if(n==1) {
           System.out.println("A");
           
       } else if (n==2){
           
            System.out.println("E");
       } else if (n==3){
            System.out.println("I");
       } else if (n==4){
           System.out.println("O");
       } else if (n==5) {
           System.out.println("U");
       } else {
           System.out.println("no es valido");
       }    
    }
      
       
     



      
              
       
