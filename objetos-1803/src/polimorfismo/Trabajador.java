/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author T-101
 */
public abstract class Trabajador extends Object{
    private int seguro;
    private String nombre;
    private float sueldobase;
    
    public abstract void pagar();
       

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }
}
