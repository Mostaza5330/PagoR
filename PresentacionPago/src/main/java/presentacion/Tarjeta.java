package presentacion;

import DAOs.OrdenDAO;
import DAOs.PagoDAO;
import Tarjeta.IVerificaTarjeta;
import Tarjeta.VerificaTarjeta;
import entity.Orden;
import entity.Pago;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Tarjeta extends javax.swing.JFrame {

    private Orden orden;
    private OrdenDAO ordenDAO;
    private PagoDAO pagoDAO;
    private IVerificaTarjeta iVerificaPago;

    public Tarjeta(Orden orden) {
        initComponents();
        transparenciaBtn();
        this.orden = orden;this.pagoDAO = new PagoDAO();
        this.iVerificaPago = new VerificaTarjeta(); // Suponiendo que VerificaPago implementa IVerificaPago
        setLocationRelativeTo(null);
        

        txtNoOrden.setText(String.valueOf(orden.getId()));
        txtMesa.setText(String.valueOf(orden.getMesa()));
        txtPlatillos.setText(orden.getPlatillos().toString()); // Ajustar según la estructura de detalles
        txtTotal.setText(String.valueOf(orden.getTotal()));
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
        jLabel1 = new javax.swing.JLabel();
        TxtNumeroTarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtFechaCaducidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtCVV = new javax.swing.JTextField();
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tarjeta:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(TxtNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MM/AA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel2.add(TxtFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CVV");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        jPanel2.add(TxtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 210, 90));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_TAR.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
        new PagoInicio().setVisible(true);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked
        String numeroTarjeta = TxtNumeroTarjeta.getText().trim();
        String fechaCaducidad = TxtFechaCaducidad.getText().trim();
        String cvv = TxtCVV.getText().trim();

        if (numeroTarjeta.isEmpty() || fechaCaducidad.isEmpty() || cvv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos de tarjeta.");
            return;
        }

        if (!numeroTarjeta.matches("\\d{16}")) {
            JOptionPane.showMessageDialog(this, "Número de tarjeta inválido. Debe contener 16 dígitos.");
            return;
        }

        if (!fechaCaducidad.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Fecha de caducidad inválida. Debe ser MM/AA.");
            return;
        }

        if (!cvv.matches("\\d{3}")) {
            JOptionPane.showMessageDialog(this, "CVV inválido. Debe contener 3 dígitos.");
            return;
        }

        try {
            double monto = orden.getTotal();

            boolean pagoVerificado = iVerificaPago.verificarTarjeta(numeroTarjeta, monto, cvv, fechaCaducidad);

            if (pagoVerificado) {
                Pago nuevoPago = new Pago(0, (float) monto,"Tarjeta", "Pago de orden " + orden.getId(), "2023-06-28"); // Ajustar fecha
                pagoDAO.agregarPago(nuevoPago);

              //  Confirmacion confirmacion = new Confirmacion(pagoDAO, nuevoPago, String.valueOf(orden.getId()));

                //confirmacion.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Pago no verificado. Verifique los datos de la tarjeta.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el formato del monto.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear el pago: " + ex.getMessage());
        }

    }//GEN-LAST:event_BtnAceptarMouseClicked

    private void txtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyPressed
        char enter = (char) evt.getKeyCode();

        if (enter == evt.VK_ENTER) {
            float precioTotal = Float.parseFloat(txtTotal.getText());
            float pagoCliente = Float.parseFloat(txtPago.getText());
        }
    }//GEN-LAST:event_txtPagoKeyPressed
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
    private javax.swing.JTextField TxtCVV;
    private javax.swing.JTextField TxtFechaCaducidad;
    private javax.swing.JTextField TxtNumeroTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMesa;
    private javax.swing.JTextField txtNoOrden;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPlatillos;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
