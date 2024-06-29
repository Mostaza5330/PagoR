package presentacion;

import DAOs.OrdenDAO;
import entity.Orden;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PagoInicio extends javax.swing.JFrame {

    private OrdenDAO ordenDAO;

    public PagoInicio() {
        initComponents();
        transparenciaBtn();
        setLocationRelativeTo(null);
        this.ordenDAO = new OrdenDAO();
        cargarOrden();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEfectivo = new javax.swing.JButton();
        BtnTarjeta = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPago = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/efectivoBtn.png"))); // NOI18N
        BtnEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEfectivoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, 70));

        BtnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/tarjetaBtn.png"))); // NOI18N
        BtnTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTarjetaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 140, 70));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/atrasBtn2.png"))); // NOI18N
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 140, 70));

        TablaPago.setBackground(new java.awt.Color(51, 51, 51));
        TablaPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TablaPago.setForeground(new java.awt.Color(255, 255, 255));
        TablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.Orden", "Mesa", "Platillo", "Total", "Fecha y hora"
            }
        ));
        TablaPago.setGridColor(new java.awt.Color(102, 102, 102));
        TablaPago.setSelectionBackground(new java.awt.Color(117, 209, 255));
        jScrollPane1.setViewportView(TablaPago);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 310));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_Individual.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEfectivoMouseClicked

        int filaSeleccionada = TablaPago.getSelectedRow();

        if (filaSeleccionada != -1) {
            int ordenId = (int) TablaPago.getValueAt(filaSeleccionada, 0);
            try {
                Orden orden = ordenDAO.getOrden(ordenId);
                Efectivo efectivo = new Efectivo(orden);
                efectivo.setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar la orden: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
        }

    }//GEN-LAST:event_BtnEfectivoMouseClicked

    private void BtnTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTarjetaMouseClicked
        int filaSeleccionada = TablaPago.getSelectedRow();

        if (filaSeleccionada != -1) {
            int ordenId = (int) TablaPago.getValueAt(filaSeleccionada, 0);
            try {
                Orden orden = ordenDAO.getOrden(ordenId);
                Tarjeta tarjeta = new Tarjeta(orden);
                tarjeta.setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar la orden: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
        }


    }//GEN-LAST:event_BtnTarjetaMouseClicked

    public JTable getTablaPago() {
        return TablaPago;
    }

    public void transparenciaBtn() {
        BtnEfectivo.setOpaque(false);
        BtnEfectivo.setContentAreaFilled(false);
        BtnEfectivo.setBorderPainted(false);
        BtnSalir.setOpaque(false);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setBorderPainted(false);
        BtnTarjeta.setOpaque(false);
        BtnTarjeta.setContentAreaFilled(false);
        BtnTarjeta.setBorderPainted(false);
        TablaPago.setOpaque(false);
        jScrollPane1.setOpaque(false);
    }

    public void cargarOrden() {
        DefaultTableModel modelo = (DefaultTableModel) TablaPago.getModel();
        modelo.setRowCount(0);
        try {
            List<Orden> ordenes = ordenDAO.listarOrdenes();
            for (Orden orden : ordenes) {
                modelo.addRow(new Object[]{orden.getId(), orden.getMesa(), orden.getPlatillos(), orden.getTotal(), orden.getFecha()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las órdenes: " + e.getMessage());
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEfectivo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTarjeta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TablaPago;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
