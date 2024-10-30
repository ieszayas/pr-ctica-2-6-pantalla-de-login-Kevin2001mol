package vistacontrolador;

import static BBDD.BBDD.actualizarContraseña;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;
import static modelo.Usuario.comprobarIndiceUser;
import static modelo.Usuario.hardcodeados;
import static modelo.Usuario.validarContrasena;
import static vistacontrolador.Ventana1.passwordToString;
import static vistacontrolador.Ventana_new_Users.bordeNormal;
import static vistacontrolador.Ventana_new_Users.bordeRojo;

public class Ventana_Mod_Password extends javax.swing.JFrame {

    public static Usuario user;
    //private Icon iconoUpdate = new ImageIcon(getClass().getClassLoader().getResource("imagenes/okPasswd.png"));

    public Ventana_Mod_Password(Usuario usuario) {
        user = usuario;
        initComponents();
        hacerVisibleModContra(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto_NewPasswd = new javax.swing.JLabel();
        newPasswd_Field = new javax.swing.JPasswordField();
        botonModPasswd = new javax.swing.JButton();
        volverAV2_buton = new javax.swing.JButton();
        iconoModPasswd_lbl = new javax.swing.JLabel();
        requisitosContraPass_lbl = new javax.swing.JLabel();
        requisitosContraPass2_lbl = new javax.swing.JLabel();
        mostrarPasswdModPasswd_check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto_NewPasswd.setText("Nueva contraseña:");

        newPasswd_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswd_FieldActionPerformed(evt);
            }
        });
        newPasswd_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newPasswd_FieldKeyReleased(evt);
            }
        });

        botonModPasswd.setText("Modificar Contraseña");
        botonModPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModPasswdActionPerformed(evt);
            }
        });

        volverAV2_buton.setText("Volver");
        volverAV2_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAV2_butonActionPerformed(evt);
            }
        });

        iconoModPasswd_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambiarpsswd.png"))); // NOI18N

        requisitosContraPass_lbl.setText("La contraseña deberá tener al menos:");

        requisitosContraPass2_lbl.setText("Una Mayúscula, un número un carácter especial y mínimo 8 caracteres.");

        mostrarPasswdModPasswd_check.setText("Mostrar");
        mostrarPasswdModPasswd_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPasswdModPasswd_checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(volverAV2_buton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(botonModPasswd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(iconoModPasswd_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(requisitosContraPass2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(requisitosContraPass_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(texto_NewPasswd)
                                .addGap(59, 59, 59)
                                .addComponent(newPasswd_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarPasswdModPasswd_check)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(iconoModPasswd_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswd_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_NewPasswd)
                    .addComponent(mostrarPasswdModPasswd_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(requisitosContraPass_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requisitosContraPass2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModPasswd)
                .addGap(18, 18, 18)
                .addComponent(volverAV2_buton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonModPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModPasswdActionPerformed
        String newPasswd = passwordToString(newPasswd_Field);

        if (newPasswd == null || newPasswd.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña no puede estar vacia.");
            return;//porque este return se lo fuma?
        }
        if (newPasswd.equals(user.getPassword())) {
            JOptionPane.showMessageDialog(this, "La contraseña no puede ser igual a la que ya tenias.");
            return;
        }
        if (!validarContrasena(newPasswd)) {
            JOptionPane.showMessageDialog(this, "La contraseña no cumple con los requisitos esperados!", "Contraseña débil", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (actualizarContraseña(user, newPasswd)) {
            hardcodeados.get(comprobarIndiceUser(user.getUsuario())).setPassword(newPasswd);//cambio la contraseña en memoria
            JOptionPane.showMessageDialog(this, "La contraseña ha sido cambiada correctamente.");
            //iconoModPasswd_lbl.setIcon(iconoUpdate);
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña no ha podido ser cambiada correctamente.");
        }


    }//GEN-LAST:event_botonModPasswdActionPerformed

    private void newPasswd_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswd_FieldActionPerformed

    }//GEN-LAST:event_newPasswd_FieldActionPerformed

    private void volverAV2_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAV2_butonActionPerformed
        Ventana2 ventana2 = new Ventana2(user.getUsuario());
        ventana2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverAV2_butonActionPerformed

    private void newPasswd_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPasswd_FieldKeyReleased
        String passwd = passwordToString(newPasswd_Field);
        if (passwd.equalsIgnoreCase("")) {
            newPasswd_Field.setBorder(bordeNormal);
            hacerVisibleModContra(false);
        } else {
            if (!validarContrasena(passwd)) {
                newPasswd_Field.setBorder(bordeRojo);//avisar de que la contra tiene requisitos
                hacerVisibleModContra(true);
            } else {
                newPasswd_Field.setBorder(bordeNormal);
                hacerVisibleModContra(false);
            }
        }
    }//GEN-LAST:event_newPasswd_FieldKeyReleased

    private void mostrarPasswdModPasswd_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPasswdModPasswd_checkActionPerformed
        if (mostrarPasswdModPasswd_check.isSelected()) {
            newPasswd_Field.setEchoChar((char) 0);
        } else {
            newPasswd_Field.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarPasswdModPasswd_checkActionPerformed
    public void hacerVisibleModContra(boolean esVisible) {
        if (esVisible) {
            requisitosContraPass_lbl.setVisible(true);
            requisitosContraPass2_lbl.setVisible(true);
        } else {
            requisitosContraPass_lbl.setVisible(false);
            requisitosContraPass2_lbl.setVisible(false);
        }

    }

    public static void main(String args[]) {
        Usuario usr = new Usuario();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Mod_Password(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModPasswd;
    private javax.swing.JLabel iconoModPasswd_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mostrarPasswdModPasswd_check;
    private javax.swing.JPasswordField newPasswd_Field;
    private javax.swing.JLabel requisitosContraPass2_lbl;
    private javax.swing.JLabel requisitosContraPass_lbl;
    private javax.swing.JLabel texto_NewPasswd;
    private javax.swing.JButton volverAV2_buton;
    // End of variables declaration//GEN-END:variables
}
