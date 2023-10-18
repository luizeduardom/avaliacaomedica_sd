package intergraf;

import java.io.Serializable;
import java.util.ArrayList;

public class Consulta implements Serializable {
    
    ArrayList<String> sintomas = new ArrayList();

    public Consulta(ArrayList<String> mensagemRecebida) {
        for(int i = 0; i < mensagemRecebida.size(); i++){
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

    @Override
    public String toString() {
        return "" + sintomas;
    }
}
