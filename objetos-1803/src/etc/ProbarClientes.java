/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class ProbarClientes {
   // private ArrayList<GeneradorTarjetas> tarjetas;
    public static void main(String[] args){
        GeneradorTarjetas g=new GeneradorTarjetas();
        
        for(int x=0;x<4;x++) 
        {
        System.out.println(g.getClientes());
        }
        
    }
}
