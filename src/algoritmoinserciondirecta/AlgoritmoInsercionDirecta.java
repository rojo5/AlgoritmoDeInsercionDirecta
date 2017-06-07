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
static int[] numeros= {10,7,21,32,4};
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
        int mayor;
        int menor;
        for(int i = 0; i<numeros.length;i++){
            for(int u=0; u<numeros.length;u++){
                if(numeros[i]<numeros[u]){
                    mayor= numeros[u];
                    menor= numeros[i];
                    numeros[i] = mayor;
                    numeros[u]=menor;
                }
            }
        }
    }
   
}
