package vistacontrolador;

import static BBDD.BBDD.cargarUsuarios;
import static BBDD.BBDD.crearBaseDeDatos;
import static BBDD.BBDD.crearTablaUsuarios;
import static BBDD.BBDD.quiereContinuar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import modelo.Usuario;
import static modelo.Usuario.hardcodeados;
import static modelo.Usuario.recorrerUsers;

/*

-Se leen los datos de conexión de la BD de dicho fichero y no del código fuente
 */
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
        nuevaCuenta_button = new javax.swing.JButton();

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

        nuevaCuenta_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nuevaCuenta_button.setForeground(new java.awt.Color(51, 102, 255));
        nuevaCuenta_button.setText("Crear una nueva cuenta");
        nuevaCuenta_button.setBorderPainted(false);
        nuevaCuenta_button.setContentAreaFilled(false);
        nuevaCuenta_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevaCuenta_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevaCuenta_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevaCuenta_buttonMouseExited(evt);
            }
        });
        nuevaCuenta_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCuenta_buttonActionPerformed(evt);
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
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_lbl)
                            .addComponent(usuario_lbl))
                        .addGap(68, 68, 68)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_field, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nuevaCuenta_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(password_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(mostrar_ckbx)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loguear_button)
                .addGap(154, 154, 154))
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
                .addGap(18, 18, 18)
                .addComponent(nuevaCuenta_button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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
        String password = passwordToString(password_field);
        if (nombre_usr.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
            vibrarVentana(this, 9, 50);
            JOptionPane.showMessageDialog(this, "Usuario o contraseña vacios!", "Campo/s Vacio/s", HEIGHT);
            return;
        }
        if (existeUsr()) {
            Ventana2 ventana2 = new Ventana2(nombre_usr);// primero me la instancio y luego la hago visible
            ventana2.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_loguear_buttonActionPerformed
    public void vibrarVentana(JFrame frame, int intensidad, int duracion) {
        Point puntoOriginal = frame.getLocation();

        for (int i = 0; i < duracion; i++) {
            int x = puntoOriginal.x + (int) (Math.random() * intensidad) - (intensidad / 2);
            int y = puntoOriginal.y + (int) (Math.random() * intensidad) - (intensidad / 2);
            frame.setLocation(x, y);

            // Hacemos una pausa breve entre los movimientos
            try {
                Thread.sleep(20); // Pausa de 20 ms entre cada movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean existeUsr() {
        int indice = 0;
        boolean existe = false;
        for (int i = 0; i < hardcodeados.size(); i++) {
            if (hardcodeados.get(i).getUsuario().equalsIgnoreCase(usuario_field.getText())) {
                existe = true;
                break;
            }
            indice++;
        }

        if (existe) {
            if (comprobarPassword(usuario_field.getText(), indice)) {
                return true;
            } else {
                vibrarVentana(this, 9, 50);
                return false;
            }

        } else {
            vibrarVentana(this, 9, 50);
            JOptionPane.showMessageDialog(null, "¡El usuario que ha introducido no existe!");
            resetearValores();
            return false;
        }
    }

    public boolean comprobarPassword(String nombre_usr, int index) {
        if (hardcodeados.get(index).getPassword().equalsIgnoreCase(passwordToString(password_field))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            resetearValores();
            return false;
        }
    }

    public static String passwordToString(JPasswordField password) {
        char[] passwordChars = password.getPassword(); // Obtener la contraseña
        String password_resultante = new String(passwordChars);
        return password_resultante;
    }

    public void resetearValores() {
        usuario_field.setText("");
        password_field.setText("");
    }
    private void usuario_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_fieldActionPerformed

    }//GEN-LAST:event_usuario_fieldActionPerformed

    private void nuevaCuenta_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaCuenta_buttonActionPerformed

        Ventana_new_Users ventana3 = new Ventana_new_Users();
        ventana3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevaCuenta_buttonActionPerformed

    private void nuevaCuenta_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaCuenta_buttonMouseEntered
        nuevaCuenta_button.setText("<html><u>Crear una nueva cuenta</u></html>");
    }//GEN-LAST:event_nuevaCuenta_buttonMouseEntered

    private void nuevaCuenta_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaCuenta_buttonMouseExited
        nuevaCuenta_button.setText("Crear una nueva cuenta");
    }//GEN-LAST:event_nuevaCuenta_buttonMouseExited

    public static void main(String args[]) {
        crearBaseDeDatos();
        if (quiereContinuar) {
            hardcodeados = cargarUsuarios();
        } else {
            crearTablaUsuarios();
            hardcodeados = cargarUsuarios();

        }

        //recorrerUsers(hardcodeados);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loguear_button;
    private javax.swing.JCheckBox mostrar_ckbx;
    private javax.swing.JButton nuevaCuenta_button;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JLabel textoCredenciales_lbl;
    private javax.swing.JTextField usuario_field;
    private javax.swing.JLabel usuario_lbl;
    // End of variables declaration//GEN-END:variables
}
