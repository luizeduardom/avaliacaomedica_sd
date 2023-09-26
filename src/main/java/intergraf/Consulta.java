/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergraf;

import java.io.Serializable;
import java.util.ArrayList;

public class Consulta implements Serializable {
    ArrayList<String> mensagem = new ArrayList();

    public Consulta(ArrayList<String> mensagemRecebida) {
        for(int i = 0; i<mensagemRecebida.size(); i++){
            mensagem.add(mensagemRecebida.get(i));
        }
    }

    public ArrayList<String> getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "Consulta{" + "mensagem=" + mensagem + '}';
    }
    
    
    
    
    
    
    
}
