package bookaroom.views.ui.subtelas;


public class SubTelaSala extends javax.swing.JPanel {

    public SubTelaSala() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        msgErroCampus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaDeTodasAsSalasDoCampus = new javax.swing.JList<>();
        opcaoHoje = new javax.swing.JRadioButton();
        opcaoEssaSemana = new javax.swing.JRadioButton();
        opcaoEsseMes = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaReservasDaquelaSala = new javax.swing.JList<>();
        botaoBuscar = new javax.swing.JButton();
        opcaoTodasAsReservasAgendadas = new javax.swing.JRadioButton();
        botaoAbrirTelaCancelarReserva = new javax.swing.JButton();
        msgErroSelecionarSala = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(560, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Salas / Reservas");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgErroCampus.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msgErroCampus.setForeground(new java.awt.Color(255, 0, 0));
        msgErroCampus.setText("Escolha um campus para a reserva !!!");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("salas"));

        jListaDeTodasAsSalasDoCampus.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListaDeTodasAsSalasDoCampus);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        buttonGroup.add(opcaoHoje);
        opcaoHoje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        opcaoHoje.setText("Hoje");
        opcaoHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoHojeActionPerformed(evt);
            }
        });

        buttonGroup.add(opcaoEssaSemana);
        opcaoEssaSemana.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        opcaoEssaSemana.setText("Essa Semana");
        opcaoEssaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoEssaSemanaActionPerformed(evt);
            }
        });

        buttonGroup.add(opcaoEsseMes);
        opcaoEsseMes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        opcaoEsseMes.setText("Esse Mês");
        opcaoEsseMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoEsseMesActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("reservas da sala"));

        jListaReservasDaquelaSala.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListaReservasDaquelaSala);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoBuscar.setText("Buscar");

        buttonGroup.add(opcaoTodasAsReservasAgendadas);
        opcaoTodasAsReservasAgendadas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        opcaoTodasAsReservasAgendadas.setText("Todas as reservas agendadas");
        opcaoTodasAsReservasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoTodasAsReservasAgendadasActionPerformed(evt);
            }
        });

        botaoAbrirTelaCancelarReserva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoAbrirTelaCancelarReserva.setText("Abrir");
        botaoAbrirTelaCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirTelaCancelarReservaActionPerformed(evt);
            }
        });

        msgErroSelecionarSala.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msgErroSelecionarSala.setForeground(new java.awt.Color(255, 0, 0));
        msgErroSelecionarSala.setText("Selecione uma Sala !!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgErroCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoAbrirTelaCancelarReserva)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(msgErroSelecionarSala)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoBuscar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(opcaoHoje)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(opcaoEssaSemana)
                                    .addGap(18, 18, 18)
                                    .addComponent(opcaoEsseMes)
                                    .addGap(18, 18, 18)
                                    .addComponent(opcaoTodasAsReservasAgendadas))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 212, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(msgErroCampus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoHoje)
                    .addComponent(opcaoEssaSemana)
                    .addComponent(opcaoEsseMes)
                    .addComponent(opcaoTodasAsReservasAgendadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoBuscar)
                    .addComponent(msgErroSelecionarSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbrirTelaCancelarReserva)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoHojeActionPerformed
        
    }//GEN-LAST:event_opcaoHojeActionPerformed

    private void opcaoEssaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoEssaSemanaActionPerformed
        
    }//GEN-LAST:event_opcaoEssaSemanaActionPerformed

    private void opcaoEsseMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoEsseMesActionPerformed
        
    }//GEN-LAST:event_opcaoEsseMesActionPerformed

    private void opcaoTodasAsReservasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoTodasAsReservasAgendadasActionPerformed
        
    }//GEN-LAST:event_opcaoTodasAsReservasAgendadasActionPerformed

    /** Implementar direito aqui , precisa ser mostrada a janela apenas se selecionado um item da lista */
    private void botaoAbrirTelaCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirTelaCancelarReservaActionPerformed
        TelaSoltaCancelarReserva telaSoltaCancelarReserva = TelaSoltaCancelarReserva.getInstancia() ; // no contrutor devera passar o equipamento a ser mostrado !!
        telaSoltaCancelarReserva.setVisible(false);
        telaSoltaCancelarReserva.setObejto("Ola Mundo01");
        telaSoltaCancelarReserva.setVisible(true);
    }//GEN-LAST:event_botaoAbrirTelaCancelarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirTelaCancelarReserva;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListaDeTodasAsSalasDoCampus;
    private javax.swing.JList<String> jListaReservasDaquelaSala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msgErroCampus;
    private javax.swing.JLabel msgErroSelecionarSala;
    private javax.swing.JRadioButton opcaoEssaSemana;
    private javax.swing.JRadioButton opcaoEsseMes;
    private javax.swing.JRadioButton opcaoHoje;
    private javax.swing.JRadioButton opcaoTodasAsReservasAgendadas;
    // End of variables declaration//GEN-END:variables
}
