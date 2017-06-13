/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoinserciondirecta;



/**
 *
 * @author rojo5
 */
public class AlgoritmoInsercionDirecta {
static int[] numeros= {10,7,21,32,4,8};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenaNumeros(numeros);
        for(int i =0; i < numeros.length;i++){
        System.out.print(numeros[i]+ " ");
        }
    }
    
    public static void ordenaNumeros(int [] numeros){
        for (int i = 1; i < numeros.length; i++) {
			int aux = numeros[i];
			int j = i;
			while (j > 0 && numeros[j - 1] > aux) {
				numeros[j] = numeros[j - 1];
				j--;
			}
			numeros[j] = aux;
		}
    }
   
}
