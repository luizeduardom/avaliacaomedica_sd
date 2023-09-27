/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergraf;

import java.io.Serializable;
import java.util.ArrayList;

public class Consulta implements Serializable {
    ArrayList<String> sintomas = new ArrayList();
    
    ArrayList<String> diagnosticos = new ArrayList();

    public Consulta(ArrayList<String> mensagemRecebida) {
        for(int i = 0; i<mensagemRecebida.size(); i++){
            sintomas.add(mensagemRecebida.get(i));
        }
    }

    public Consulta() {
        
    }
    
    

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
    }
    

    public ArrayList<String> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }
    
    

    @Override
    public String toString() {
        return "" + sintomas;
    }
    
    
    
    
    
    
    
}
