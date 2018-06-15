/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosgenericos;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorCuestionario {
    
    Cuestionario cuestionario;
    
    public GeneradorCuestionario(){
        cuestionario = new Cuestionario();//iniciamos el constructor
        
        Opcion o11=new Opcion();
        
            o11.setTitulo("Mizcalco");
            o11.setCorrecta(false);
            
        Opcion o21=new Opcion();
            o21.setTitulo("Texcoco");
            o21.setCorrecta(false);
            
        Opcion o31=new Opcion();
            o31.setTitulo("Madrid");
            o31.setCorrecta(true);
            
        Opcion o41=new Opcion();
            o41.setTitulo("Ecatepec");
            o41.setCorrecta(false);
            
        //Sigue la pregunta
        Pregunta p11=new Pregunta();//se crea el OBJETO
        p11.setTitulo("Cual es la Capital de España?");
        //Antes generamos el ArrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp11=new ArrayList<>();//Se hace generico a la Clase <Opciones>, solo aceptara los de tipo Opciones
        
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
        
        p11.setOpciones(opcionesp11); 
        
        //el constructor inicia los atributos
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        cuestionario.setPregunta(preguntas);
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
    
}
