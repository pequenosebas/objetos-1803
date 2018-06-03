/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imcAbstraccion;

/**
 *
 * @author sebas
 */
public class ImcConversion {
    private Usuario usuario;
    
    public float calcular(){
        float resultado=usuario.getPeso()/(usuario.getAltura()*usuario.getAltura());
        return resultado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
