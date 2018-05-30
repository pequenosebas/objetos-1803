/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Conversion {
    
    private Grados grados; //por CONSTRUCTOR
    private Longitudes longitudes;
    
    public float centAFar(){
        //Este metodo SI tiene logica
        float resultado=grados.getCentigrados()*1.8f+32; //la F se agrega para convertirlo a flotante ya que se esta considerando double
        return resultado;
    }
    
    public float metrosAPies(){
        float resultado=longitudes.getMetros()*3.28f;
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }
    
    
}
