package Tarjeta;

/**
 *
 * @author osval
 */
public class VerificaTarjetaControl {
    private IVerificaTarjeta verificador;

    // Constructor que recibe una instancia de IVerificaPago
    public VerificaTarjetaControl(IVerificaTarjeta verificador) {
        this.verificador = verificador;
    }

    // Método para iniciar la verificación de un pago
    public boolean iniciarVerificacion(String numeroTarjeta, double monto, String vcc, String fechaCaducidad) {
        return verificador.verificarTarjeta(numeroTarjeta, monto, vcc, fechaCaducidad);
    }
}
