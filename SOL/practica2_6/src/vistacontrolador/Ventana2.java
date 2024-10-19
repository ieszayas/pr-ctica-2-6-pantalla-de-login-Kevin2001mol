package vistacontrolador;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2(String nombre_usr) {
        initComponents();

        logCorrectoLbl.setText(nombre_usr + " " + logCorrectoLbl.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_2 = new javax.swing.JPanel();
        bienvenido_lbl = new javax.swing.JLabel();
        cerrarSesion_button = new javax.swing.JButton();
        logCorrectoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenido_lbl.setText("BIENVENID@");

        cerrarSesion_button.setText("Cerrar sesion");
        cerrarSesion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_buttonActionPerformed(evt);
            }
        });

        logCorrectoLbl.setText("se ha logueado correctamente.");

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion_button)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bienvenido_lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(logCorrectoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenido_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(logCorrectoLbl)
                .addGap(40, 40, 40)
                .addComponent(cerrarSesion_button)
                .addGap(50, 50, 50))
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

        this.dispose();//cerrar la ventana 2
    }//GEN-LAST:event_cerrarSesion_buttonActionPerformed

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
    private javax.swing.JLabel logCorrectoLbl;
    private javax.swing.JPanel panel_2;
    // End of variables declaration//GEN-END:variables
}
