package vistacontrolador;

import static modelo.Usuario.comprobarIndiceUser;
import static modelo.Usuario.hardcodeados;

public class Ventana2 extends javax.swing.JFrame {

    public static String nombre_Usuario;

    public Ventana2(String nombre_usr) {
        initComponents();
        nombre_Usuario = nombre_usr;
        logCorrectoLbl.setText(nombre_usr + " " + logCorrectoLbl.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_2 = new javax.swing.JPanel();
        bienvenido_lbl = new javax.swing.JLabel();
        cerrarSesion_button = new javax.swing.JButton();
        logCorrectoLbl = new javax.swing.JLabel();
        nuevacuenta_button_ventana2 = new javax.swing.JButton();
        imagen_ventana2 = new javax.swing.JLabel();
        modificarPasswd_butonV1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenido_lbl.setText("BIENVENID@");

        cerrarSesion_button.setText("Cerrar sesion");
        cerrarSesion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_buttonActionPerformed(evt);
            }
        });

        logCorrectoLbl.setText("se ha logueado correctamente.");

        nuevacuenta_button_ventana2.setText("Agregar nueva cuenta de usuario");
        nuevacuenta_button_ventana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevacuenta_button_ventana2ActionPerformed(evt);
            }
        });

        imagen_ventana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Designer1.png"))); // NOI18N

        modificarPasswd_butonV1.setText("Modificar contraseña");
        modificarPasswd_butonV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPasswd_butonV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(logCorrectoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(bienvenido_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(imagen_ventana2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrarSesion_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevacuenta_button_ventana2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(modificarPasswd_butonV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenido_lbl)
                .addGap(18, 18, 18)
                .addComponent(imagen_ventana2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logCorrectoLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevacuenta_button_ventana2)
                .addGap(18, 18, 18)
                .addComponent(cerrarSesion_button)
                .addGap(14, 14, 14)
                .addComponent(modificarPasswd_butonV1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_buttonActionPerformed
        Ventana1 ventana1 = new Ventana1();

        ventana1.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_cerrarSesion_buttonActionPerformed

    private void nuevacuenta_button_ventana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevacuenta_button_ventana2ActionPerformed
        Ventana_new_Users ventana3 = new Ventana_new_Users();
        ventana3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevacuenta_button_ventana2ActionPerformed

    private void modificarPasswd_butonV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPasswd_butonV1ActionPerformed
        Ventana_Mod_Password ventanaPasswd = new Ventana_Mod_Password(hardcodeados.get(comprobarIndiceUser(nombre_Usuario)));
        ventanaPasswd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarPasswd_butonV1ActionPerformed

    public static void main(String args[]) {
        String nombreUsuario;
        if (args.length > 0) {
            nombreUsuario = args[0];
        } else {
            nombreUsuario = "Usuario";
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2(nombreUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido_lbl;
    private javax.swing.JButton cerrarSesion_button;
    private javax.swing.JLabel imagen_ventana2;
    private javax.swing.JLabel logCorrectoLbl;
    private javax.swing.JButton modificarPasswd_butonV1;
    private javax.swing.JButton nuevacuenta_button_ventana2;
    private javax.swing.JPanel panel_2;
    // End of variables declaration//GEN-END:variables
}
