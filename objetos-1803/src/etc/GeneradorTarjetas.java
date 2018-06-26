/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

import java.util.*;

/**
 *
 * @author T-101
 */
public class GeneradorTarjetas {
    private ArrayList<Cliente> clientes;

    public GeneradorTarjetas() {
        
        clientes=new ArrayList<>();
        clientes.add(new Cliente("juan", new Tarjeta(1234, "Banamex", 32000)));
        clientes.add(new Cliente("Ana", new Tarjeta(5678,"HSBC",17500)));
        clientes.add(new Cliente("Pedro", new Tarjeta(8765,"Scotiabank",19600)));
        clientes.add(new Cliente("Irma", new Tarjeta(4321,"Bancomer",48000)));
        
        
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
