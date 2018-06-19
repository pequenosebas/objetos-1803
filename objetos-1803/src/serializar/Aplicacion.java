/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) throws Exception{
        //VAMOS A USAR NUESTRO MODELO
        
        Cliente c=new Cliente();
        c.setEdad(22);
        c.setNombre("Sebastian");
        c.setSueldo(25000);
        
        PersistenciaUsuario.guardar(c);//se invoca el metodo guardar(se crea)
        System.out.println("Guardado con EXITO");
        
    }
}
