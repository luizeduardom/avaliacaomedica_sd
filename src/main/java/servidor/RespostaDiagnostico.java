/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import intergraf.Consulta;
import intergraf.SolicitacaoDiagnostico;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class RespostaDiagnostico implements Serializable {

    private static final int PORTA = 2000;
    private static ArrayList<Consulta> consultas = new ArrayList<>();
    private static ArrayList<String> diagnosticoAutomatico;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(PORTA);
            System.out.println("Servidor esperando conexões na porta: " + PORTA);
        } catch (BindException e) {
            e.printStackTrace();
            return;
        }
        
        new SolicitacaoDiagnostico().setVisible(true);
        
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Cliente conectado: " + socket.getInetAddress());

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Consulta sintomas = (Consulta) inputStream.readObject();
            
            System.out.println("Recebi do cliente os sintomas:" + sintomas );

            consultas.add(sintomas);

            diagnosticoAutomatico = realizarDiagnosticoAutomatico(consultas);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            outputStream.writeObject(diagnosticoAutomatico);

            socket.close();
        }

    }

    public static int getPORTA() {
        return PORTA;
    }

    public static ArrayList<String> getDiagnosticoAutomatico() {
        return diagnosticoAutomatico;
    }

    private static ArrayList<String> realizarDiagnosticoAutomatico(ArrayList<Consulta> consultas) {
        ArrayList<String> diagnostico = new ArrayList();
        diagnostico.add("Diagnosticado como dengue pelo médico Asdrubal");
        ArrayList<String> sintomas = new ArrayList();
        consultas.get(0).setDiagnosticos(diagnostico);
        diagnosticoAutomatico = consultas.get(0).getDiagnosticos();
        return diagnosticoAutomatico;
    }
}
