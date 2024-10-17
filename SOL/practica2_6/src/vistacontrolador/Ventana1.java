package vistacontrolador;

import javax.swing.JOptionPane;
import modelo.Usuario;
import static modelo.Usuario.hardcodeados;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        textoCredenciales_lbl = new javax.swing.JLabel();
        usuario_lbl = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        usuario_field = new javax.swing.JTextField();
        mostrar_ckbx = new javax.swing.JCheckBox();
        loguear_button = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoCredenciales_lbl.setText("Por favor, introduzca sus credenciales para acceder:");

        usuario_lbl.setText("Usuario");

        password_lbl.setText("Password");

        usuario_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_fieldActionPerformed(evt);
            }
        });

        mostrar_ckbx.setText("Mostrar");
        mostrar_ckbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_ckbxActionPerformed(evt);
            }
        });

        loguear_button.setText("Loguear");
        loguear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loguear_buttonActionPerformed(evt);
            }
        });

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textoCredenciales_lbl))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(loguear_button))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_lbl)
                            .addComponent(usuario_lbl))
                        .addGap(68, 68, 68)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(mostrar_ckbx)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textoCredenciales_lbl)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_lbl)
                    .addComponent(usuario_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_lbl)
                    .addComponent(mostrar_ckbx)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(loguear_button)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_ckbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_ckbxActionPerformed
        if (mostrar_ckbx.isSelected()) {
            password_field.setEchoChar((char) 0);
        } else {
            password_field.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrar_ckbxActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed

    }//GEN-LAST:event_password_fieldActionPerformed

    private void loguear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loguear_buttonActionPerformed
        boolean existe = false;
        String nombre_usr = usuario_field.getText();
        String password = passwordToString();

        existeUsr();


    }//GEN-LAST:event_loguear_buttonActionPerformed
    private void existeUsr() {
        int indice = 0;
        boolean existe = false;
        for (int i = 0; i < hardcodeados.size(); i++) {
            if (hardcodeados.get(i).getNombre().equalsIgnoreCase(usuario_field.getText())) {
                existe = true;
                break;
            }
            indice++;
        }

        if (existe) {
            comprobarPassword(usuario_field.getText(), indice);
        } else {
            JOptionPane.showMessageDialog(null, "¡El usuario que ha introducido no existe!");
            resetearValores();
        }
    }

    public void comprobarPassword(String nombre_usr, int index) {
        if (hardcodeados.get(index).getPassword().equalsIgnoreCase(passwordToString())) {
            //saltar a la ventana 
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            usuario_field.setText("");
            password_field.setText("");
        }

    }

    public String passwordToString() {
        char[] passwordChars = password_field.getPassword(); // Obtener la contraseña
        String password = new String(passwordChars);
        return password;
    }

    public void resetearValores() {
        usuario_field.setText("");
        password_field.setText("");
    }
    private void usuario_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_fieldActionPerformed

    }//GEN-LAST:event_usuario_fieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loguear_button;
    private javax.swing.JCheckBox mostrar_ckbx;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JLabel textoCredenciales_lbl;
    private javax.swing.JTextField usuario_field;
    private javax.swing.JLabel usuario_lbl;
    // End of variables declaration//GEN-END:variables
}
