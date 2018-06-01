/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-101
 */
public class Arreglos1 {
    public static void main(String[] args) {
        
        //Arreglo de entero
        int []valores={1,-20,4};//Es un arreglo, crea una tabla donde contiene cada casilla los numeros de las llaves
        
        for(int i=0;i<valores.length;i++)//Si 'i<4 o mas', saldra una excepcion el cual desbordará el programa
        {//lenght=ajusta a los valores
            System.out.println(valores[i]);//Va estar dando la vuelta hasta mostrar cada uno de los valores de 'valores'
        }
        
        
        //ESTE CICLO FOR ES EL MEJORADO Y SE RECOMIENDA SIEMPRE
        for(int v:valores){
            System.out.println(v);
        }
        
        //SEGUNDA FORMA DE INICIALIZAR LOS ARREGLOS
        int otro[]=new int[4];//el tamaño es de 4
        
        for(int valor:otro)
        {
            System.out.println(valor);
        }
        
    }
    
}
