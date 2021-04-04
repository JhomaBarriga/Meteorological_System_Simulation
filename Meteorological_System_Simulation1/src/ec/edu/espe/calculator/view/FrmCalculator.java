/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

/**
 *
 * @author Emilia
 */
public class FrmCalculator extends javax.swing.JFrame {

    /**
     * Creates new form FrmCalculator
     */
    public FrmCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnConversionCordenate = new javax.swing.JButton();
        btneuclidean = new javax.swing.JButton();
        btnhaversine = new javax.swing.JButton();
        btnvicenty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("GEOESPATIAL CALCULATOR");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("MEMBERS:\nBACUY DIANA\nBARRIGA JHOMARA\nCALDERÓN DAYANA \nCALVACHE EMILIA");
        jScrollPane1.setViewportView(jTextArea1);

        btnConversionCordenate.setText("Conversion Cordenate");
        btnConversionCordenate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionCordenateActionPerformed(evt);
            }
        });

        btneuclidean.setText("Euclidean ");
        btneuclidean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneuclideanActionPerformed(evt);
            }
        });

        btnhaversine.setText("Haversine");
        btnhaversine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhaversineActionPerformed(evt);
            }
        });

        btnvicenty.setText("Vicenty");
        btnvicenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvicentyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneuclidean)
                    .addComponent(btnConversionCordenate)
                    .addComponent(btnhaversine)
                    .addComponent(btnvicenty)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnConversionCordenate)
                .addGap(18, 18, 18)
                .addComponent(btneuclidean)
                .addGap(18, 18, 18)
                .addComponent(btnhaversine)
                .addGap(18, 18, 18)
                .addComponent(btnvicenty)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvicentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvicentyActionPerformed

    }//GEN-LAST:event_btnvicentyActionPerformed

    private void btnhaversineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhaversineActionPerformed
        FrmHaversine dHaversine = new FrmHaversine(this, true);
        dHaversine.setVisible(true);
    }//GEN-LAST:event_btnhaversineActionPerformed

    private void btnConversionCordenateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionCordenateActionPerformed
        FrmCalculateangle dConversionCordenate = new FrmCalculateangle(this, true);
        dConversionCordenate.setVisible(true);
    }//GEN-LAST:event_btnConversionCordenateActionPerformed

    private void btneuclideanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneuclideanActionPerformed
        FrmEuclidean dEuclidean = new FrmEuclidean(this, true);
        dEuclidean.setVisible(true);
    }//GEN-LAST:event_btneuclideanActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversionCordenate;
    private javax.swing.JButton btneuclidean;
    private javax.swing.JButton btnhaversine;
    private javax.swing.JButton btnvicenty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
