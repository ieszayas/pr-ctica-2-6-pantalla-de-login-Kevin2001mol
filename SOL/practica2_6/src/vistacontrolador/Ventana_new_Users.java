package vistacontrolador;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import static vistacontrolador.Ventana1.passwordToString;

public class Ventana_new_Users extends javax.swing.JFrame {

    public Ventana_new_Users() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        PanelVentanaNewUsers = new javax.swing.JPanel();
        infoEsencial_lbl = new javax.swing.JLabel();
        usuario_lbl_ventanaNewUsers = new javax.swing.JLabel();
        contraseña_lbl_ventanaNewUsers = new javax.swing.JLabel();
        correo_lbl_ventanaNewUsers = new javax.swing.JLabel();
        confirmarContraseña_lbl = new javax.swing.JLabel();
        datosAdicionales_lbl = new javax.swing.JLabel();
        nombre_lbl_ventanaNewUsers = new javax.swing.JLabel();
        apellidos_lbl_ventanaNewUsers = new javax.swing.JLabel();
        fecha_nac_lbl_ventanaNewUsers = new javax.swing.JLabel();
        Volver_button_ventanaNewUsers = new javax.swing.JToggleButton();
        agregar_button_ventanaNewUsers = new javax.swing.JButton();
        texto_user_ventanaNewUsers = new javax.swing.JTextField();
        texto_correo_ventanaNewUsers = new javax.swing.JTextField();
        texto_nombre_ventanaNewUsers = new javax.swing.JTextField();
        texto_apellidos_ventanaNewUsers = new javax.swing.JTextField();
        texto_contraseña_ventanaNewUsers = new javax.swing.JPasswordField();
        texto_confirmarContraseña_ventanaNewUsers = new javax.swing.JPasswordField();

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoEsencial_lbl.setText("Por fafor, introduzca la informacion del nuevo usuario:");

        usuario_lbl_ventanaNewUsers.setText("Usuario");

        contraseña_lbl_ventanaNewUsers.setText("Contraseña");

        correo_lbl_ventanaNewUsers.setText("Correo");

        confirmarContraseña_lbl.setText("Confirmar contraseña");

        datosAdicionales_lbl.setText("Agregar datos opcionales del nuevo usuario:");

        nombre_lbl_ventanaNewUsers.setText("Nombre");

        apellidos_lbl_ventanaNewUsers.setText("Apellidos");

        fecha_nac_lbl_ventanaNewUsers.setText("Fecha de nacimiento");

        Volver_button_ventanaNewUsers.setText("Volver");
        Volver_button_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_button_ventanaNewUsersActionPerformed(evt);
            }
        });

        agregar_button_ventanaNewUsers.setText("Agregar");
        agregar_button_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_button_ventanaNewUsersActionPerformed(evt);
            }
        });

        texto_user_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_user_ventanaNewUsersActionPerformed(evt);
            }
        });

        texto_correo_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_correo_ventanaNewUsersActionPerformed(evt);
            }
        });
        texto_correo_ventanaNewUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_correo_ventanaNewUsersKeyReleased(evt);
            }
        });

        texto_nombre_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nombre_ventanaNewUsersActionPerformed(evt);
            }
        });

        texto_apellidos_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_apellidos_ventanaNewUsersActionPerformed(evt);
            }
        });

        texto_contraseña_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_contraseña_ventanaNewUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVentanaNewUsersLayout = new javax.swing.GroupLayout(PanelVentanaNewUsers);
        PanelVentanaNewUsers.setLayout(PanelVentanaNewUsersLayout);
        PanelVentanaNewUsersLayout.setHorizontalGroup(
            PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(infoEsencial_lbl)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVentanaNewUsersLayout.createSequentialGroup()
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(usuario_lbl_ventanaNewUsers)
                                                .addComponent(contraseña_lbl_ventanaNewUsers)))
                                        .addComponent(confirmarContraseña_lbl))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(texto_user_ventanaNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(texto_contraseña_ventanaNewUsers)
                                        .addComponent(texto_confirmarContraseña_ventanaNewUsers)))))
                        .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(apellidos_lbl_ventanaNewUsers)
                                        .addComponent(Volver_button_ventanaNewUsers))
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(agregar_button_ventanaNewUsers)
                                            .addGap(30, 30, 30))
                                        .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(texto_apellidos_ventanaNewUsers))))
                                .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre_lbl_ventanaNewUsers)
                                        .addComponent(correo_lbl_ventanaNewUsers)
                                        .addComponent(fecha_nac_lbl_ventanaNewUsers))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                    .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(texto_nombre_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(texto_correo_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(datosAdicionales_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PanelVentanaNewUsersLayout.setVerticalGroup(
            PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(infoEsencial_lbl)
                .addGap(23, 23, 23)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_lbl_ventanaNewUsers)
                    .addComponent(texto_user_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña_lbl_ventanaNewUsers)
                    .addComponent(texto_contraseña_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarContraseña_lbl)
                    .addComponent(texto_confirmarContraseña_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(datosAdicionales_lbl)
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_lbl_ventanaNewUsers)
                    .addComponent(texto_correo_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_lbl_ventanaNewUsers)
                    .addComponent(texto_nombre_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos_lbl_ventanaNewUsers)
                    .addComponent(texto_apellidos_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(fecha_nac_lbl_ventanaNewUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_button_ventanaNewUsers)
                    .addComponent(agregar_button_ventanaNewUsers))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelVentanaNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelVentanaNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Volver_button_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_button_ventanaNewUsersActionPerformed
        Ventana1 ventana1 = new Ventana1();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver_button_ventanaNewUsersActionPerformed

    private void agregar_button_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_button_ventanaNewUsersActionPerformed
        String password = passwordToString(texto_contraseña_ventanaNewUsers);
        String password_confirm = passwordToString(texto_confirmarContraseña_ventanaNewUsers);
        if (password.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El campo de contraseña se encuentra vacio!", "Contraseña Vacia", HEIGHT);
            return;
        }
        if (!(password.equalsIgnoreCase(password_confirm))) {
            JOptionPane.showMessageDialog(this, "La contraseña no se corresponde con la confirmacion de la contraseña!", "Confirmacion de contraseña erroena ", HEIGHT);
            resetearValoresContraseña();
            return;
        }
        if (texto_user_ventanaNewUsers.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El campo de usuario se encuentra vacio!", "Usuario Vacio", HEIGHT);
            return;
        }

// aqui añado al arraylist y a la base de datos
    }//GEN-LAST:event_agregar_button_ventanaNewUsersActionPerformed

    public void campoVacio() {
    }

    public void resetearValoresContraseña() {
        texto_contraseña_ventanaNewUsers.setText("");
        texto_confirmarContraseña_ventanaNewUsers.setText("");
    }

    public void comprobarUserExistente() {
    }
    private void texto_user_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_user_ventanaNewUsersActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_texto_user_ventanaNewUsersActionPerformed

    private void texto_correo_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_correo_ventanaNewUsersActionPerformed

    }//GEN-LAST:event_texto_correo_ventanaNewUsersActionPerformed

    private void texto_nombre_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nombre_ventanaNewUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nombre_ventanaNewUsersActionPerformed

    private void texto_apellidos_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_apellidos_ventanaNewUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_apellidos_ventanaNewUsersActionPerformed

    private void texto_correo_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_correo_ventanaNewUsersKeyReleased
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!(texto_correo_ventanaNewUsers.getText().matches(regex))) {
            Border bordeRojo = BorderFactory.createLineBorder(Color.RED, 2);
            texto_correo_ventanaNewUsers.setBorder(bordeRojo);
        }
        if ((texto_correo_ventanaNewUsers.getText().matches(regex))) {
            Border bordeNegro = BorderFactory.createLineBorder(Color.GREEN, 0);
            texto_correo_ventanaNewUsers.setBorder(bordeNegro);
        }
    }//GEN-LAST:event_texto_correo_ventanaNewUsersKeyReleased

    private void texto_contraseña_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_contraseña_ventanaNewUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_contraseña_ventanaNewUsersActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_new_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_new_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_new_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_new_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_new_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVentanaNewUsers;
    private javax.swing.JToggleButton Volver_button_ventanaNewUsers;
    private javax.swing.JButton agregar_button_ventanaNewUsers;
    private javax.swing.JLabel apellidos_lbl_ventanaNewUsers;
    private javax.swing.JLabel confirmarContraseña_lbl;
    private javax.swing.JLabel contraseña_lbl_ventanaNewUsers;
    private javax.swing.JLabel correo_lbl_ventanaNewUsers;
    private javax.swing.JLabel datosAdicionales_lbl;
    private javax.swing.JLabel fecha_nac_lbl_ventanaNewUsers;
    private javax.swing.JLabel infoEsencial_lbl;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel nombre_lbl_ventanaNewUsers;
    private javax.swing.JTextField texto_apellidos_ventanaNewUsers;
    private javax.swing.JPasswordField texto_confirmarContraseña_ventanaNewUsers;
    private javax.swing.JPasswordField texto_contraseña_ventanaNewUsers;
    private javax.swing.JTextField texto_correo_ventanaNewUsers;
    private javax.swing.JTextField texto_nombre_ventanaNewUsers;
    private javax.swing.JTextField texto_user_ventanaNewUsers;
    private javax.swing.JLabel usuario_lbl_ventanaNewUsers;
    // End of variables declaration//GEN-END:variables
}
