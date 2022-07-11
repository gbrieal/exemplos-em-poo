/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author DELL
 */
public class telaFatorial extends javax.swing.JFrame {

    /**
     * Creates new form telaFatorial
     */
    public telaFatorial() {
        initComponents();
        pnlRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblFat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        pnlRes = new javax.swing.JPanel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        txtNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtNumeroStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("! =");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblFat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFat.setForeground(new java.awt.Color(0, 0, 204));
        lblFat.setText("1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fat.png"))); // NOI18N

        lblRes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRes.setForeground(new java.awt.Color(0, 102, 255));
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("...");

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblRes)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblN)
                        .addGap(124, 124, 124)
                        .addComponent(lblN2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtNumeroStateChanged
        // TODO add your handling code here:
        pnlRes.setVisible(true);
        
        int n = Integer.parseInt(txtNumero.getValue().toString());
        int f = 1;
        int c = n;
        
        while (c >= 1){
            f *= c;
            c--;
            
            switch (n) {
                case 5:
                    n = 5;
                    lblRes.setText("5 * 4 * 3 * 2 * 1");
                    break;
                case 4:
                    n = 4;
                    lblRes.setText("4 * 3 * 2 * 1");
                    break;
                case 3:
                    n = 3;
                    lblRes.setText("3 * 2 * 1");
                    break;
                case 2:
                    n = 2;
                    lblRes.setText("2 * 1");
                    break;
                case 1:
                    n = 1;
                    lblRes.setText("1");
        }
        }
        lblFat.setText(Integer.toString(f));
    }//GEN-LAST:event_txtNumeroStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFat;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JSpinner txtNumero;
    // End of variables declaration//GEN-END:variables
}