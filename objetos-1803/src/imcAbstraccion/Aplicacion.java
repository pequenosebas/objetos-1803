/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imcAbstraccion;

/**
 *
 * @author sebas
 */
public class Aplicacion {
    public static void main(String[] args) {
        Usuario g=new Usuario();
        
        g.setPeso(20);
        g.setAltura(10);
        
        ImcConversion c=new ImcConversion();
        c.setUsuario(g);
        
        System.out.println(c.calcular());
        
        
    }
    
}
