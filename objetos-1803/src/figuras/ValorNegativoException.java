/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

//No llevan logica las excepciones
public class ValorNegativoException extends Exception{//clase hija de la excepcion
    //constructor de defecto
    public ValorNegativoException(){
        super("No se permiten valores negativos");//el super va siempre en seguida del constructor ValorNegativoException
    }
    
}
