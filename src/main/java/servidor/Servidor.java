package servidor;

import intergraf.Diagnostico;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Servidor implements Serializable {

    private static final int PORTA = 2000;
    private static ArrayList<Consulta> diagnosticos = new ArrayList();
       private static final double CONFIANCA_MIN = 0.5;


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(PORTA);
            System.out.println("Servidor esperando conexões na porta: " + PORTA);
        } catch (BindException e) {
            e.printStackTrace();
            return;
        }

        new Diagnostico().setVisible(true);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Cliente conectado: " + socket.getInetAddress());

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                      
            ReqServer receive = (ReqServer) inputStream.readObject();
            
            switch (receive.getTipo()){
                case 1:
                    System.out.println("Recebi do cliente os sintomas:" + receive.getConsulta());       
                    diagnosticos.add(receive.getConsulta());
                break;
                case 2:
                    receive.getSintomas().remove(receive.getSintomas().size() - 1);
                    apriori(receive.getSintomas());
                break;
                    
                default:
                    System.out.println("Tipo invalido!");
            }               

            socket.close();
        }

    }
 
    public static int getPORTA() {
        return PORTA;
    }
    
    
    private static void apriori(ArrayList<String> sintomas) throws IOException {

        ArrayList<Candidato> diagnosticoApriori = new ArrayList<>(); //Lista para armazenar as doenças do apriori


        for (Consulta consulta : diagnosticos) {
            double confianca = 0;
            int contadorSintomas = 0; //Utilizo quando uma consulta tem o mesmo tamanho de outra

            
            // For para percorrer cada sintoma da consulta
            for (String sintoma : sintomas) {

                if (consulta.getSintomas().contains(sintoma)) {
                    contadorSintomas++;
                }
            }

            // Tamanho dos sintomas da consulta (excluindo o diagnostico)
            int tamanhoSintomas = consulta.getSintomas().size() - 1;
            
            // Tamanho dos sintomas que o usuário selecionou no checkbox
            int sintomasDoUsuario = sintomas.size();

            
            // Se existe algum sintoma da consulta no checkbox selecionado, ele verifica se o contador de sintomas do usuário é menor que o tamanho de sintomas que o 
            // usuário selecionou no checkbox, se for, ele faz um calculo de confiança onde o contador de sintomas do usuário é dividido pelo numero de sintomas selecionados
            // do checkbox. Se não, ele faz o calculo da confiança baseado no tamanho dos sintomas da consulta dividido pelo sintomas que o usuário selecionou no checkbox
            if (contadorSintomas > 0) {
                String diagnostico = consulta.getSintomas().get(tamanhoSintomas);

                if (contadorSintomas < tamanhoSintomas) {

                    confianca = (double) contadorSintomas / tamanhoSintomas;

                } else {

                    confianca = (double) tamanhoSintomas / sintomasDoUsuario;

                }

                // se a confiança for maior ou igual da confiança mínima estipulada, então ele cria um candidato passando a confiança e o diagnostico e adiciona no array de
                // candidatos
                if (confianca >= CONFIANCA_MIN) {

                    Candidato candidato = new Candidato(diagnostico, confianca);

                    if (candidato.getConfianca() >= CONFIANCA_MIN) {
                        diagnosticoApriori.add(candidato);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, diagnosticoApriori, "Diagnostico Automático - Apriori", JOptionPane.INFORMATION_MESSAGE);

    }

}
