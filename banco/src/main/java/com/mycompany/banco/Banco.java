package com.mycompany.banco;

/**
 *
 * @autor osval
 */
public class Banco {
    public boolean verificarPago(String numeroTarjeta, double monto, String vcc, String fechaCaducidad) {
        if (!validarNumeroTarjeta(numeroTarjeta)) {
            System.out.println("Número de tarjeta inválido. El pago no puede ser verificado.");
            return false;
        }

        if (!validarMonto(monto)) {
            System.out.println("Monto inválido. El pago no puede ser verificado.");
            return false;
        }

        if (!validarVCC(vcc)) {
            System.out.println("Código VCC inválido. El pago no puede ser verificado.");
            return false;
        }

        if (!validarFechaCaducidad(fechaCaducidad)) {
            System.out.println("Fecha de caducidad inválida. El pago no puede ser verificado.");
            return false;
        }

        System.out.println("Pago verificado correctamente.");
        return true;
    }

    private boolean validarNumeroTarjeta(String numeroTarjeta) {
        return numeroTarjeta != null && !numeroTarjeta.isEmpty() && numeroTarjeta.matches("\\d{16}");
    }

    private boolean validarMonto(double monto) {
        return monto > 0;
    }

    private boolean validarVCC(String vcc) {
        return vcc != null && !vcc.isEmpty() && vcc.matches("\\d{3}");
    }

    private boolean validarFechaCaducidad(String fechaCaducidad) {
        if (fechaCaducidad == null || !fechaCaducidad.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            return false;
        }

        String[] partes = fechaCaducidad.split("/");
        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]) + 2000;

        // Obtener el año y mes actuales
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int mesActual = cal.get(java.util.Calendar.MONTH) + 1;
        int anoActual = cal.get(java.util.Calendar.YEAR);

        // La tarjeta es válida si la fecha de caducidad es posterior a la fecha actual
        return ano > anoActual || (ano == anoActual && mes >= mesActual);
    }
}
