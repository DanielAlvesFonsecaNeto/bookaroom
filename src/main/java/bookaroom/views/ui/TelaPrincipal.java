package bookaroom.views.ui;

import bookaroom.controllers.Controller;
import bookaroom.util.dbumanager.IDBUManager;
import bookaroom.views.Sessao;

import bookaroom.views.ui.subtelas.SubTelaEquipamento;
import bookaroom.views.ui.subtelas.SubTelaEscolherCampus;
import bookaroom.views.ui.subtelas.SubTelaReservaSala;
import bookaroom.views.ui.subtelas.SubTelaSala;
import bookaroom.views.ui.subtelas.SubTelaVerReserva;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TelaPrincipal extends javax.swing.JFrame {

    
    
    public static List<JFrame> framesAbertos;
    
    public TelaPrincipal() {
       
        initComponents();
        
        //SubTelaReservaSala subTelaReservaSala = new SubTelaReservaSala();
        //showSubTela(subTelaReservaSala);
        
        Sessao sessao  = Sessao.getInstance();
        Controller controller = Controller.getInstance();
        
        SubTelaSala subTelaSala = new SubTelaSala();
        showSubTela(subTelaSala);
        
        
        framesAbertos = new ArrayList<>();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Sessao.finalizarBD();
                System.out.println("Encerrando o BD");
            }
        });
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        telaMenuExterna = new javax.swing.JPanel();
        telaMenuInternaCima = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        telaMenuInternaBaixo = new javax.swing.JPanel();
        botaoVerReserva = new javax.swing.JButton();
        botaoEquipamento = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoReservarSala = new javax.swing.JButton();
        botaoVerSalas = new javax.swing.JButton();
        botaoDefinirCampus = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        jButton3.setBackground(new java.awt.Color(188, 226, 99));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(62, 84, 10));
        jButton3.setText("Reservar Sala");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookARoom");
        setBackground(new java.awt.Color(145, 196, 25));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        telaMenuExterna.setBackground(new java.awt.Color(133, 181, 23));

        telaMenuInternaCima.setBackground(new java.awt.Color(168, 209, 75));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem Vindo(a)");

        nomeUsuario.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setText("Usuario :D");

        javax.swing.GroupLayout telaMenuInternaCimaLayout = new javax.swing.GroupLayout(telaMenuInternaCima);
        telaMenuInternaCima.setLayout(telaMenuInternaCimaLayout);
        telaMenuInternaCimaLayout.setHorizontalGroup(
            telaMenuInternaCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMenuInternaCimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaMenuInternaCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(telaMenuInternaCimaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        telaMenuInternaCimaLayout.setVerticalGroup(
            telaMenuInternaCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaMenuInternaCimaLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        telaMenuInternaBaixo.setBackground(new java.awt.Color(145, 196, 25));

        botaoVerReserva.setBackground(new java.awt.Color(188, 226, 99));
        botaoVerReserva.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoVerReserva.setForeground(new java.awt.Color(62, 84, 10));
        botaoVerReserva.setText("Ver Reservas");
        botaoVerReserva.setBorder(null);
        botaoVerReserva.setBorderPainted(false);
        botaoVerReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerReservaActionPerformed(evt);
            }
        });

        botaoEquipamento.setBackground(new java.awt.Color(188, 226, 99));
        botaoEquipamento.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoEquipamento.setForeground(new java.awt.Color(62, 84, 10));
        botaoEquipamento.setText("Equipamentos");
        botaoEquipamento.setBorder(null);
        botaoEquipamento.setBorderPainted(false);
        botaoEquipamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEquipamentoActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(232, 76, 76));
        botaoSair.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("Sair");
        botaoSair.setBorder(null);
        botaoSair.setBorderPainted(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoReservarSala.setBackground(new java.awt.Color(188, 226, 99));
        botaoReservarSala.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoReservarSala.setForeground(new java.awt.Color(62, 84, 10));
        botaoReservarSala.setText("Reservar Sala");
        botaoReservarSala.setBorder(null);
        botaoReservarSala.setBorderPainted(false);
        botaoReservarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoReservarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReservarSalaActionPerformed(evt);
            }
        });

        botaoVerSalas.setBackground(new java.awt.Color(188, 226, 99));
        botaoVerSalas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoVerSalas.setForeground(new java.awt.Color(62, 84, 10));
        botaoVerSalas.setText("Salas Reservadas");
        botaoVerSalas.setBorder(null);
        botaoVerSalas.setBorderPainted(false);
        botaoVerSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVerSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerSalasActionPerformed(evt);
            }
        });

        botaoDefinirCampus.setBackground(new java.awt.Color(77, 96, 34));
        botaoDefinirCampus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoDefinirCampus.setForeground(new java.awt.Color(255, 255, 255));
        botaoDefinirCampus.setText("Campus Não Definido!");
        botaoDefinirCampus.setBorder(null);
        botaoDefinirCampus.setBorderPainted(false);
        botaoDefinirCampus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDefinirCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDefinirCampusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaMenuInternaBaixoLayout = new javax.swing.GroupLayout(telaMenuInternaBaixo);
        telaMenuInternaBaixo.setLayout(telaMenuInternaBaixoLayout);
        telaMenuInternaBaixoLayout.setHorizontalGroup(
            telaMenuInternaBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVerReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoReservarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoVerSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoEquipamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoDefinirCampus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaMenuInternaBaixoLayout.setVerticalGroup(
            telaMenuInternaBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMenuInternaBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoDefinirCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botaoReservarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botaoVerSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout telaMenuExternaLayout = new javax.swing.GroupLayout(telaMenuExterna);
        telaMenuExterna.setLayout(telaMenuExternaLayout);
        telaMenuExternaLayout.setHorizontalGroup(
            telaMenuExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaMenuInternaCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(telaMenuInternaBaixo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaMenuExternaLayout.setVerticalGroup(
            telaMenuExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMenuExternaLayout.createSequentialGroup()
                .addComponent(telaMenuInternaCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaMenuInternaBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setPreferredSize(new java.awt.Dimension(592, 100));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaMenuExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(telaMenuExterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void showSubTela(JPanel jp){
        jp.setSize(560,530);
        jp.setLocation(0,0);
        
        content.removeAll();
        content.add(jp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    
    }
    
    
    
    
    private void botaoVerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerReservaActionPerformed
        SubTelaVerReserva subTelaVerReserva = new SubTelaVerReserva();
        showSubTela(subTelaVerReserva);
    }//GEN-LAST:event_botaoVerReservaActionPerformed

    private void botaoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEquipamentoActionPerformed
        SubTelaEquipamento subTelaequipamento = new SubTelaEquipamento();
        showSubTela(subTelaequipamento);
    }//GEN-LAST:event_botaoEquipamentoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            
            for(JFrame jf : framesAbertos){   // fechar todos os frames abertos
                jf.dispose();
            }
            framesAbertos.clear();
            
            
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
            
            dispose();
            //setVisible(false);
    
            // user da sessão => null
            // campus da sessão => null
            // funcionario da sessão => null
            
            
}
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoReservarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReservarSalaActionPerformed
        SubTelaReservaSala subTelaReservaSala = new SubTelaReservaSala();
        showSubTela(subTelaReservaSala);
    }//GEN-LAST:event_botaoReservarSalaActionPerformed

    private void botaoVerSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerSalasActionPerformed
        SubTelaSala subTelaSala = new SubTelaSala();
        showSubTela(subTelaSala);
    }//GEN-LAST:event_botaoVerSalasActionPerformed

    private void botaoDefinirCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDefinirCampusActionPerformed
        SubTelaEscolherCampus subTelaEscolherCampus = new SubTelaEscolherCampus();
        showSubTela(subTelaEscolherCampus);
    }//GEN-LAST:event_botaoDefinirCampusActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDefinirCampus;
    private javax.swing.JButton botaoEquipamento;
    private javax.swing.JButton botaoReservarSala;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVerReserva;
    private javax.swing.JButton botaoVerSalas;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel telaMenuExterna;
    private javax.swing.JPanel telaMenuInternaBaixo;
    private javax.swing.JPanel telaMenuInternaCima;
    // End of variables declaration//GEN-END:variables
}
