/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosgenericos;

/**
 *
 * @author T-101
 */
import java.util.*;

public class Cuestionario {
    private ArrayList<Pregunta> pregunta;
    private float resultado;

    public ArrayList<Pregunta> getPregunta() {
        return pregunta;
    }

    public void setPregunta(ArrayList<Pregunta> pregunta) {
        this.pregunta = pregunta;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
}
