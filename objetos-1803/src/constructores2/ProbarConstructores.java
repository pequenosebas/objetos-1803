/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores2;

import javax.swing.JFrame;//Biblioteca para hacer aparecer una ventana

/**
 *
 * @author T-101
 */
public class ProbarConstructores {
    public static void main(String[] args) {
        //Vamos a crear un objeto
        Persona pl=new Persona();
        Persona p2=new Persona();
        
        JFrame ventanita=new JFrame("Hola mundo"); //Crear ventana y ponerle titulo
        ventanita.setSize(300,300);
        ventanita.setVisible(true);
    }
    
}
