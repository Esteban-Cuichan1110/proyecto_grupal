/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tienda;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    Claslogin p1 = new Claslogin();
    /**
     * Creates new form NewJFrame
     */
    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btn_ingreso);
        btn_ingreso.setFocusPainted(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_usu = new javax.swing.JTextField();
        txt_pasw = new javax.swing.JPasswordField();
        btn_ingreso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usu.setBorder(null);
        txt_usu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuActionPerformed(evt);
            }
        });
        jPanel1.add(txt_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 290, 20));

        txt_pasw.setBorder(null);
        txt_pasw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paswActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 290, 30));

        btn_ingreso.setBackground(new java.awt.Color(0, 0, 0));
        btn_ingreso.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btn_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingreso.setText("Iniciar Sesión");
        btn_ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_ingreso.setBorderPainted(false);
        btn_ingreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresoMouseClicked(evt);
            }
        });
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/com/Sin título.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_paswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paswActionPerformed
        btn_ingreso.doClick();
    }//GEN-LAST:event_txt_paswActionPerformed

    private void txt_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuActionPerformed
       btn_ingreso.doClick();
    }//GEN-LAST:event_txt_usuActionPerformed

    private void btn_ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresoMouseClicked

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed
        String usuario = txt_usu.getText();
        String contrasenia = txt_pasw.getText();
        if(usuario.isEmpty()||contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(this,"Datos vacios"); 
        }else{
        boolean esValido =  p1.autenticar(usuario, contrasenia);
        if (esValido){
            Menuopciones menu = new Menuopciones();
            menu.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }   
    }//GEN-LAST:event_btn_ingresoActionPerformed
    }
 
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_pasw;
    private javax.swing.JTextField txt_usu;
    // End of variables declaration//GEN-END:variables
}
