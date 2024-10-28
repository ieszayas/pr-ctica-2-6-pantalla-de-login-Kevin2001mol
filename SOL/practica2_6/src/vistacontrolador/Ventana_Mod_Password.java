package vistacontrolador;

import static BBDD.BBDD.actualizarContraseña;
import javax.swing.JOptionPane;
import modelo.Usuario;
import static modelo.Usuario.comprobarIndiceUser;
import static modelo.Usuario.hardcodeados;
import static vistacontrolador.Ventana1.passwordToString;

public class Ventana_Mod_Password extends javax.swing.JFrame {

    public static Usuario user;

    public Ventana_Mod_Password(Usuario usuario) {
        user = usuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto_NewPasswd = new javax.swing.JLabel();
        newPasswd_Field = new javax.swing.JPasswordField();
        botonModPasswd = new javax.swing.JButton();
        volverAV2_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto_NewPasswd.setText("Nueva contraseña:");

        newPasswd_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswd_FieldActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(texto_NewPasswd)
                .addGap(33, 33, 33)
                .addComponent(newPasswd_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(botonModPasswd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(volverAV2_buton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswd_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_NewPasswd))
                .addGap(18, 18, 18)
                .addComponent(botonModPasswd)
                .addGap(18, 18, 18)
                .addComponent(volverAV2_buton)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
        if (newPasswd==null ||newPasswd.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña no puede estar vacia.");
            return;//porque este return se lo fuma?
        }
        if (newPasswd.equalsIgnoreCase(user.getPassword())) {
            JOptionPane.showMessageDialog(this, "La contraseña no puede ser igual a la que ya tenias.");
            return;
        }
        if (actualizarContraseña(user, newPasswd)) {
            hardcodeados.get(comprobarIndiceUser(user.getUsuario())).setPassword(newPasswd);//cambio la contraseña en memoria
            JOptionPane.showMessageDialog(this, "La contraseña ha sido cambiada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña no ha podido ser cambiada correctamente.");
        }


    }//GEN-LAST:event_botonModPasswdActionPerformed

    private void newPasswd_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswd_FieldActionPerformed

    }//GEN-LAST:event_newPasswd_FieldActionPerformed

    private void volverAV2_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAV2_butonActionPerformed
        Ventana2 ventana2= new Ventana2(user.getUsuario());
        ventana2.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_volverAV2_butonActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPasswd_Field;
    private javax.swing.JLabel texto_NewPasswd;
    private javax.swing.JButton volverAV2_buton;
    // End of variables declaration//GEN-END:variables
}
