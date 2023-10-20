package servidor;


public class Candidato {
    
    private String nome;
    private double confianca;

    public Candidato(String nome, double confianca) {
        this.nome = nome;
        this.confianca = confianca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConfianca() {
        return confianca;
    }

    public void setConfianca(double confianca) {
        this.confianca = confianca;
    }

    @Override
    public String toString() {
        return "Candidato " + nome + ", " + confianca * 100 + "% de chances.";
    }

}
