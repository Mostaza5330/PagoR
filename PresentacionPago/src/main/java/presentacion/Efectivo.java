/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entity.Orden;
import DAOs.OrdenDAO;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Efectivo extends javax.swing.JFrame {
/**
    private Orden orden;
    private OrdenDAO ordenDAO;

    public Efectivo(Orden orden, OrdenDAO ordenDAO) {
        initComponents();
        transparenciaBtn();
        setLocationRelativeTo(null);

        this.orden = orden;
        this.ordenDAO = ordenDAO;

        txtNoOrden.setText(String.valueOf(orden.getId()));
        txtTotal.setText(String.valueOf(orden.getTotal()));
        txtMesa.setText(String.valueOf(orden.getMesa()));
        txtPlatillos.setText(orden.getDetalles().toString()); // Modify as needed to show details
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAceptar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoOrden = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPlatillos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMesa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAceptarBtn.png"))); // NOI18N
        BtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAceptarBtn.png"))); // NOI18N
        BtnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/AceptarBtn.png"))); // NOI18N
        BtnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAceptarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, 90));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn.png"))); // NOI18N
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/atrasBtn.png"))); // NOI18N
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 170, 90));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Su pago:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        txtPago.setForeground(new java.awt.Color(255, 255, 255));
        txtPago.setText("               ");
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagoKeyPressed(evt);
            }
        });
        jPanel1.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No.Orden");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        txtNoOrden.setEditable(false);
        txtNoOrden.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 6, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Platillos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        txtPlatillos.setEditable(false);
        txtPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 34, 240, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mesa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        txtMesa.setEditable(false);
        txtMesa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 330, 110));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cambio:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel2.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 190, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_EF.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked
        //Aqui va un validador que revisa que el pago sea mayor que la cantidad del total de la tabla
    }//GEN-LAST:event_BtnAceptarMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
        new PagoInicio().setVisible(true);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void txtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            float precioTotal = Float.parseFloat(txtTotal.getText());
            float pagoCliente = Float.parseFloat(txtPago.getText());
            float vuelto;

            if (pagoCliente < precioTotal) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un monto mayor al total");
            } else {
                vuelto = pagoCliente - precioTotal;
                txtCambio.setText(String.valueOf(vuelto));
            }
        }
    }//GEN-LAST:event_txtPagoKeyPressed
    **/
     public void transparenciaBtn() {
        BtnAceptar.setOpaque(false);
        BtnAceptar.setContentAreaFilled(false);
        BtnAceptar.setBorderPainted(false);
        BtnSalir.setOpaque(false);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setBorderPainted(false);
        jPanel1.setOpaque(false);
        jPanel2.setOpaque(false);
        txtTotal.setOpaque(false);
        txtPlatillos.setOpaque(false);
        txtPago.setOpaque(false);
        txtNoOrden.setOpaque(false);
        txtMesa.setOpaque(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtMesa;
    private javax.swing.JTextField txtNoOrden;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPlatillos;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}