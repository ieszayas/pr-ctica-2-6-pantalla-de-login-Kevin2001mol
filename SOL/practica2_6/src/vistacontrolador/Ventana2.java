package vistacontrolador;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2(String nombre_usr) {
        initComponents();

        bienvenido_lbl.setText(bienvenido_lbl.getText() + " " + nombre_usr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_2 = new javax.swing.JPanel();
        bienvenido_lbl = new javax.swing.JLabel();
        cerrarSesion_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenido_lbl.setText("BIENVENID@");

        cerrarSesion_button.setText("Cerrar sesion");

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
                .addContainerGap(162, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenido_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel panel_2;
    // End of variables declaration//GEN-END:variables
}
