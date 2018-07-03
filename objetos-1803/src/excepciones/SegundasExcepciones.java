/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class SegundasExcepciones {
    public static void main(String[] args) {
        
        int a=2;
        int b=2;
        int arreglo[]={1,2};
        
        try{
        String numeroMalo="cuatro";
        int numeroBueno=Integer.parseInt(numeroMalo);
        
        System.out.println(a/b);
        System.out.println(numeroBueno*2);
            System.out.println(arreglo[0]); //los 3 sout lanzan excepciones
        }
        catch(NumberFormatException e){ //va el nombre de la excepcion en en catch y siempre estara despues de un try
            System.out.println("Ingresa un numero valido?");
        }
        catch(ArithmeticException e){ //e = es una excepcion
            System.out.println("No se aceptan divisiones entre cero");
        }
        catch (Exception e){ //blindar el codigo, rescatar el codigo
            System.out.println("Veamos que excepcion ocurre: " + e.getMessage());//Muestra un mensaje
        }
    }
}
