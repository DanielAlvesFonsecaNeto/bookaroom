package bookaroom.views.ui.subtelas;




public class SubTelaEquipamento extends javax.swing.JPanel {
    
    
    
    private static boolean botaoRemoverEqShow;

    public SubTelaEquipamento() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        msgErroCampus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaTodosEquipamentosDoCampus = new javax.swing.JList<>();
        botaoAbrirTelaAddEquipamentosCampus = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Equipamentos");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgErroCampus.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msgErroCampus.setForeground(new java.awt.Color(255, 0, 0));
        msgErroCampus.setText("Escolha um campus para a reserva !!!");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("equipamentos"));

        jScrollPane1.setViewportView(jListaTodosEquipamentosDoCampus);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoAbrirTelaAddEquipamentosCampus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoAbrirTelaAddEquipamentosCampus.setText("Adicionar Equipamento");
        botaoAbrirTelaAddEquipamentosCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirTelaAddEquipamentosCampusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgErroCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAbrirTelaAddEquipamentosCampus, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(msgErroCampus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbrirTelaAddEquipamentosCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAbrirTelaAddEquipamentosCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirTelaAddEquipamentosCampusActionPerformed
        TelaSoltaAddEquipamento telaSoltaAddEquipamento = TelaSoltaAddEquipamento.getInstancia(); // deverá passar o campus em manipulção ou campos pode estar em um singleton geral
        telaSoltaAddEquipamento.setVisible(true);
    }//GEN-LAST:event_botaoAbrirTelaAddEquipamentosCampusActionPerformed

    public static void setBotaoRemoverEqShow(boolean botaoRemoverEqShow) {
        SubTelaEquipamento.botaoRemoverEqShow = botaoRemoverEqShow;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirTelaAddEquipamentosCampus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListaTodosEquipamentosDoCampus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgErroCampus;
    // End of variables declaration//GEN-END:variables

}
