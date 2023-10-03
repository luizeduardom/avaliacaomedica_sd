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
        btnEnviar = new javax.swing.JButton();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();

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

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome do médico:");

        txtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkVomito)
                                    .addComponent(chkTontura)
                                    .addComponent(chkCabeca)
                                    .addComponent(chkOlho)
                                    .addComponent(chkCalafrio))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFebre)
                                    .addComponent(chkDiarreia)
                                    .addComponent(chkCansaco)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkGarganta)
                                        .addComponent(chkInchaco))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkCabeca)
                        .addGap(18, 18, 18)
                        .addComponent(chkOlho)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkFebre)
                        .addGap(18, 18, 18)
                        .addComponent(chkDiarreia)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkTontura)
                        .addGap(18, 18, 18)
                        .addComponent(chkVomito)
                        .addGap(18, 18, 18)
                        .addComponent(chkCalafrio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkCansaco)
                        .addGap(18, 18, 18)
                        .addComponent(chkInchaco)
                        .addGap(18, 18, 18)
                        .addComponent(chkGarganta)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnEnviar)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            enviarConsulta();
        } catch (IOException ex) {
            Logger.getLogger(SolicitacaoDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void chkTonturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTonturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTonturaActionPerformed

    private void chkInchacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInchacoActionPerformed

    }//GEN-LAST:event_chkInchacoActionPerformed

    private void txtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoActionPerformed

    void adicionarArray(JCheckBox chk, String msg, ArrayList<String> array) {
        if (chk.isSelected()) {
            array.add(msg);
        }
    }

    private void enviarConsulta() throws IOException {
        
        InetAddress endereco = InetAddress.getLocalHost();
        String nomeDoComputador = endereco.getHostName();
        Socket socket = null;
        //InetAddress enderecoServidor = null;
        ArrayList<String> dadosRecebidos;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;

        try {
            endereco = InetAddress.getByName(nomeDoComputador);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            socket = new Socket(endereco, 2000);
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

        String nomeMedico = txtMedico.getText();
        sintomas.add(nomeMedico);
        
        System.out.println("Sintomas enviados para o servidor: " + sintomas);

        Consulta consulta = new Consulta(sintomas); //CRIA CONSULTA PASSANDO OS SINTOMAS PARA GUARDAR NO ARRAYLIST

        objectOutputStream.writeObject(consulta);

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
    private javax.swing.JButton btnEnviar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtMedico;
    // End of variables declaration//GEN-END:variables
}
