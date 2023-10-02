package intergraf;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import servidor.RespostaDiagnostico;


public class SolicitacaoDiagnostico extends javax.swing.JFrame {

 
    public SolicitacaoDiagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkCabeca = new javax.swing.JCheckBox();
        chkVomito = new javax.swing.JCheckBox();
        chkFebre = new javax.swing.JCheckBox();
        chkGarganta = new javax.swing.JCheckBox();
        chkOlho = new javax.swing.JCheckBox();
        chkCalafrio = new javax.swing.JCheckBox();
        chkDiarreia = new javax.swing.JCheckBox();
        chkInchaco = new javax.swing.JCheckBox();
        chkTontura = new javax.swing.JCheckBox();
        chkCansaco = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Solicitação de Diagnóstico");

        chkCabeca.setText("Dor de Cabeça");
        chkCabeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCabecaActionPerformed(evt);
            }
        });

        chkVomito.setText("Vômito");

        chkFebre.setText("Febre");

        chkGarganta.setText("Dor de Garganta");

        chkOlho.setText("Dor nos Olhos");

        chkCalafrio.setText("Calafrios");

        chkDiarreia.setText("Diarréia");

        chkInchaco.setText("Inchaço");
        chkInchaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInchacoActionPerformed(evt);
            }
        });

        chkTontura.setText("Tontura");
        chkTontura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTonturaActionPerformed(evt);
            }
        });

        chkCansaco.setText("Cansaço");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosticoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnostico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(chkCabeca)
                                            .addGap(8, 8, 8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chkOlho)
                                                .addComponent(chkTontura))
                                            .addGap(69, 69, 69)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkVomito)
                                            .addComponent(chkCalafrio))
                                        .addGap(202, 202, 202)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkInchaco)
                                    .addComponent(chkFebre)
                                    .addComponent(chkDiarreia)
                                    .addComponent(chkCansaco)
                                    .addComponent(chkGarganta))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCabeca)
                    .addComponent(chkFebre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOlho)
                    .addComponent(chkDiarreia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTontura)
                    .addComponent(chkCansaco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkVomito)
                    .addComponent(chkInchaco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCalafrio)
                    .addComponent(chkGarganta))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkCabecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCabecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCabecaActionPerformed

    private void txtDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            enviarConsulta();
        } catch (IOException ex) {
            Logger.getLogger(SolicitacaoDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkTonturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTonturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTonturaActionPerformed

    private void chkInchacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInchacoActionPerformed

    }//GEN-LAST:event_chkInchacoActionPerformed

    void adicionarArray(JCheckBox chk, String msg, ArrayList<String> array) {
        if (chk.isSelected()) {
            array.add(msg);
        }
    }

    private void enviarConsulta() throws IOException {
        
        InetAddress localHost = InetAddress.getLocalHost();
        String nomeDoComputador = localHost.getHostName();
        Socket socket = null;
        InetAddress enderecoServidor = null;
        ArrayList<String> dadosRecebidos;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;

        try {
            enderecoServidor = InetAddress.getByName(nomeDoComputador);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            socket = new Socket(enderecoServidor, 2000);
            System.out.println("Socket criado com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        ArrayList<String> sintomas = new ArrayList();

        adicionarArray(chkCabeca, "dor de cabeça", sintomas);
        adicionarArray(chkCalafrio, "calafrio", sintomas);
        adicionarArray(chkCansaco, "cansaço", sintomas);
        adicionarArray(chkDiarreia, "diarreia", sintomas);
        adicionarArray(chkFebre, "febre", sintomas);
        adicionarArray(chkGarganta, "dor de garganta", sintomas);
        adicionarArray(chkInchaco, "inchaço", sintomas);
        adicionarArray(chkOlho, "dor nos olhos", sintomas);
        adicionarArray(chkTontura, "tontura", sintomas);
        adicionarArray(chkVomito, "vômito", sintomas);

        System.out.println("Sintomas enviados para o servidor: " + sintomas);

        Consulta solicitacao = new Consulta(sintomas);

        objectOutputStream.writeObject(solicitacao);

        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            dadosRecebidos = (ArrayList<String>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        for (String str : dadosRecebidos) {
            System.out.println("Os dados recebidos do servidor foram: " + str);
            txtDiagnostico.setText(str);
        }

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkCabeca;
    private javax.swing.JCheckBox chkCalafrio;
    private javax.swing.JCheckBox chkCansaco;
    private javax.swing.JCheckBox chkDiarreia;
    private javax.swing.JCheckBox chkFebre;
    private javax.swing.JCheckBox chkGarganta;
    private javax.swing.JCheckBox chkInchaco;
    private javax.swing.JCheckBox chkOlho;
    private javax.swing.JCheckBox chkTontura;
    private javax.swing.JCheckBox chkVomito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDiagnostico;
    // End of variables declaration//GEN-END:variables
}
