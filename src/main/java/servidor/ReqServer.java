package servidor;

import java.io.Serializable;
import java.util.ArrayList;

public class ReqServer implements Serializable{
    private int tipo;
    private Consulta consulta;
    
    public ReqServer(int tipo, Consulta consulta){
        this.tipo = tipo;
        this.consulta = consulta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    
    public ArrayList<String> getSintomas(){
        return consulta.getSintomas();
    }
    
    
}
