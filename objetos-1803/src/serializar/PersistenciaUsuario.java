/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuario {//Persistencia: Cualquier operacion que se puede hacer en una BdD
    
    //PRIMERO GUARDAMOS.
    public static void guardar(Cliente c)throws Exception{//en persistencia se usa el Static...throws exception:lanzar excepcion contra error, previene errores
       //PASO 1:GENERAR EL ARCHIVO DONDE SE VA A GUARDAR EL SERIALIZADO
       ArrayList<Cliente> clientes=new ArrayList<>();
       
       File file=new File("D://archivaldo.yomero");//Si ya existe el achivo, lo reemplaza o sobreescribe si no, se crea
       
       if(file.exists())clientes=leer();
       
       clientes.add(c);
       //PASO 2: ES INDICAR QUE LO VAMOS A GENERAR PARA ESCRIBIR EN EL (abrir)
       FileOutputStream fos=new FileOutputStream(file);  //encadenamiento de objetos por constructores
       
       //ESCRIBIR UN OBJETO EN EL(escribir)
       ObjectOutputStream oos=new ObjectOutputStream(fos);//se usa el parametro fos del anterior
       
       oos.writeObject(clientes);//Este objeto c se serializa automaticamente
       oos.close();//cierra el serializado
    }
    
    public static ArrayList<Cliente> leer()throws Exception{//retornar el objeto guardado
    //PARA LEER PRIMERO PONEMOS EL ARCHIVO
    File file=new File("D://archivaldo.yomero");
    FileInputStream fis=new FileInputStream(file);//fis=FileInputStream
    ObjectInputStream ois=new ObjectInputStream(fis);
    ArrayList<Cliente> clientes=(ArrayList<Cliente>) ois.readObject();  //Se hace casting forzado (Cliente)
    return clientes;
    
    
    }
}
