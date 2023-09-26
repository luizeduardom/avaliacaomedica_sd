/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import intergraf.Consulta;
import intergraf.SolicitacaoDiagnostico;
import java.awt.List;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eduardo
 */
public class RespostaDiagnostico implements Serializable{

    private static final int PORTA = 2000;
    private static ArrayList<Consulta> consultas = new ArrayList<>();
    private static ArrayList<String> diagnosticoAutomatico;

    public static void main(String[] args) throws IOException {
        
        new SolicitacaoDiagnostico().setVisible(true);
            
        try {
            ServerSocket serverSocket = new ServerSocket(PORTA);
            System.out.println("Servidor esperando conexões na porta: " + PORTA);
            
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado: " + socket.getInetAddress());
                
                /*ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                Consulta consulta = (Consulta) inputStream.readObject();
                
                consultas.add(consulta);
                
                diagnosticoAutomatico = realizarDiagnosticoAutomatico(consultas);
                
                System.out.println("Diagnóstico Automático: " + String.join(", ", diagnosticoAutomatico));
                
                
                socket.close();*/
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        
    }

    public static int getPORTA() {
        return PORTA;
    }

    public static ArrayList<String> getDiagnosticoAutomatico() {
        return diagnosticoAutomatico;
    }

    
    private static ArrayList<String> realizarDiagnosticoAutomatico(ArrayList<Consulta> consultas) {
        // Implemente a lógica do algoritmo Apriori aqui usando apenas List
        // Esta implementação de exemplo irá contar a frequência de cada sintoma

        ArrayList<String> todosSintomas = new ArrayList<>();
        for (Consulta consulta : consultas) {
            todosSintomas.addAll((consulta.getMensagem()));
        }

        for (String sintoma : todosSintomas) {
            long contagem = todosSintomas.stream().filter(s -> s.equals(sintoma)).count();
            if (contagem >= (consultas.size() / 2)) { // Define um limiar de frequência
                diagnosticoAutomatico.add(sintoma);
            }
        }

        return diagnosticoAutomatico;
    }
}

