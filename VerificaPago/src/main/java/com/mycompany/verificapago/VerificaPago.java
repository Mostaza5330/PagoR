package com.mycompany.verificapago;

import com.mycompany.banco.Banco;

public class VerificaPago implements IVerificaPago {

    private Banco sistemaBanco;

    // Constructor que recibe el sistema del banco
    public VerificaPago(Banco sistemaBanco) {
        this.sistemaBanco = sistemaBanco;
    }

    // Constructor sin argumentos
    public VerificaPago() {
        this.sistemaBanco = new Banco(); // Crear una instancia de Banco por defecto
    }

    // Implementación del método de la interfaz
    @Override
    public boolean verificarPago(String numeroTarjeta, double monto, String vcc, String fechaCaducidad) {
        // Lógica para verificar el pago utilizando el sistema del banco
        return sistemaBanco.verificarPago(numeroTarjeta, monto, vcc, fechaCaducidad);
    }
}
