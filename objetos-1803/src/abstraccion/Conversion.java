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
    
    Grados grados; //por CONSTRUCTOR
    Metros mts;
    
    public float mtsAPies(){
        float resultado1=mts.getMetros()*3.28f;
        return resultado1;
    }

    public Metros getMts() {
        return mts;
    }

    public void setMts(Metros mts) {
        this.mts = mts;
    }
    
    public float centAFar(){
        //Este metodo SI tiene logica
        float resultado=grados.getCentigrados()*1.8f+32; //la F se agrega para convertirlo a flotante ya que se esta considerando double
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    /***
public float mtsAPies(){
    float resultado1=mts.getMetros()*3.28f; //la F se agrega para convertirlo a flotante ya que se esta considerando double
        return resultado1;
}
    
    public Metros getMts() {
        return mts;
    }

    public void setMts(Metros mts) {
        this.mts = mts;
    }
    
   */
}
