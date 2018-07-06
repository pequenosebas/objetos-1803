/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class AplicacionFiguras {
    public static void main(String[] args) {
        
        try {
            //PRIMERO CREAMOS UN OBJETO DE TIPO Cuadrado
            Cuadrado c=new Cuadrado();
            
            //AJUSTAMOS EL VALOR DEL Lado
            ValidarValores.validarNoNegativo(4);//checked exception, ya verifica el error
            c.setLado(4);
            
            //GENERAMOS UN OBJETO DE TIPO Calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
            
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());//getMessage = se pone en contacto con el "super"
        }
    }
}
