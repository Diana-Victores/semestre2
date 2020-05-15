/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author Usuario
 */
public class JavaApplication25 {


public class InversaDeUnaMatriz {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		//El ususrio establece el tamaño de la matriz
		int a,b;
		System.out.println("Ingrese orden que tendra su matriz: ");
		a=Scan.nextInt();
		
		int [][]matriz=new int[a][a];
		
		
		//El usurio define los elementos de la matriz
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print("Ingrese un valor para la posicion A["+i+"]["+j+"]:");
				matriz[i][j]=Scan.nextInt();
			}
		}
		
		System.out.println();
		
		// Se muestra por pantalla la matriz establecida por el usuario
		System.out.println("Matriz A");
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
		//Hallar la determinante de la Matriz
		int MT[][]=new int[a][a];
		System.out.println();
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(matriz[0][0]==1){
			
		
		
				}
				else{
					if(matriz[0][0]==0){
				
			}
		}
		}
		}
	
		int diagonal=0;
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(matriz[i][j]==matriz[i][i]&&i==j){		
					   
		        }
		    }
		}
		
		

	}

}

    

