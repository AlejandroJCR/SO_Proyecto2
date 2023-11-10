package proyectoso2;

public class Proyecto2GUI extends javax.swing.JFrame {
    static BattleArena arena;
    static Administrator admin;
    static IA cpu;
    
    public Proyecto2GUI() {      
        initComponents();
        this.setLocationRelativeTo(null);
        this.init();
    }
    
    private void init(){
        arena = new BattleArena();
        admin = new Administrator(arena);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        arenaPanel = new javax.swing.JPanel();
        vsText = new javax.swing.JLabel();
        nintendoArena = new javax.swing.JPanel();
        capcomArena = new javax.swing.JPanel();
        nintendoGamesWon = new javax.swing.JLabel();
        capcomGamesWon = new javax.swing.JLabel();
        capcomText = new javax.swing.JLabel();
        arenaText = new javax.swing.JLabel();
        colasNintendo = new javax.swing.JPanel();
        colas1Text = new javax.swing.JLabel();
        drive3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        IAPanel = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        plusVelocity = new javax.swing.JButton();
        velocity = new javax.swing.JLabel();
        velocityText = new javax.swing.JLabel();
        minusText = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");

        arenaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        vsText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vsText.setText("VS");

        nintendoArena.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout nintendoArenaLayout = new javax.swing.GroupLayout(nintendoArena);
        nintendoArena.setLayout(nintendoArenaLayout);
        nintendoArenaLayout.setHorizontalGroup(
            nintendoArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        nintendoArenaLayout.setVerticalGroup(
            nintendoArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        capcomArena.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capcomArenaLayout = new javax.swing.GroupLayout(capcomArena);
        capcomArena.setLayout(capcomArenaLayout);
        capcomArenaLayout.setHorizontalGroup(
            capcomArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        capcomArenaLayout.setVerticalGroup(
            capcomArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        nintendoGamesWon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nintendoGamesWon.setText("Juegos Ganados por Zelda:");

        capcomGamesWon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        capcomGamesWon.setText("Juegos Ganados por Steet Fighter:");

        javax.swing.GroupLayout arenaPanelLayout = new javax.swing.GroupLayout(arenaPanel);
        arenaPanel.setLayout(arenaPanelLayout);
        arenaPanelLayout.setHorizontalGroup(
            arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arenaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(capcomArena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(vsText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(nintendoArena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(arenaPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(capcomGamesWon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nintendoGamesWon)
                .addGap(35, 35, 35))
        );
        arenaPanelLayout.setVerticalGroup(
            arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arenaPanelLayout.createSequentialGroup()
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nintendoArena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capcomArena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(vsText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capcomGamesWon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nintendoGamesWon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        capcomText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        capcomText.setText("Capcom");

        arenaText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        arenaText.setText("Arena");

        colasNintendo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        colas1Text.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        colas1Text.setText("Colas");

        javax.swing.GroupLayout colasNintendoLayout = new javax.swing.GroupLayout(colasNintendo);
        colasNintendo.setLayout(colasNintendoLayout);
        colasNintendoLayout.setHorizontalGroup(
            colasNintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colasNintendoLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(colas1Text)
                .addGap(124, 124, 124))
        );
        colasNintendoLayout.setVerticalGroup(
            colasNintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colasNintendoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colas1Text)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        drive3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Colas");

        javax.swing.GroupLayout drive3Layout = new javax.swing.GroupLayout(drive3);
        drive3.setLayout(drive3Layout);
        drive3Layout.setHorizontalGroup(
            drive3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drive3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(127, 127, 127))
        );
        drive3Layout.setVerticalGroup(
            drive3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drive3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel50.setText("Nintendo");

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel51.setText("Inteligencia Artificial");

        IAPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        statusText.setText("Estatus: ");

        plusVelocity.setText("+");
        plusVelocity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusVelocityActionPerformed(evt);
            }
        });

        velocity.setText("1");

        velocityText.setText("Velocidad Actual");

        minusText.setText("-");
        minusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IAPanelLayout = new javax.swing.GroupLayout(IAPanel);
        IAPanel.setLayout(IAPanelLayout);
        IAPanelLayout.setHorizontalGroup(
            IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IAPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(statusText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(velocityText)
                .addGap(56, 56, 56)
                .addComponent(velocity)
                .addGap(24, 24, 24)
                .addComponent(minusText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plusVelocity)
                .addGap(19, 19, 19))
        );
        IAPanelLayout.setVerticalGroup(
            IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IAPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusText)
                    .addComponent(plusVelocity)
                    .addComponent(velocity)
                    .addComponent(statusText)
                    .addComponent(velocityText))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        start.setText("Comenzar Simulación");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arenaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(drive3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(capcomText)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(colasNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(jLabel50)))
                            .addGap(244, 244, 244))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(309, 309, 309)
                            .addComponent(arenaText))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(jLabel51)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(start)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capcomText)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(colasNintendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drive3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(arenaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arenaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minusTextActionPerformed

    private void plusVelocityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusVelocityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusVelocityActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IAPanel;
    private javax.swing.JPanel arenaPanel;
    private javax.swing.JLabel arenaText;
    private javax.swing.JPanel capcomArena;
    private javax.swing.JLabel capcomGamesWon;
    private javax.swing.JLabel capcomText;
    private javax.swing.JLabel colas1Text;
    private javax.swing.JPanel colasNintendo;
    private javax.swing.JPanel drive3;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton minusText;
    private javax.swing.JPanel nintendoArena;
    private javax.swing.JLabel nintendoGamesWon;
    private javax.swing.JButton plusVelocity;
    private javax.swing.JButton start;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel velocity;
    private javax.swing.JLabel velocityText;
    private javax.swing.JLabel vsText;
    // End of variables declaration//GEN-END:variables
}