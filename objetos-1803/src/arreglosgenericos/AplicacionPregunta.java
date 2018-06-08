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
import java.util.*;//Biblioteca para ocupar los ArrayList

public class AplicacionPregunta {
    public static void main(String[] args) {
        //Generamos las opciones
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
        //Solo se ha condtruida la ArrayList
        
        //Ahora si este ArrayList lo agregamos a la primera pregunta
        p11.setOpciones(opcionesp11); //Ya conoce o detecta al arrayList
        
        //Sigue el cuestionario
        Cuestionario c1=new Cuestionario();
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        c1.setPregunta(preguntas);
        
        for(Pregunta p:preguntas){//depues de los : va un Arreglo
            System.out.println(p.getTitulo());//sout
            
            for(Opcion o:p.getOpciones()){//solicita las opciones de la pregunta
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
        
    }
    
}
