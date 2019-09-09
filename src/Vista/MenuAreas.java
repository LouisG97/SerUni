package Vista;

import Control.SQL;
import Modelo.AreasC;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j_k_h
 */
public class MenuAreas extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public MenuAreas() {
        initComponents();
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes/icono.jpeg")).getImage());
        this.setResizable(false);
    }
    
    String nombre="", prioridad="", usuario="", area="", contraseña="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btnInstitucion2 = new javax.swing.JButton();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Area", "Telefono", "Extension", "Encargado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Ponguinguiola Chico.png"))); // NOI18N

        jlUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlUsuario.setText("Usuario: Admin");

        btnVolver.setBackground(new java.awt.Color(10, 76, 142));
        btnVolver.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Áreas");

        btn9.setBackground(new java.awt.Color(10, 76, 142));
        btn9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("-");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(10, 76, 142));
        btn1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("-");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(10, 76, 142));
        btn10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.setText("-");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(10, 76, 142));
        btn2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("-");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(10, 76, 142));
        btn3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("-");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(10, 76, 142));
        btn4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("-");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(10, 76, 142));
        btn8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("-");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(10, 76, 142));
        btn6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("-");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(10, 76, 142));
        btn7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("-");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(10, 76, 142));
        btn5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("-");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(10, 76, 142));
        btn13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn13.setForeground(new java.awt.Color(255, 255, 255));
        btn13.setText("-");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(10, 76, 142));
        btn12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn12.setForeground(new java.awt.Color(255, 255, 255));
        btn12.setText("-");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(10, 76, 142));
        btn11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn11.setForeground(new java.awt.Color(255, 255, 255));
        btn11.setText("-");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(217, 217, 217))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn1)
                .addGap(18, 18, 18)
                .addComponent(btn2)
                .addGap(18, 18, 18)
                .addComponent(btn3)
                .addGap(18, 18, 18)
                .addComponent(btn4)
                .addGap(18, 18, 18)
                .addComponent(btn5)
                .addGap(18, 18, 18)
                .addComponent(btn6)
                .addGap(18, 18, 18)
                .addComponent(btn7)
                .addGap(18, 18, 18)
                .addComponent(btn8)
                .addGap(18, 18, 18)
                .addComponent(btn9)
                .addGap(18, 18, 18)
                .addComponent(btn10)
                .addGap(18, 18, 18)
                .addComponent(btn11)
                .addGap(18, 18, 18)
                .addComponent(btn12)
                .addGap(18, 18, 18)
                .addComponent(btn13)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        btnInstitucion2.setBackground(new java.awt.Color(10, 76, 142));
        btnInstitucion2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnInstitucion2.setForeground(new java.awt.Color(255, 255, 255));
        btnInstitucion2.setText("Agregar un área");
        btnInstitucion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitucion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInstitucion2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVolver)
                        .addComponent(btnInstitucion2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String textoBoton = btn5.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn5.getText());
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String textoBoton = btn7.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn7.getText());
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String textoBoton = btn6.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn6.getText());
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String textoBoton = btn8.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn8.getText());
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String textoBoton = btn4.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn4.getText());
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String textoBoton = btn3.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn3.getText());
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String textoBoton = btn2.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn2.getText());
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        String textoBoton = btn10.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn10.getText());
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String textoBoton = btn1.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn1.getText());
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String textoBoton = btn9.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn9.getText());
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        menu.datos(nombre,prioridad,usuario,area,contraseña);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        String textoBoton = btn13.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn13.getText());
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        String textoBoton = btn12.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn12.getText());
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        String textoBoton = btn11.getText();
        if(textoBoton.compareTo("-")==0){
            JOptionPane.showMessageDialog(this, "No hay ningún área registrada en este apartado", "Pagina de error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Menu(btn11.getText());
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btnInstitucion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitucion2ActionPerformed
        AgregarArea a = new AgregarArea();
        a.setVisible(true);
        a.datos(nombre,prioridad,usuario,area,contraseña);
        a.iniciar();
        this.dispose();
    }//GEN-LAST:event_btnInstitucion2ActionPerformed

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
    }
    
    public void Menu(String texto){
        MenuRecepcion menu = new MenuRecepcion();
        menu.setVisible(true);
        menu.datos(nombre,prioridad,usuario,area,contraseña);
        menu.usuAdmin(texto);
        this.dispose();
    }
    
    public void areas(){
        String s;
        AreasC n = new AreasC();
        try{
        s = n.buscarID("nombreDelArea","");
        n.cargarDatos(SQL.ejecutaQ(s, this,0),(DefaultTableModel)tabla.getModel());
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Problema de captura", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        btn1.setText(tabla.getValueAt(0, 0)+"");
        btn2.setText(tabla.getValueAt(1, 0)+"");
        btn3.setText(tabla.getValueAt(2, 0)+"");
        btn4.setText(tabla.getValueAt(3, 0)+"");
        btn5.setText(tabla.getValueAt(4, 0)+"");
        btn6.setText(tabla.getValueAt(5, 0)+"");
        btn7.setText(tabla.getValueAt(6, 0)+"");
        btn8.setText(tabla.getValueAt(7, 0)+"");
        btn9.setText(tabla.getValueAt(8, 0)+"");
        btn10.setText(tabla.getValueAt(9, 0)+"");
        if(tabla.getRowCount()>10){
            btn11.setText(tabla.getValueAt(10, 0)+"");
        }
        if(tabla.getRowCount()>11){
            btn12.setText(tabla.getValueAt(11, 0)+"");
        }
        if(tabla.getRowCount()>12){
            btn13.setText(tabla.getValueAt(12, 0)+"");
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
            java.util.logging.Logger.getLogger(MenuAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAreas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnInstitucion2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}