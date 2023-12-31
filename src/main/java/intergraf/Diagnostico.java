package intergraf;

import servidor.Consulta;
import servidor.ReqServer;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Diagnostico extends javax.swing.JFrame {

    public Diagnostico() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diagnostico = new javax.swing.JTextField();
        btnDiagAutomatico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sintomas");

        chkCabeca.setText("Dor de Cabeça");

        chkVomito.setText("Vômito");

        chkFebre.setText("Febre");

        chkGarganta.setText("Dor de Garganta");

        chkOlho.setText("Dor nos Olhos");

        chkCalafrio.setText("Calafrios");

        chkDiarreia.setText("Diarréia");

        chkInchaco.setText("Inchaço");

        chkTontura.setText("Tontura");

        chkCansaco.setText("Cansaço");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnostico");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diagnóstico:");

        btnDiagAutomatico.setText("Diagnóstico Automático");
        btnDiagAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagAutomaticoActionPerformed(evt);
            }
        });

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkVomito)
                                    .addComponent(chkTontura)
                                    .addComponent(chkCabeca)
                                    .addComponent(chkOlho)
                                    .addComponent(chkCalafrio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFebre)
                                    .addComponent(chkDiarreia)
                                    .addComponent(chkGarganta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkInchaco)
                                        .addComponent(chkCansaco))))
                            .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diagnostico))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDiagAutomatico)
                                .addGap(74, 74, 74)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkCabeca)
                        .addGap(18, 18, 18)
                        .addComponent(chkOlho)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDiagAutomatico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        try {
            enviarConsulta(1);
        } catch (IOException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnDiagAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagAutomaticoActionPerformed

        try {
            enviarConsulta(2);
        } catch (IOException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDiagAutomaticoActionPerformed

    void adicionarArray(JCheckBox chk, String msg, ArrayList<String> array) {
        if (chk.isSelected()) {
            array.add(msg);
        }
    }

    private void enviarConsulta(int tipo) throws IOException {

        InetAddress endereco = InetAddress.getLocalHost();
        String nomeDoComputador = endereco.getHostName();
        Socket socket = null;
        ObjectOutputStream objectOutputStream;

        try {
            endereco = InetAddress.getByName(nomeDoComputador);
            socket = new Socket(endereco, 2000);
            System.out.println("Socket criado com sucesso!");
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        ArrayList<String> sintomas = new ArrayList();

        adicionarArray(chkCabeca, "Dor de cabeça", sintomas);
        adicionarArray(chkCalafrio, "Calafrio", sintomas);
        adicionarArray(chkCansaco, "Cansaço", sintomas);
        adicionarArray(chkDiarreia, "Diarreia", sintomas);
        adicionarArray(chkFebre, "Febre", sintomas);
        adicionarArray(chkGarganta, "Dor de garganta", sintomas);
        adicionarArray(chkInchaco, "Inchaço", sintomas);
        adicionarArray(chkOlho, "Dor nos olhos", sintomas);
        adicionarArray(chkTontura, "Tontura", sintomas);
        adicionarArray(chkVomito, "Vômito", sintomas);

        if (tipo == 1) {

            String diag = diagnostico.getText();

            if (!diag.isEmpty()) {

                sintomas.add(diag); //adiciona o diagnostico no vetor de sintomas
                Consulta consulta = new Consulta(sintomas);
                ReqServer sendServer = new ReqServer(tipo, consulta);
                objectOutputStream.writeObject(sendServer);

                for (String str : sintomas) {
                    txtDiagnostico.append(str + ", ");
                }
                txtDiagnostico.append("\n");

            } else {
                JOptionPane.showMessageDialog(null, "Diagnóstico vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Consulta consulta = new Consulta(sintomas);
            ReqServer sendServer = new ReqServer(tipo, consulta);
            objectOutputStream.writeObject(sendServer);
        }
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagAutomatico;
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
    private javax.swing.JTextField diagnostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDiagnostico;
    // End of variables declaration//GEN-END:variables
}
