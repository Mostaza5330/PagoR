/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DAOs.PagoDAO;
import entity.Pago;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Confirmacion extends javax.swing.JFrame {

    private PagoDAO pagoDAO;
    private Pago pago;
    private String noOrden;

    public Confirmacion(PagoDAO pagoDAO, Pago pago, String noOrden) {
        initComponents();
        this.pagoDAO = pagoDAO;
        this.pago = pago;
        this.noOrden = noOrden;
        transparenciaBtn();
        setLocationRelativeTo(null);

        txtNoOrden.setText(noOrden);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAceptar = new javax.swing.JButton();
        txtNoOrden = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 90));

        txtNoOrden.setEditable(false);
        txtNoOrden.setBackground(new java.awt.Color(0, 0, 255));
        txtNoOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        txtNoOrden.setForeground(new java.awt.Color(255, 255, 255));
        txtNoOrden.setText("#");
        txtNoOrden.setBorder(null);
        getContentPane().add(txtNoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 70));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_Confirmado.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked
        dispose();

        DefaultTableModel modeloTabla = (DefaultTableModel) pago.getTablaPago().getModel();

        int filaSeleccionada = pago.getTablaPago().getSelectedRow();

        if (filaSeleccionada != -1) {
            modeloTabla.removeRow(filaSeleccionada);

            // Crear el objeto Pago y guardarlo usando el DAO
            double monto = 0.0; // Aquí debes obtener el valor correcto de monto
            String descripcion = ""; // Aquí debes obtener el valor correcto de descripción

            Pago nuevoPago = new Pago(0, monto, descripcion); // El ID se asignará automáticamente
            pagoDAO.crearPago(nuevoPago);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
        }

        pago.setVisible(true);

    }//GEN-LAST:event_BtnAceptarMouseClicked
    public void transparenciaBtn() {
        BtnAceptar.setOpaque(false);
        BtnAceptar.setContentAreaFilled(false);
        BtnAceptar.setBorderPainted(false);
        txtNoOrden.setOpaque(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField txtNoOrden;
    // End of variables declaration//GEN-END:variables
}
