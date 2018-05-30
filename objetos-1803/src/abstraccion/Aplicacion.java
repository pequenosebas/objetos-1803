/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear un objeto de tipos grados
        Grados g=new Grados(); //se convuierte en objeto por el =
        
        //A este objeto le asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        
        //creamos un objeto de la clase Conversion
        Conversion c=new Conversion();
        c.setGrados(g);
        
        //Aplicar el modelo
        
        System.out.println(c.centAFar());
        
        
    }
    
}
