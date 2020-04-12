/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BO.CONTRIBO;
import ENTITY.CONTRIENTITY;
import javax.swing.JOptionPane;

 



public class CONTRI extends javax.swing.JFrame {

    private CONTRIBO cbo = new CONTRIBO();
    CONTRIENTITY contri = new CONTRIENTITY();
    public CONTRI() {
        initComponents();
        
    }
    
    
    public void limpiar(){

        jTextField6.setText(" ");
        jTextField8.setText(" ");
        jTextField2.setText(" ");
        jTextField5.setText(" ");
        jTextField7.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField9.setText(" ");
    }
    public void guardar(){
        if(jTextField6.getText().isEmpty()||jTextField8.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField5.getText().isEmpty()
            ||jTextField7.getText().isEmpty()||jTextField3.getText().isEmpty()||jTextField4.getText().isEmpty()||jTextField9.getText().isEmpty())
        {JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS");
       
        }else{
        
        contri.setID_DPI(jTextField6.getText());
        contri.setNit(jTextField8.getText());
        contri.setNombre1(jTextField2.getText());
        contri.setNonmbre2(jTextField5.getText());
        contri.setApellido1(jTextField7.getText());
        contri.setApellido2(jTextField3.getText());
        contri.setFechaIngreso(jTextField4.getText());
        contri.setRiesgoCliente(jTextField9.getText());
        String mensaje = cbo.agregarCONTRI(contri);
        JOptionPane.showMessageDialog(null,mensaje);
        }   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jTextField2 = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        jTextField5 = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        jTextField7 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        jTextField6 = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        label13 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        jButton2.setText("VACIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 220, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/flecha-hacia-atras (2).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 130, -1));

        jButton3.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, 51));

        jLabel2.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRIBUYENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label2.setText("S. NOMBRE");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 270, 30));

        label3.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label3.setText("FECHA DE REGISTRO");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 200, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 270, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 240, 30));

        label4.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label4.setText("S. APELLIDO");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 30));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 270, 30));

        label5.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label5.setText("P. APELLIDO");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 270, 30));

        label6.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label6.setText("P. NOMBRE");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        label7.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label7.setText("DPI");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 240, 30));

        label8.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label8.setText("NIT");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 120, 30));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 930, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 270, 30));

        label13.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 18)); // NOI18N
        label13.setText("RIESGO CLIENTE");
        jPanel2.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 480, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/465282.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        guardar();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ESTADOS  I=new ESTADOS();
        I.show();
        dispose();       
    }//GEN-LAST:event_jLabel4MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CONTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTRI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label13;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    // End of variables declaration//GEN-END:variables
}
