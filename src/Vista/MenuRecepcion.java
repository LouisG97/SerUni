package Vista;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j_k_h
 */
public class MenuRecepcion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public MenuRecepcion() {
        initComponents();
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes/icono.jpeg")).getImage());
        this.setResizable(false);
    }
    
    String nombre="", prioridad="", usuario="", area="", contraseña="";
    int accion=1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnVoluntarios = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jlArea = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Ponguinguiola Chico.png"))); // NOI18N

        jlUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlUsuario.setText("Usuario: Admin");

        btnCerrarSesion.setBackground(new java.awt.Color(10, 76, 142));
        btnCerrarSesion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Volver");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(10, 76, 142));
        btnClientes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnCitas.setBackground(new java.awt.Color(10, 76, 142));
        btnCitas.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setText("Citas");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnVoluntarios.setBackground(new java.awt.Color(10, 76, 142));
        btnVoluntarios.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnVoluntarios.setForeground(new java.awt.Color(255, 255, 255));
        btnVoluntarios.setText("Voluntarios");
        btnVoluntarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoluntariosActionPerformed(evt);
            }
        });

        btnServicios.setBackground(new java.awt.Color(10, 76, 142));
        btnServicios.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(10, 76, 142));
        btnReportes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jlArea.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlArea.setText("Recepción");

        btnInventario.setBackground(new java.awt.Color(10, 76, 142));
        btnInventario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoluntarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlArea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                        .addComponent(jlUsuario)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnCitas)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoluntarios)
                        .addGap(18, 18, 18)
                        .addComponent(btnServicios)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportes)
                        .addGap(18, 18, 18)
                        .addComponent(btnInventario)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarSesion)
                        .addGap(79, 79, 79))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        CitasArea u = new CitasArea();
        u.setVisible(true);
        u.datos(nombre,prioridad,usuario,area,contraseña);
        u.iniciar();
        this.dispose();
    }//GEN-LAST:event_btnCitasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        ClientesArea u = new ClientesArea();
        u.setVisible(true);
        u.iniciar();
        u.datos(nombre,prioridad,usuario,area,contraseña);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        if(accion==1){
            MenuAreas menu = new MenuAreas();
            menu.setVisible(true);
            menu.datos(nombre,prioridad,usuario,area,contraseña);
            menu.areas();
            this.dispose();
        }
        else{
            new IniciarSesion().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVoluntariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoluntariosActionPerformed
        VoluntariadoArea u = new VoluntariadoArea();
        u.setVisible(true);
        u.datos(nombre,prioridad,usuario,area,contraseña);
        u.iniciar();
        this.dispose();
    }//GEN-LAST:event_btnVoluntariosActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        ServiciosArea u = new ServiciosArea();
        u.setVisible(true);
        u.datos(nombre,prioridad,usuario,area,contraseña);
        u.iniciar();
        this.dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        InventariosArea u = new InventariosArea();
        u.setVisible(true);
        u.datos(nombre,prioridad,usuario,area,contraseña);
        u.iniciar();
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed
    
    public void datos(String n, String p, String u, String a, String c){
        nombre=n;
        prioridad=p;
        usuario=u;
        area=a;
        contraseña=c;
        usu();
    }
    public void usu(){
        jlUsuario.setText("Usuario: "+nombre);
        jlArea.setText(area);
        if(prioridad.compareTo("1")==0){
            btnCerrarSesion.setText("Volver");
        }
        else{
            btnCerrarSesion.setText("Cerrar Sesión");
        }
        if(btnCerrarSesion.getText()=="Volver"){
            accion=1;
        }
        else{
            accion=2;
        }
    }
    
    public void usuAdmin(String texto){
        jlUsuario.setText("Usuario: "+nombre);
        jlArea.setText(texto);
        if(prioridad.compareTo("1")==0){
            btnCerrarSesion.setText("Volver");
        }
        else{
            btnCerrarSesion.setText("Cerrar Sesión");
        }
        if(btnCerrarSesion.getText()=="Volver"){
            accion=1;
        }
        else{
            accion=2;
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRecepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnVoluntarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlArea;
    private javax.swing.JLabel jlUsuario;
    // End of variables declaration//GEN-END:variables
}
