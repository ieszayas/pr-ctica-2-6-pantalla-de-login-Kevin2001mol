package vistacontrolador;

import static BBDD.BBDD.agregarUsuarios;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import static java.awt.Color.RED;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import modelo.Usuario;
import static modelo.Usuario.comprobarUserExistente;
import static modelo.Usuario.esMayorDeEdad;
import static modelo.Usuario.hardcodeados;
import static modelo.Usuario.validarContrasena;
import static vistacontrolador.Ventana1.passwordToString;

public class Ventana_new_Users extends javax.swing.JFrame {

    private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN, 1);
    public static Border bordeRojo = BorderFactory.createLineBorder(Color.RED, 2);
    public static Border bordeNormal = BorderFactory.createLineBorder(Color.GRAY, 0);

    public Ventana_new_Users() {

        initComponents();
        hacerVisibleNewUsers(false);
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
        fecha_nac_calendario = new com.toedter.calendar.JDateChooser();
        mostrar_contra_v3 = new javax.swing.JCheckBox();
        requisitosContraseña_lbl = new javax.swing.JLabel();
        requisitosContraseña2_lbl = new javax.swing.JLabel();

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
        texto_nombre_ventanaNewUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_nombre_ventanaNewUsersKeyReleased(evt);
            }
        });

        texto_apellidos_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_apellidos_ventanaNewUsersActionPerformed(evt);
            }
        });
        texto_apellidos_ventanaNewUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_apellidos_ventanaNewUsersKeyReleased(evt);
            }
        });

        texto_contraseña_ventanaNewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_contraseña_ventanaNewUsersActionPerformed(evt);
            }
        });
        texto_contraseña_ventanaNewUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_contraseña_ventanaNewUsersKeyReleased(evt);
            }
        });

        texto_confirmarContraseña_ventanaNewUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_confirmarContraseña_ventanaNewUsersKeyReleased(evt);
            }
        });

        mostrar_contra_v3.setText("Mostrar");
        mostrar_contra_v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_contra_v3ActionPerformed(evt);
            }
        });

        requisitosContraseña_lbl.setText("La contraseña debera tener al menos: ");

        requisitosContraseña2_lbl.setText("Una mayúscula, un número, un carácter especial y ocho caracteres");

        javax.swing.GroupLayout PanelVentanaNewUsersLayout = new javax.swing.GroupLayout(PanelVentanaNewUsers);
        PanelVentanaNewUsers.setLayout(PanelVentanaNewUsersLayout);
        PanelVentanaNewUsersLayout.setHorizontalGroup(
            PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidos_lbl_ventanaNewUsers)
                            .addComponent(Volver_button_ventanaNewUsers)
                            .addComponent(fecha_nac_lbl_ventanaNewUsers)
                            .addComponent(nombre_lbl_ventanaNewUsers)
                            .addComponent(correo_lbl_ventanaNewUsers))
                        .addGap(54, 54, 54)
                        .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fecha_nac_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto_nombre_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto_apellidos_ventanaNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(texto_correo_ventanaNewUsers))
                            .addComponent(agregar_button_ventanaNewUsers)))
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
                                    .addComponent(texto_confirmarContraseña_ventanaNewUsers)
                                    .addComponent(texto_contraseña_ventanaNewUsers)))
                            .addComponent(requisitosContraseña2_lbl))
                        .addGap(18, 18, 18)
                        .addComponent(mostrar_contra_v3))
                    .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(datosAdicionales_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(requisitosContraseña_lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseña_lbl_ventanaNewUsers)
                            .addComponent(texto_contraseña_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVentanaNewUsersLayout.createSequentialGroup()
                        .addComponent(mostrar_contra_v3)
                        .addGap(1, 1, 1)))
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarContraseña_lbl)
                    .addComponent(texto_confirmarContraseña_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requisitosContraseña_lbl)
                .addGap(10, 10, 10)
                .addComponent(requisitosContraseña2_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datosAdicionales_lbl)
                .addGap(33, 33, 33)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_lbl_ventanaNewUsers)
                    .addComponent(texto_correo_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_lbl_ventanaNewUsers))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellidos_lbl_ventanaNewUsers)
                    .addComponent(texto_apellidos_ventanaNewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha_nac_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_nac_lbl_ventanaNewUsers))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaNewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_button_ventanaNewUsers)
                    .addComponent(agregar_button_ventanaNewUsers))
                .addContainerGap(54, Short.MAX_VALUE))
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
            .addComponent(PanelVentanaNewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String usuario = texto_user_ventanaNewUsers.getText();
        Usuario user = obtenervalores();
        if (usuario.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El campo de usuario se encuentra vacio!", "Usuario Vacio", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El campo de contraseña se encuentra vacio!", "Contraseña Vacia", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!(password.equalsIgnoreCase(password_confirm))) {//si las contraseñas no coinciden
            JOptionPane.showMessageDialog(this, "La contraseña no se corresponde con la confirmacion de la contraseña!", "Confirmacion de contraseña erroena ", JOptionPane.ERROR_MESSAGE);
            resetearValoresContraseña();
            return;
        }
        if (!validarContrasena(password)) {
            JOptionPane.showMessageDialog(this, "La contraseña no cumple con los requisitos esperados!", "Contraseña débil", JOptionPane.ERROR_MESSAGE);
            resetearValoresContraseña();
            return;
        }
        if (texto_correo_ventanaNewUsers.getBorder() == bordeRojo) {
            JOptionPane.showMessageDialog(this, "El correo no tiene un formato adecuado!", "Correo erroneo ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (texto_nombre_ventanaNewUsers.getBorder() == bordeRojo) {
            JOptionPane.showMessageDialog(this, "El nombre no puede contener caracteres numéricos!", "Nombre erroneo ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (texto_apellidos_ventanaNewUsers.getBorder() == bordeRojo) {
            JOptionPane.showMessageDialog(this, "Los apellidos no tienen un formato adecuado!", "Apellidos erroneos ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (user.getFecha_nac() != null) {
            if (!esFechaFutura(fecha_nac_calendario)) {
                if (!esMayorDeEdad(user.getFecha_nac())) {
                    JOptionPane.showMessageDialog(this, "Los menores de edad no pueden suscribirse!", "Minoría de edad", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "No puedes introducir fechas que estan por pasar!", "Fecha erronea", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }

        if (!comprobarUserExistente(user)) {
            JOptionPane.showMessageDialog(this, "El usuario que intentas agregar ya existe!", "Usuario Existente", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (agregarUsuarios(user)) {
            hardcodeados.add(user);
            JOptionPane.showMessageDialog(this, "Usuario añadido correctamente!", "BBDD", JOptionPane.INFORMATION_MESSAGE);
            Ventana1 ventana1 = new Ventana1();
            ventana1.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "El usuario no ha podido crearse en la base de datos!", "BBDD", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_agregar_button_ventanaNewUsersActionPerformed
    public Usuario obtenervalores() {

        String password = passwordToString(texto_contraseña_ventanaNewUsers);
        String password_confirm = passwordToString(texto_confirmarContraseña_ventanaNewUsers);
        Date fecha_nac = fecha_nac_calendario.getDate();
        String usuario = texto_user_ventanaNewUsers.getText();
        String correo = texto_correo_ventanaNewUsers.getText();
        String nombre = texto_nombre_ventanaNewUsers.getText();
        String apellidos = texto_apellidos_ventanaNewUsers.getText();

        return new Usuario(usuario, correo, nombre, apellidos, password, fecha_nac);

    }

    public boolean esFechaFutura(JDateChooser fechaCalendario) {
        Date fechaSeleccionada = fechaCalendario.getDate();
        // Obtener la fecha actual
        Date fechaActual = new Date();
        // si la fecha que me mete es del futuro le mete un true y si no, es false
        return fechaSeleccionada.after(fechaActual);
    }

    public void resetearValoresContraseña() {
        texto_contraseña_ventanaNewUsers.setText("");
        texto_confirmarContraseña_ventanaNewUsers.setText("");
    }
    private void texto_user_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_user_ventanaNewUsersActionPerformed

    }//GEN-LAST:event_texto_user_ventanaNewUsersActionPerformed

    private void texto_correo_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_correo_ventanaNewUsersActionPerformed

    }//GEN-LAST:event_texto_correo_ventanaNewUsersActionPerformed

    private void texto_nombre_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nombre_ventanaNewUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nombre_ventanaNewUsersActionPerformed

    private void texto_apellidos_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_apellidos_ventanaNewUsersActionPerformed

    }//GEN-LAST:event_texto_apellidos_ventanaNewUsersActionPerformed

    private void texto_correo_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_correo_ventanaNewUsersKeyReleased
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!(texto_correo_ventanaNewUsers.getText().matches(regex))) {

            texto_correo_ventanaNewUsers.setBorder(bordeRojo);
        }
        if ((texto_correo_ventanaNewUsers.getText().matches(regex))) {

            texto_correo_ventanaNewUsers.setBorder(bordeVerde);
        }
    }//GEN-LAST:event_texto_correo_ventanaNewUsersKeyReleased

    private void texto_contraseña_ventanaNewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_contraseña_ventanaNewUsersActionPerformed

    }//GEN-LAST:event_texto_contraseña_ventanaNewUsersActionPerformed

    private void texto_confirmarContraseña_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_confirmarContraseña_ventanaNewUsersKeyReleased
        String password = passwordToString(texto_contraseña_ventanaNewUsers);
        String password_confirmar = passwordToString(texto_confirmarContraseña_ventanaNewUsers);

        Border rojo = BorderFactory.createLineBorder(Color.RED, 2);
        if (!(password_confirmar.equalsIgnoreCase(password))) {
            texto_confirmarContraseña_ventanaNewUsers.setBorder(rojo);
        } else {
            texto_confirmarContraseña_ventanaNewUsers.setBorder(texto_apellidos_ventanaNewUsers.getBorder());
        }
    }//GEN-LAST:event_texto_confirmarContraseña_ventanaNewUsersKeyReleased

    private void mostrar_contra_v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_contra_v3ActionPerformed
        if (mostrar_contra_v3.isSelected()) {
            texto_confirmarContraseña_ventanaNewUsers.setEchoChar((char) 0);
            texto_contraseña_ventanaNewUsers.setEchoChar((char) 0);

        } else {
            texto_confirmarContraseña_ventanaNewUsers.setEchoChar('*');
            texto_contraseña_ventanaNewUsers.setEchoChar('*');
        }

    }//GEN-LAST:event_mostrar_contra_v3ActionPerformed

    private void texto_nombre_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_nombre_ventanaNewUsersKeyReleased
        if (!texto_nombre_ventanaNewUsers.getText().matches("[a-zA-Z]*")) {

            texto_nombre_ventanaNewUsers.setBorder(bordeRojo);
        } else {

            texto_nombre_ventanaNewUsers.setBorder(bordeNormal);
        }
    }//GEN-LAST:event_texto_nombre_ventanaNewUsersKeyReleased

    private void texto_apellidos_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_apellidos_ventanaNewUsersKeyReleased
        String texto = texto_apellidos_ventanaNewUsers.getText();
        String textoNormalizado = texto.replaceAll("\\s+", " "); // Normaliza los espacios

        // Actualiza el texto en el JTextField en tiempo real haciendo que si va a poner mas de un espacio no se los ponga
        if (!texto.equals(textoNormalizado)) {
            texto_apellidos_ventanaNewUsers.setText(textoNormalizado);
            // Coloca el cursor al final del texto
            texto_apellidos_ventanaNewUsers.setCaretPosition(textoNormalizado.length());
        }

        if (textoNormalizado.matches("[a-zA-Z ]*")) {
            texto_apellidos_ventanaNewUsers.setBorder(bordeNormal);
        } else {
            texto_apellidos_ventanaNewUsers.setBorder(bordeRojo);
        }
    }//GEN-LAST:event_texto_apellidos_ventanaNewUsersKeyReleased

    private void texto_contraseña_ventanaNewUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_contraseña_ventanaNewUsersKeyReleased
        String passwd = passwordToString(texto_contraseña_ventanaNewUsers);
        if (passwd.equalsIgnoreCase("")) {
            texto_contraseña_ventanaNewUsers.setBorder(bordeNormal);
            hacerVisibleNewUsers(false);
        } else {
            if (!validarContrasena(passwd)) {
                texto_contraseña_ventanaNewUsers.setBorder(bordeRojo);//avisar de que la contra tiene requisitos
                hacerVisibleNewUsers(true);
            } else {
                texto_contraseña_ventanaNewUsers.setBorder(bordeNormal);
                hacerVisibleNewUsers(false);
            }
        }

    }//GEN-LAST:event_texto_contraseña_ventanaNewUsersKeyReleased
    public void hacerVisibleNewUsers(boolean esVisible) {
        if (esVisible) {
            requisitosContraseña_lbl.setVisible(true);
            requisitosContraseña2_lbl.setVisible(true);
        } else {
            requisitosContraseña_lbl.setVisible(false);
            requisitosContraseña2_lbl.setVisible(false);
        }

    }

    public static void main(String args[]) {

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
    private com.toedter.calendar.JDateChooser fecha_nac_calendario;
    private javax.swing.JLabel fecha_nac_lbl_ventanaNewUsers;
    private javax.swing.JLabel infoEsencial_lbl;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JCheckBox mostrar_contra_v3;
    private javax.swing.JLabel nombre_lbl_ventanaNewUsers;
    private javax.swing.JLabel requisitosContraseña2_lbl;
    private javax.swing.JLabel requisitosContraseña_lbl;
    private javax.swing.JTextField texto_apellidos_ventanaNewUsers;
    private javax.swing.JPasswordField texto_confirmarContraseña_ventanaNewUsers;
    private javax.swing.JPasswordField texto_contraseña_ventanaNewUsers;
    private javax.swing.JTextField texto_correo_ventanaNewUsers;
    private javax.swing.JTextField texto_nombre_ventanaNewUsers;
    private javax.swing.JTextField texto_user_ventanaNewUsers;
    private javax.swing.JLabel usuario_lbl_ventanaNewUsers;
    // End of variables declaration//GEN-END:variables
}
