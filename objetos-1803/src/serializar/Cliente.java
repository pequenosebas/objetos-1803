/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;//para que sea serializable se escribe: implements Serializable

public class Cliente implements Serializable{
    
    private String nombre;
    private int edad;
    private float sueldo;

    public Cliente() { //Insert Code - Cosntructor - No seleccionar nada y Generate
        
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
