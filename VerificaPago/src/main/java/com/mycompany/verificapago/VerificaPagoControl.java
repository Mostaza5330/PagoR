package com.mycompany.verificapago;

/**
 *
 * @author osval
 */
public class VerificaPagoControl {
    private IVerificaPago verificador;

    // Constructor que recibe una instancia de IVerificaPago
    public VerificaPagoControl(IVerificaPago verificador) {
        this.verificador = verificador;
    }

    // Método para iniciar la verificación de un pago
    public boolean iniciarVerificacion(String numeroTarjeta, double monto, String vcc, String fechaCaducidad) {
        return verificador.verificarPago(numeroTarjeta, monto, vcc, fechaCaducidad);
    }
}
