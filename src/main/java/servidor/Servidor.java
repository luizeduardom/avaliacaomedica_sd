package servidor;

import intergraf.Consulta;
import intergraf.Diagnostico;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Servidor implements Serializable {

    private static final int PORTA = 2000;
    private static ArrayList<Consulta> diagnosticos = new ArrayList();


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
            Consulta consulta = (Consulta) inputStream.readObject();

            System.out.println("Recebi do cliente os sintomas:" + consulta);

            diagnosticos.add(consulta);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            outputStream.writeObject(consulta);

            socket.close();
        }

    }
 
    public static int getPORTA() {
        return PORTA;
    }


}
